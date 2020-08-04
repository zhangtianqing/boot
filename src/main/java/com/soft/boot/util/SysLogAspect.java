package com.soft.boot.util;

import com.alibaba.fastjson.JSON;
import com.soft.boot.annotation.SysLogAnnotation;
import com.soft.boot.domain.SysLog;
import com.soft.boot.service.LogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

/**
 * 系统日志：切面处理类 https://www.cnblogs.com/EarlyBridVic/p/12566453.html
 */
@Aspect
@Component
public class SysLogAspect {

    @Autowired
    private LogService sysLogService;

    //定义切点 @Pointcut
    //在注解的位置切入代码
    @Pointcut("@annotation( com.soft.boot.annotation.SysLogAnnotation)")
    public void logPoinCut() {
    }

    //切面 配置通知
    @AfterReturning(value="logPoinCut()")
    public void saveSysLog(JoinPoint joinPoint) {
        System.out.println("日志记录");

        HttpServletRequest request = ((HttpServletRequest)RequestContextHolder.getRequestAttributes().resolveReference(RequestAttributes.REFERENCE_REQUEST));

        //从切面织入点处通过反射机制获取织入点处的方法
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //获取切入点所在的方法
        Method method = signature.getMethod();

        //保存日志
        SysLog sysLog = new SysLog();

        //获取操作
        SysLogAnnotation myLog = method.getAnnotation(SysLogAnnotation.class);
        if (myLog != null) {
            String value = myLog.value();
            sysLog.setOPERATION(value);//保存获取的操作
        }

        //获取请求的类名
        String className = joinPoint.getTarget().getClass().getName();
        //获取请求的方法名
        String methodName = method.getName();
        sysLog.setMETHOD(className + "." + methodName);

        //请求的参数
        Object[] args = joinPoint.getArgs();
        //将参数所在的数组转换成json
        String params = JSON.toJSONString(args);
        sysLog.setPARAMS(params);

        sysLog.setCREATE_TIME(LocalDateTime.now());
        //获取用户名
        sysLog.setUSERNAME(SpringSecurityUtil.currentUser(request.getSession()));
        //获取用户ip地址
        sysLog.setIP(ServletUtil.getIpAddr());

        //调用service保存SysLog实体类到数据库
        sysLogService.create(sysLog);
    }

}
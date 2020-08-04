package com.soft.boot.controller;

import com.soft.boot.domain.SysUser;
import com.soft.boot.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    public UserService userService;

    @PostMapping("/register")
    @ResponseBody
    public int register(@RequestBody SysUser sysUser){
        return userService.create(sysUser);
    }

    @PostMapping("/beanTest")
    @ResponseBody
    public SysUser beanTest(@RequestBody HashMap<String,Object> map){
        System.out.println(map);
        SysUser sysUser=new SysUser();
        BeanUtils.copyProperties(sysUser,map);
        System.out.println(sysUser);
        //return userService.create(sysUser);
        return sysUser;
    }

    @GetMapping("/select")
    @ResponseBody
    public SysUser simple(@RequestParam("id") long key){
        return userService.getByKey(key);
    }

//    @PostMapping("/login")
//    @ResponseBody
//    public int login(@RequestBody SysUser sysUser){
//        return  userService.login(sysUser);
//    }
}

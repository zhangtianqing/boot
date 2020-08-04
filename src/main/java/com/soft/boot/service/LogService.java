package com.soft.boot.service;

import com.soft.boot.annotation.SysLogAnnotation;
import com.soft.boot.domain.SysLog;
import com.soft.boot.mapper.SysLogDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("logService")
public class LogService implements  BaseService<SysLog,Long> {

    @Autowired
    SysLogDAO sysLogDAO;


    @Override
    public List<SysLog> getList() {
        return sysLogDAO.selectAll();
    }

    @Override
    public SysLog getByKey(Long aLong) {
        return null;
    }

    @Override
    public int updateByPK(SysLog sysLog) {
        return 0;
    }

    @Override
    public int deleteByPK(Long aLong) {
        return 0;
    }

    @Override
    public int create(SysLog sysLog) {
        return sysLogDAO.insertSelective(sysLog);
    }
}

package com.soft.boot.service;

import com.soft.boot.annotation.SysLogAnnotation;
import com.soft.boot.domain.SysRole;
import com.soft.boot.mapper.SysRoleDAO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service("roleService")
public class RoleService implements  BaseService{

    @Autowired
    SysRoleDAO sysRoleDAO;


    public List<SysRole> findRolesOfUser(String username){
        return  sysRoleDAO.findRolesOfUser(username);
    }

    public List<SysRole> findRolesOfResource(long  RESOURCE_ID){
        return  sysRoleDAO.findRolesOfResource(RESOURCE_ID);
    }

    @Override
    public List getList() {
        return null;
    }

    @Override
    public Object getByKey(Serializable serializable) {
        return null;
    }

    @Override
    public int updateByPK(Object o) {
        return 0;
    }

    @Override
    public int deleteByPK(Serializable serializable) {
        return 0;
    }

    @Override
    public int create(Object o) {
        return 0;
    }
}

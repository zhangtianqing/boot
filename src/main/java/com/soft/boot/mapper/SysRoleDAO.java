package com.soft.boot.mapper;

import com.soft.boot.domain.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * SysRoleDAO继承基类
 */
@Mapper
public interface SysRoleDAO extends MyBatisBaseDao<SysRole, Long> {

    public List<SysRole> findRolesOfUser(@Param("username") String username);

    public List<SysRole> findRolesOfResource(@Param("resource") long  RESOURCE_ID);
}
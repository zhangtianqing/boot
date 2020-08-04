package com.soft.boot.mapper;

import com.soft.boot.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * SysUserDAO继承基类
 */
@Mapper
public interface SysUserDAO extends MyBatisBaseDao<SysUser, Long> {

    List<SysUser> selectALL();

    SysUser selectByUsername(@Param("username") String username);

}
package com.soft.boot.mapper;

import com.soft.boot.domain.SysResource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * SysResourceDAO继承基类
 */
@Mapper
public interface SysResourceDAO extends MyBatisBaseDao<SysResource, Long> {
    SysResource selectByUrl(@Param("requestUrl") String requestUrl);
}
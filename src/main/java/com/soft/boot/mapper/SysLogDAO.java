package com.soft.boot.mapper;

import com.soft.boot.domain.SysLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * SysLogDAO继承基类
 */
@Mapper
public interface SysLogDAO extends MyBatisBaseDao<SysLog, Long> {
    List<SysLog> selectAll();
}
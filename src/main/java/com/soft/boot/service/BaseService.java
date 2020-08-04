package com.soft.boot.service;

import com.soft.boot.annotation.SysLogAnnotation;

import java.io.Serializable;
import java.util.List;

public interface BaseService<Model,PK extends Serializable> {

    List<Model> getList();

    Model getByKey(PK pk);

    int updateByPK(Model model);

    int deleteByPK(PK pk);

    int create(Model model);

}

package com.uniyaz.sakila.rest;

import com.uniyaz.sakila.core.common.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService<T extends BaseEntity, R extends BaseDao> {

    @Autowired
    R dao;

    public List<T> findAll(){
        return dao.findAll();
    }

    public T save(T entity){
        return (T) dao.save(entity);
    }

    public void delete(Long id){
        dao.deleteById(id);
    }
}

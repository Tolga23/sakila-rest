package com.uniyaz.sakila.core.common;

import com.uniyaz.sakila.core.city.dao.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Optional;

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

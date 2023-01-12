package com.uniyaz.sakila.rest;

import org.hibernate.usertype.ParameterizedType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.io.Serializable;

@Repository
public class BaseDao<T, ID extends Serializable> {


 /*   private Class<T> entityClass;

    @Autowired
    protected EntityManager entitiesManager;

    public BaseDao() {
        entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass().getTypeName()[0];
    }

    public T findById(ID id) {
        return entitiesManager.find(entityClass, id);
    }

    public T create(T entity) {
        entitiesManager.persist(entity);
        return entity;
    }

    public T update(T entity) {
        return entitiesManager.merge(entity);
    }

    public void delete(T entity) {
        entitiesManager.remove(entity);
    }

    public void deleteById(ID id) {
        T entity = findById(id);
        delete(entity);
    }*/
}

package com.uniyaz.sakila.rest;

import com.uniyaz.sakila.core.common.BaseEntity;
import org.hibernate.usertype.ParameterizedType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.io.Serializable;

@NoRepositoryBean
public interface BaseDao <T> extends JpaRepository<T, Long> {




}

package com.uniyaz.sakila.core.store.dao;

import com.uniyaz.sakila.core.common.BaseDao;
import com.uniyaz.sakila.core.store.domain.Store;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreDao extends BaseDao<Store> {

    @Query("select store from Store store " +
            "left join fetch store.address address " +
            "left join fetch store.staff staff " +
            "left join fetch address.city city " +
            "left join fetch city.country country")
    List<Store> findAll();
}

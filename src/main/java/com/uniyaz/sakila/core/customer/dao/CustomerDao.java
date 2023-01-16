package com.uniyaz.sakila.core.customer.dao;

import com.uniyaz.sakila.core.common.BaseDao;
import com.uniyaz.sakila.core.customer.domain.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao extends BaseDao<Customer> {

    @Query("select customer from Customer customer " +
            "Left join fetch customer.store store " +
            "left join fetch customer.address address " +
            "left join fetch address.city city " +
            "left join fetch city.country country " +
            "left join fetch store.address address2 " +
            "left join fetch address2.city city2 " +
            "left join fetch city2.country country2")
    List<Customer> findAll();
}

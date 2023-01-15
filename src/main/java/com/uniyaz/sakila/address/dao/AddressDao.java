package com.uniyaz.sakila.address.dao;

import com.uniyaz.sakila.address.domain.Address;
import com.uniyaz.sakila.core.common.BaseDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressDao extends BaseDao<Address> {

    @Query("select address from Address address " +
            "left join fetch address.city city " +
            "left join fetch city.country country")
    List<Address> findAll();
}

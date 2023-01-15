package com.uniyaz.sakila.staff.dao;

import com.uniyaz.sakila.core.common.BaseDao;
import com.uniyaz.sakila.staff.domain.Staff;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffDao extends BaseDao<Staff> {

    @Query("select staff from Staff staff " +
            "left join fetch staff.address address " +
            "left join fetch staff.store store " +
            "left join fetch address.city city " +
            "left join fetch city.country country")
    List<Staff> findAll();
}

package com.uniyaz.sakila.staff.service;

import com.uniyaz.sakila.core.common.BaseService;
import com.uniyaz.sakila.staff.dao.StaffDao;
import com.uniyaz.sakila.staff.domain.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService extends BaseService<Staff,StaffDao> {
    @Autowired
    StaffDao staffDao;
}

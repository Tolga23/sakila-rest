package com.uniyaz.sakila.core.customer.service;

import com.uniyaz.sakila.core.common.BaseService;
import com.uniyaz.sakila.core.customer.dao.CustomerDao;
import com.uniyaz.sakila.core.customer.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseService<Customer, CustomerDao> {

    @Autowired
    CustomerDao customerDao;
}

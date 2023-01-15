package com.uniyaz.sakila.rest.customer;

import com.uniyaz.sakila.core.common.BaseController;
import com.uniyaz.sakila.core.customer.domain.Customer;
import com.uniyaz.sakila.core.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "customer")
public class CustomerController extends BaseController<Customer, CustomerService> {

    @Autowired
    CustomerService customerService;

}

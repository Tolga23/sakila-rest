package com.uniyaz.sakila.rest.customer;

import com.uniyaz.sakila.core.common.BaseController;
import com.uniyaz.sakila.core.customer.CustomerConverter;
import com.uniyaz.sakila.core.customer.domain.Customer;
import com.uniyaz.sakila.core.customer.dto.CustomerDto;
import com.uniyaz.sakila.core.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "customer")
public class CustomerController extends BaseController<Customer, CustomerService> {

    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerConverter customerConverter;

    @GetMapping(path = "findAllDto")
    public ResponseEntity findCustomerDto(){
        List<Customer> customerList = customerService.findAll();
        List<CustomerDto> customerDtoList = customerConverter.findCustomerListConverterDto(customerList);

        if(!customerDtoList.isEmpty()) return new ResponseEntity(customerDtoList, HttpStatus.OK);
        else return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}

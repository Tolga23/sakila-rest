package com.uniyaz.sakila.core.customer;

import com.uniyaz.sakila.core.customer.domain.Customer;
import com.uniyaz.sakila.core.customer.dto.CustomerDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerConverter {

    public CustomerDto findCustomerConverterDto(Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setFirstNameCustomer(customer.getFirstName());
        customerDto.setLastNameCustomer(customer.getLastName());
        customerDto.setMailCustomer(customer.getEmail());
        customerDto.setAddress(customer.getAddress().getAdress());
        customerDto.setDistrict(customer.getAddress().getDistrict());
        customerDto.setCity(customer.getAddress().getCity().getCity());
        customerDto.setCountry(customer.getAddress().getCity().getCountry().getCountry());

        return customerDto;
    }

    public List<CustomerDto> findCustomerListConverterDto(List<Customer> customerList){
        List<CustomerDto> customerDtoList = new ArrayList<>();

        for (Customer customer : customerList) {
            CustomerDto customerDto = findCustomerConverterDto(customer);
            customerDtoList.add(customerDto);
        }

        return customerDtoList;
    }
}

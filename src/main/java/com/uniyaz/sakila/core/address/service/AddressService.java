package com.uniyaz.sakila.core.address.service;

import com.uniyaz.sakila.core.address.dao.AddressDao;
import com.uniyaz.sakila.core.address.domain.Address;
import com.uniyaz.sakila.core.common.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends BaseService<Address, AddressDao> {

    @Autowired
    AddressDao addressDao;
}

package com.uniyaz.sakila.rest.address;

import com.uniyaz.sakila.core.address.domain.Address;
import com.uniyaz.sakila.core.address.service.AddressService;
import com.uniyaz.sakila.core.common.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "address")
public class AddressController extends BaseController<Address, AddressService> {
    @Autowired
    AddressService addressService;
}

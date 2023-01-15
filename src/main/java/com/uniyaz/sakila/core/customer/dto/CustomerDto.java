package com.uniyaz.sakila.core.customer.dto;

import com.uniyaz.sakila.core.address.domain.Address;
import com.uniyaz.sakila.core.store.domain.Store;

public class CustomerDto {

    private Long id;
    private String firstName;

    private Address addressId;

    private Store storeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public Store getStoreId() {
        return storeId;
    }

    public void setStoreId(Store storeId) {
        this.storeId = storeId;
    }

}

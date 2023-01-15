package com.uniyaz.sakila.core.store.service;

import com.uniyaz.sakila.core.common.BaseService;
import com.uniyaz.sakila.core.store.dao.StoreDao;
import com.uniyaz.sakila.core.store.domain.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService extends BaseService<Store, StoreDao> {
    @Autowired
    StoreDao storeDao;
}

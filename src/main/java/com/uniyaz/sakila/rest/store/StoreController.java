package com.uniyaz.sakila.rest.store;

import com.uniyaz.sakila.core.common.BaseController;
import com.uniyaz.sakila.core.store.domain.Store;
import com.uniyaz.sakila.core.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "store")
public class StoreController extends BaseController<Store, StoreService> {
    @Autowired
    StoreService service;
}

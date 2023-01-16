package com.uniyaz.sakila.rest.store;

import com.uniyaz.sakila.core.common.BaseController;
import com.uniyaz.sakila.core.store.StoreConverter;
import com.uniyaz.sakila.core.store.domain.Store;
import com.uniyaz.sakila.core.store.dto.StoreDto;
import com.uniyaz.sakila.core.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "store")
public class StoreController extends BaseController<Store, StoreService> {

    @Autowired
    StoreService service;

    @Autowired
    StoreConverter storeConverter;

    @GetMapping(path = "listDto")
    public ResponseEntity findAllDto(){
        List<Store> storeList = service.findAll();
        List<StoreDto> storeDtoList = storeConverter.storeDtoListConverter(storeList);

        if (!storeDtoList.isEmpty()) return new ResponseEntity(storeDtoList, HttpStatus.OK);
        else return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}

package com.uniyaz.sakila.core.store;

import com.uniyaz.sakila.core.store.domain.Store;
import com.uniyaz.sakila.core.store.dto.StoreDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StoreConverter {

    public StoreDto storeDtoConverter(Store store){
        StoreDto storeDto = new StoreDto();

        storeDto.setId(store.getId());
        storeDto.setAddress(store.getAddress().getAdress());
        storeDto.setDistrict(store.getAddress().getDistrict());
        storeDto.setCity(store.getAddress().getCity().getCity());
        storeDto.setCountry(store.getAddress().getCity().getCountry().getCountry());

        return storeDto;
    }

    public List<StoreDto> storeDtoListConverter(List<Store> storeList){
        List<StoreDto> storeDtoList = new ArrayList<>();

        for (Store store : storeList) {
            StoreDto storeDto = storeDtoConverter(store);
            storeDtoList.add(storeDto);
        }

        return storeDtoList;
    }
}

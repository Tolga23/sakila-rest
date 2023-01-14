package com.uniyaz.sakila.rest.city;

import com.uniyaz.sakila.core.city.domain.City;
import com.uniyaz.sakila.core.city.converter.CityConverter;
import com.uniyaz.sakila.core.city.dto.CityCascadeSaveRequestDto;
import com.uniyaz.sakila.core.city.dto.CityDto;
import com.uniyaz.sakila.core.city.dto.CitySaveRequestDto;
import com.uniyaz.sakila.core.city.service.CityService;
import com.uniyaz.sakila.core.common.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "city")
public class CityController extends BaseController<City,CityService> {

    @Autowired
    CityService cityService;
    @Autowired
    CityConverter cityConverter;

    @PostMapping(path= "saveCascade")
    public ResponseEntity saveCascade(@RequestBody CityCascadeSaveRequestDto cityCascadeSaveRequestDto){
        City city = cityService.saveCascade(cityCascadeSaveRequestDto);
        CityDto cityDto = cityConverter.convertToCityDto(city);
        ResponseEntity responseEntity = new ResponseEntity(cityDto, HttpStatus.OK);
        return responseEntity;
    }

/**
 * localhost:8080/city/saveDto
 *
 * {
 *         "name": "ESES",
 *         "countryId": 2
 * }
 * City entity'de CASCADE MERGE ile countryId ekleyerek Ülke eklemiş olduk.
 */
    @PostMapping(path= "saveDto")
    public ResponseEntity saveDto(@RequestBody CitySaveRequestDto citySaveRequestDto){
        City city = cityService.saveCityWithDto(citySaveRequestDto);
        CityDto cityDto = cityConverter.convertToCityDto(city);
        return new ResponseEntity(cityDto,HttpStatus.OK);
    }


}

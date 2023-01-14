package com.uniyaz.sakila.rest.country;

import com.uniyaz.sakila.core.common.BaseController;
import com.uniyaz.sakila.core.country.*;
import com.uniyaz.sakila.core.country.domain.Country;
import com.uniyaz.sakila.core.country.dto.CountryCityCountDto;
import com.uniyaz.sakila.core.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "country")
public class CountryController extends BaseController<Country,CountryService> {

    @Autowired
    CountryService countryService;

    @Autowired
    CountryConverter countryConverter;

    @GetMapping(path = "findAll")
    public List<Country> findAllCountry() {
        return countryService.findAll();
    }

    @GetMapping(path = "findAllByName")
    public ResponseEntity findAllCountry(String name) {

        List<Country> countryList = countryService.findAllByName(name);
        List<CountryDto> countryDtoList = countryConverter.convertToCountryDtoList(countryList);
        if (!countryDtoList.isEmpty()) {
            ResponseEntity responseEntity = new ResponseEntity(countryDtoList, HttpStatus.OK);
            return responseEntity;
        } else {
            ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NO_CONTENT);
            return responseEntity;
        }
    }

    @GetMapping(path = "findCountryCityCountDto")
    public ResponseEntity findCountryCityCountDto(){
        List<CountryCityCountDto> countryCityCountDtoList = countryService.findCountryCityCountDto();
        ResponseEntity responseEntity = new ResponseEntity(countryCityCountDtoList,HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping(path = "findById/{id}")
    public Optional<Country> findById(@PathVariable Long id){
        return countryService.findCountryById(id);
    }

}

package com.uniyaz.sakila.rest;

import com.uniyaz.sakila.core.country.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "country")
public class CountryController {

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

    @GetMapping(path = "findById/{id}")
    public Optional<Country> findById(@PathVariable Long id){
        return countryService.findCountryById(id);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country){
        return countryService.addCountry(country);
    }

    @DeleteMapping(path = "deleteById")
    public void deleteById(Long id){
        countryService.deleteCountry(id);
    }

    @DeleteMapping(path = "deleteById/{id}")
    public void deleteByIdPathVariable(@PathVariable Long id){
        countryService.deleteCountry(id);
    }


}

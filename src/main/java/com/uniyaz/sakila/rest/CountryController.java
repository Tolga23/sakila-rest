package com.uniyaz.sakila.rest;

import com.uniyaz.sakila.core.country.Country;
import com.uniyaz.sakila.core.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "country")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping(path = "findAll")
    public List<Country> findAllCountry() {
        return countryService.findAll();
    }

    @GetMapping(path = "findByName/{name}")
    public List<Country> findAllByName(@PathVariable String name){
        return countryService.findAllByName(name);
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

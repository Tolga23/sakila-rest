package com.uniyaz.sakila.core.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    CountryDao countryDao;

    public List<Country> findAll() {
        return countryDao.findAll();
    }

    public List<Country> findAllByName(String countryName) {
        return countryDao.findAllByName(countryName);
    }

    public Optional<Country> findCountryById(Long countryId) {
        return countryDao.findById(countryId);
    }

    public Country addCountry(Country country){
        return countryDao.save(country);
    }

    public void deleteCountry(Long countryId){
        countryDao.deleteById(countryId);
    }


}

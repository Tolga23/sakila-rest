package com.uniyaz.sakila.core.country.service;

import com.uniyaz.sakila.core.common.BaseService;
import com.uniyaz.sakila.core.country.dao.CountryDao;
import com.uniyaz.sakila.core.country.domain.Country;
import com.uniyaz.sakila.core.country.dto.CountryCityCountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService extends BaseService<Country, CountryDao> {

    @Autowired
    CountryDao countryDao;

    public List<CountryCityCountDto> findCountryCityCountDto() {
        return countryDao.findCountryCityCountDto();
    }

    public List<Country> findAllByName(String countryName) {
        return countryDao.findAllByName(countryName);
    }

    public Optional<Country> findCountryById(Long countryId) {
        return countryDao.findById(countryId);
    }


}

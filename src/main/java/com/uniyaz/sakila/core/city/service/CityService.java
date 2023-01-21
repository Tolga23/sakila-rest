package com.uniyaz.sakila.core.city.service;

import com.uniyaz.sakila.core.city.domain.City;
import com.uniyaz.sakila.core.city.dao.CityDao;
import com.uniyaz.sakila.core.city.dto.CityCascadeSaveRequestDto;
import com.uniyaz.sakila.core.city.dto.CitySaveRequestDto;
import com.uniyaz.sakila.core.common.BaseService;
import com.uniyaz.sakila.core.country.domain.Country;
import com.uniyaz.sakila.core.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class CityService extends BaseService<City,CityDao> {

    @Autowired
    CityDao cityDao;

    @Autowired
    CountryService countryService;

    public City saveCityWithDto(CitySaveRequestDto citySaveRequestDto){
        Long countryId = citySaveRequestDto.getCountryId();
        Country country = countryService.findCountryById(countryId);
        String cityName = citySaveRequestDto.getName();

      //  Country country = new Country();
        country.setId(citySaveRequestDto.getCountryId());

        City city = new City();
        city.setCity(cityName);
        city.setCountry(country);
        city.setLastUpdate(new Date());
        return cityDao.save(city);
    }

    public City saveCascade(CityCascadeSaveRequestDto cityCascadeSaveRequestDto) {
        String cityName = cityCascadeSaveRequestDto.getCityName();
        String countryName = cityCascadeSaveRequestDto.getCountryName();

        Country country = new Country();
        country.setCountry(countryName);
        country.setLastUpdate(new Date());

        City city = new City();
        city.setCity(cityName);
        city.setCountry(country);
        city.setLastUpdate(new Date());
        return cityDao.save(city);
    }

    public Optional<City> findCityById(Long cityId) {
        return cityDao.findById(cityId);
    }


}

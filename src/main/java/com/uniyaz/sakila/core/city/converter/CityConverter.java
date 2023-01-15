package com.uniyaz.sakila.core.city.converter;

import com.uniyaz.sakila.core.city.domain.City;
import com.uniyaz.sakila.core.city.dto.CityDto;
import com.uniyaz.sakila.core.city.dto.CitytoCountryFinderDto;
import com.uniyaz.sakila.core.country.domain.Country;
import com.uniyaz.sakila.core.country.CountryConverter;
import com.uniyaz.sakila.core.country.dto.CountryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CityConverter {

    @Autowired
    CountryConverter countryConverter;

    public CityDto convertToCityDto(City city) {
        CityDto cityDto = new CityDto();
        cityDto.setId(city.getId());
        cityDto.setName(city.getCity());
        Country country = city.getCountry();
        CountryDto countryDto = countryConverter.convertToCountryDto(country);
        cityDto.setCountryDto(countryDto);
        return cityDto;
    }

    public CitytoCountryFinderDto convertToCityByCountryNameD(City city) {
        CitytoCountryFinderDto citytoCountryFinderDto = new CitytoCountryFinderDto();
        citytoCountryFinderDto.setCountry(city.getCountry().getCountry());
        citytoCountryFinderDto.setCity(city.getCity());
        return citytoCountryFinderDto;
    }


    public List<CitytoCountryFinderDto> convertToCityToCountryDto(List<City> cityList){

        List<CitytoCountryFinderDto> citytoCountryFinderDtoList = new ArrayList<>();
        for (City city : cityList) {
            CitytoCountryFinderDto citytoCountryFinderDto = convertToCityByCountryNameD(city);
            citytoCountryFinderDtoList.add(citytoCountryFinderDto);
        }

        return citytoCountryFinderDtoList;
    }



}

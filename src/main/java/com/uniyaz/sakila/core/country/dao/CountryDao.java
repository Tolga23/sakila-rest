package com.uniyaz.sakila.core.country.dao;

import com.uniyaz.sakila.core.common.BaseDao;
import com.uniyaz.sakila.core.country.domain.Country;
import com.uniyaz.sakila.core.country.dto.CountryCityCountDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryDao extends BaseDao<Country> {



    @Query("select country from Country country where country.country = :countryName")
    List<Country> findAllByName(@Param("countryName") String countryName);

    @Query(
            "select new com.uniyaz.sakila.core.country.dto.CountryCityCountDto(country.country as countryName, " +
                    "       (" +
                    "           select  count(*) " +
                    "           from    City city " +
                    "           where   city.country.id = country.id" +
                    "       ) as cityCount) " +
                    "from Country country ")

    List<CountryCityCountDto> findCountryCityCountDto();




}

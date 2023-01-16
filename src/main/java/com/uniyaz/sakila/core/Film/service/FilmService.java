package com.uniyaz.sakila.core.Film.service;

import com.uniyaz.sakila.core.Film.dao.FilmDao;
import com.uniyaz.sakila.core.Film.domain.Film;
import com.uniyaz.sakila.core.common.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService extends BaseService<Film,FilmDao> {

    @Autowired
    FilmDao filmDao;
}

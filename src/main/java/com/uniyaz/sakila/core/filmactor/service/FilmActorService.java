package com.uniyaz.sakila.core.filmactor.service;

import com.uniyaz.sakila.core.common.BaseService;
import com.uniyaz.sakila.core.filmactor.dao.FilmActorDao;
import com.uniyaz.sakila.core.filmactor.domain.FilmActor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilmActorService extends BaseService<FilmActor,FilmActorDao> {

    @Autowired
    FilmActorDao filmActorDao;

    public List<FilmActor> findAll() {
        return filmActorDao.findAll();
    }

    public FilmActor save(FilmActor filmActor) {
        return filmActorDao.save(filmActor);
    }

    public void delete(FilmActor filmActor) {
        filmActorDao.delete(filmActor);
    }

    public FilmActor findActorById(Long id) {return filmActorDao.findAllById(id);}
}
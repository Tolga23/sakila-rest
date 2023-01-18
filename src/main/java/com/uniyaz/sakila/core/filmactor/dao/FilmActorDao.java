package com.uniyaz.sakila.core.filmactor.dao;

import com.uniyaz.sakila.core.common.BaseDao;
import com.uniyaz.sakila.core.filmactor.domain.FilmActor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmActorDao extends BaseDao<FilmActor>{

    @Query("SELECT a.id as id, a.firstName as firstName, COUNT(f.actor.id) as actorCount FROM FilmActor f JOIN f.actor a WHERE a.id = :id")
    FilmActor findAllById(@Param("id") Long id);
}
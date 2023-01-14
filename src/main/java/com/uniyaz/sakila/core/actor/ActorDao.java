package com.uniyaz.sakila.core.actor;

import com.uniyaz.sakila.core.common.BaseDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorDao extends BaseDao<Actor> {

    @Query("select actor from Actor actor where actor.firstName = :actorName")
    public List<Actor> findAllByName(@Param("actorName") String actorName);

    @Query("select actor from Actor actor where actor.id =:id")
    public Actor findActorsById(@Param("id") Long id);
}


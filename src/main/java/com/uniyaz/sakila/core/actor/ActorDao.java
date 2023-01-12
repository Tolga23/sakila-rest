package com.uniyaz.sakila.core.actor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorDao extends JpaRepository<Actor,Long> {

    @Query("select actor from Actor actor where actor.firstName = :actorName")
    public List<Actor> findAllByName(@Param("actorName") String actorName);
}


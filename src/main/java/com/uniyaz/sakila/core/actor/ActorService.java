package com.uniyaz.sakila.core.actor;

import com.uniyaz.sakila.core.common.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService extends BaseService<Actor, ActorDao> {

    @Autowired
    ActorDao actorDao;

    public List<Actor> findAllByName(String firstName) {return actorDao.findAllByName(firstName);}

    public Actor findActorById(Long actorId) {
        return actorDao.findActorsById(actorId);
    }

}

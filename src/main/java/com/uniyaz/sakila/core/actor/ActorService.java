package com.uniyaz.sakila.core.actor;

import com.uniyaz.sakila.core.common.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService extends BaseService<Actor, ActorDao> {

    private final ActorDao actorDao;

    public ActorService(ActorDao actorDao) {
        this.actorDao = actorDao;
    }

    public List<Actor> findAllByName(String firstName) {return actorDao.findAllByName(firstName);}

    public Actor findActorById(Long actorId) {
        return actorDao.findActorsById(actorId);
    }

}

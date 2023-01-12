package com.uniyaz.sakila.core.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService {

    @Autowired
    ActorDao actorDao;
    
    public List<Actor> findAll() { return actorDao.findAll();}

    public List<Actor> findAllByName(String firstName) {return actorDao.findAllByName(firstName);}

    public Optional<Actor> findActorById(Long actorId) {
        return actorDao.findById(actorId);
    }

    public Actor addActor(Actor actor){
        return actorDao.save(actor);
    }

    public void deleteActor(Long actorId){
        actorDao.deleteById(actorId);
    }
}

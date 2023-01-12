package com.uniyaz.sakila.rest.actor;

import com.uniyaz.sakila.core.actor.Actor;
import com.uniyaz.sakila.core.actor.ActorConverter;
import com.uniyaz.sakila.core.actor.ActorDto;
import com.uniyaz.sakila.core.actor.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "actor")
public class ActorController {

    @Autowired
    ActorService actorService;

    @Autowired
    ActorConverter actorConverter;

    @GetMapping(path = "findAll")
    public List<Actor> findAll(){return actorService.findAll();}

    @GetMapping(path = "findById/{id}")
    public Optional<Actor> findById(@PathVariable Long id) {return actorService.findActorById(id);}

    @GetMapping(path = "findAllByName")
    public ResponseEntity findAllCountry(String name) {

        List<Actor> actorList = actorService.findAllByName(name);
        List<ActorDto> actorDtoList = actorConverter.convertToActorDtoList(actorList);
        if (!actorDtoList.isEmpty()) {
            ResponseEntity responseEntity = new ResponseEntity(actorDtoList, HttpStatus.OK);
            return responseEntity;
        } else {
            return new ResponseEntity("No actors found", HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping
    public Actor addActor(@RequestBody Actor actor){
        return actorService.addActor(actor);
    }

    @DeleteMapping(path = "deleteById")
    public void deleteById(Long id){
        actorService.deleteActor(id);
    }

    @DeleteMapping(path = "deleteById/{id}")
    public void deleteByIdPathVariable(@PathVariable Long id){
        actorService.deleteActor(id);
    }

}

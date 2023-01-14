package com.uniyaz.sakila.rest.actor;

import com.uniyaz.sakila.core.actor.*;
import com.uniyaz.sakila.core.common.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "actor")
public class ActorController extends BaseController<Actor, ActorService>{

    @Autowired
    ActorService actorService;

    @Autowired
    ActorConverter actorConverter;

    // localhost:8080/actor/findActorByName?name=Tolga
    @GetMapping(path = "findActorByName")
    public ResponseEntity findActorByName(String name){
        List<Actor> actorList = actorService.findAllByName(name);
        List<ActorDto> actorDtoList = actorConverter.convertToActorDtoList(actorList);

        if (!actorDtoList.isEmpty()){
            return new ResponseEntity(actorDtoList, HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

    // localhost:8080/actor/findById?id=1
    @GetMapping(path = "findById")
    public ResponseEntity findActorById(Long id){
        Actor actorById = actorService.findActorById(id);
        ActorDto actorDto = actorConverter.convertToActorDto(actorById);

        if (!actorDto.equals("")) return new ResponseEntity(actorDto,HttpStatus.OK);
        else return new ResponseEntity(HttpStatus.NO_CONTENT);

    }
}

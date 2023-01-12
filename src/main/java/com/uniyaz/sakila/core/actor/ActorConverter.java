package com.uniyaz.sakila.core.actor;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ActorConverter {


    public ActorDto convertToActorDto(Actor actor) {

        ActorDto actorDto = new ActorDto();
        actorDto.setId(actor.getId());
        actorDto.setName(actor.getFirstName());
        actorDto.setLastname(actor.getLastName());
        return actorDto;
    }

    public List<ActorDto> convertToActorDtoList(List<Actor> actorList) {

        List<ActorDto> actorDtoList = new ArrayList<>();

        for (Actor actor : actorList) {
            ActorDto actorDto = convertToActorDto(actor);
            actorDtoList.add(actorDto);
        }

        return actorDtoList;
    }
}

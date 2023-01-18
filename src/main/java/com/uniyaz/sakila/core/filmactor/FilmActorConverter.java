package com.uniyaz.sakila.core.filmactor;

import com.uniyaz.sakila.core.filmactor.domain.FilmActor;
import com.uniyaz.sakila.core.filmactor.queryfilterdto.FilmActorDto;
import org.springframework.stereotype.Component;

@Component
public class FilmActorConverter {

    public FilmActorDto convertToFilmActorDto(FilmActor filmActor){
        FilmActorDto filmActorDto = new FilmActorDto();
        filmActorDto.setId(filmActor.getId());
        filmActorDto.setFirstName(filmActor.getActor().getFirstName());
        filmActorDto.setActorCount(filmActor.);
    }
}

package com.uniyaz.sakila.rest.filmactor;

import com.uniyaz.sakila.core.filmactor.domain.FilmActor;
import com.uniyaz.sakila.core.filmactor.service.FilmActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "filmactor")
public class FilmActorController {

    @Autowired
    FilmActorService filmActorService;

    @GetMapping(path = "find")
    public ResponseEntity find(Long id){
        FilmActor filmActors = filmActorService.findActorById(id);

        return new ResponseEntity(filmActors, HttpStatus.OK);

    }
}

package com.uniyaz.sakila.core.filmactor.queryfilterdto;


import com.uniyaz.sakila.core.Film.domain.Film;
import com.uniyaz.sakila.core.actor.Actor;

public class FilmActorQueryFilterDto {

    private Actor actor;
    private Film film;


    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}

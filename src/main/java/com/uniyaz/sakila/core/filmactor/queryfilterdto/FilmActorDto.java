package com.uniyaz.sakila.core.filmactor.queryfilterdto;

public class FilmActorDto {
    private Long id;
    private String firstName;
    private Long actorCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getActorCount() {
        return actorCount;
    }

    public void setActorCount(Long actorCount) {
        this.actorCount = actorCount;
    }
}

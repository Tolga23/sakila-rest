package com.uniyaz.sakila.core.filmactor.domain;

import com.uniyaz.sakila.core.Film.domain.Film;
import com.uniyaz.sakila.core.actor.Actor;
import com.uniyaz.sakila.core.common.BaseEntity;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "film_actor")
@Entity
@Audited
public class FilmActor extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "filmactor_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id",foreignKey = @javax.persistence.ForeignKey(name = "fk_film_actor_film"))
    private Film film;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "actor_id",foreignKey = @javax.persistence.ForeignKey(name = "fk_film_actor_actor" ))
    private Actor actor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update")
    private Date lastUpdate;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "FilmActor{" +
                ", film=" + film +
                ", actor=" + actor +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
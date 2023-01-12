package com.uniyaz.sakila.core.actor;

import com.uniyaz.sakila.core.common.BaseEntity;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

@Table(name = "actor")
@Entity
@Audited
public class Actor extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id")
    private Long id;

    @org.hibernate.annotations.Index(name = "IDX_ACTOR_FIRST_NAME")
    @Column(name = "first_name", length = 45)
    private String firstName;

    @Column(name = "last_name", length = 45)
    private String lastName;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return firstName;
    }
}
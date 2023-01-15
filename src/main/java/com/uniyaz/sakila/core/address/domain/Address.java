package com.uniyaz.sakila.core.address.domain;

import com.uniyaz.sakila.core.city.domain.City;
import com.uniyaz.sakila.core.common.BaseEntity;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "address")
@Audited
public class Address extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "address_id")
    private Long id;

    @Column(name = "address",length = 50)
    private String adress;

    @Column(name = "district",length = 20)
    private String district;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn(name = "city_id",foreignKey = @ForeignKey(name = "fk_address_city"))
    private City city;

    @Column(name = "postal_code",length = 10)
    private String postalCode;

    @Column(name = "phone",length = 20)
    private String phone;

    @Column(name = "last_update")
    private Date lastUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return adress;
    }
}
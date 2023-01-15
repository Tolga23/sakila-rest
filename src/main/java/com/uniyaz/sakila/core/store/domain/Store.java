package com.uniyaz.sakila.core.store.domain;

import com.uniyaz.sakila.address.domain.Address;
import com.uniyaz.sakila.core.common.BaseEntity;
import com.uniyaz.sakila.staff.domain.Staff;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "store")
@Audited
public class Store extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "store_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staff_id",foreignKey = @ForeignKey(name = "fk_store_staff"))
    private Staff staff;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id",foreignKey = @ForeignKey(name = "fk_store_address"))
    private Address address;

    @Column(name = "last_update")
    private Date lastUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Staff getManagerStaffId() {
        return staff;
    }

    public void setManagerStaffId(Staff staff) {
        this.staff = staff;
    }

    public Address getAddressId() {
        return address;
    }

    public void setAddressId(Address address) {
        this.address = address;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "id: " + id;
    }
}


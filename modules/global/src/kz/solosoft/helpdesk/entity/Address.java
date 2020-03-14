package kz.solosoft.helpdesk.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "HELPDESK_ADDRESS")
@Entity(name = "helpdesk_Address")
public class Address extends StandardEntity {
    private static final long serialVersionUID = -4601679128446413614L;

    @Column(name = "STREET")
    protected String street;

    @Column(name = "ZIP")
    protected String zip;

    @Column(name = "HOUSE")
    protected Integer house;

    @Column(name = "FLAT")
    protected Integer flat;

    public Integer getFlat() {
        return flat;
    }

    public void setFlat(Integer flat) {
        this.flat = flat;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public Integer getHouse() {
        return house;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
package kz.solosoft.helpdesk.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "HELPDESK_VENDOR")
@Entity(name = "helpdesk_Vendor")
public class Vendor extends StandardEntity {
    private static final long serialVersionUID = -6038005024703126660L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "BRAND")
    protected String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
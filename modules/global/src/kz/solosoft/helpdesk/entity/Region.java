package kz.solosoft.helpdesk.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "HELPDESK_REGION")
@Entity(name = "helpdesk_Region")
public class Region extends StandardEntity {
    private static final long serialVersionUID = -4012608845054838504L;

    @Column(name = "CODE", unique = true)
    protected String code;

    @Column(name = "NAME", unique = true)
    protected String name;

    @Column(name = "DESCRIPTION")
    protected String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
package kz.solosoft.helpdesk.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@NamePattern("%s|name")
@Table(name = "HELPDESK_COMPANY")
@Entity(name = "helpdesk_Company")
public class Company extends StandardEntity {
    private static final long serialVersionUID = 2788009548126253245L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "RESPONSIBLE")
    protected String responsible;

    @Email
    @Column(name = "EMAIL")
    protected String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
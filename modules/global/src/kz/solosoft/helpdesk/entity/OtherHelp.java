package kz.solosoft.helpdesk.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "HELPDESK_OTHER_HELP")
@Entity(name = "helpdesk_OtherHelp")
public class OtherHelp extends StandardEntity {
    private static final long serialVersionUID = 1962045645233299280L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "DESCRIPTION")
    protected String description;

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
package kz.solosoft.helpdesk.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "HELPDESK_SOFTWARE")
@Entity(name = "helpdesk_Software")
public class Software extends StandardEntity {
    private static final long serialVersionUID = -3343029723531123002L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "MODULE_")
    protected String module;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(DeletePolicy.CASCADE)
    @JoinColumn(name = "VENDOR_ID")
    protected Vendor vendor;

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
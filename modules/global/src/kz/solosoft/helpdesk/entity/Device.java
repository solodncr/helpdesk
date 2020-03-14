package kz.solosoft.helpdesk.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "HELPDESK_DEVICE")
@Entity(name = "helpdesk_Device")
public class Device extends StandardEntity {
    private static final long serialVersionUID = -3045717150117012703L;

    @NotNull
    @Column(name = "CODE", nullable = false, unique = true)
    protected String code;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "DESCRIPTION", length = 1024)
    protected String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VENDOR_ID")
    @OnDelete(DeletePolicy.CASCADE)
    protected Vendor vendor;

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Vendor getVendor() {
        return vendor;
    }

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
package kz.solosoft.helpdesk.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum HelpType implements EnumClass<String> {

    DEVICE("Device"),
    SOFTWARE("Software"),
    OTHER("Other");

    private String id;

    HelpType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static HelpType fromId(String id) {
        for (HelpType at : HelpType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
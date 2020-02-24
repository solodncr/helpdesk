-- begin HELPDESK_COUNTRY
create table HELPDESK_COUNTRY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    CODE varchar(255),
    --
    primary key (ID)
)^
-- end HELPDESK_COUNTRY
-- begin HELPDESK_REGION
create table HELPDESK_REGION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE varchar(255),
    NAME varchar(255),
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end HELPDESK_REGION
-- begin HELPDESK_DEVICE
create table HELPDESK_DEVICE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE varchar(255) not null,
    NAME varchar(255),
    DESCRIPTION varchar(1024),
    VENDOR_ID uuid,
    --
    primary key (ID)
)^
-- end HELPDESK_DEVICE
-- begin HELPDESK_CUSTOMER
create table HELPDESK_CUSTOMER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    DESCRIPTION varchar(255),
    COUNTRY_ID uuid,
    REGION_ID uuid,
    --
    primary key (ID)
)^
-- end HELPDESK_CUSTOMER
-- begin HELPDESK_COMPANY
create table HELPDESK_COMPANY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    DESCRIPTION varchar(255),
    RESPONSIBLE varchar(255),
    EMAIL varchar(255),
    --
    primary key (ID)
)^
-- end HELPDESK_COMPANY
-- begin HELPDESK_SOFTWARE
create table HELPDESK_SOFTWARE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    MODULE_ varchar(255),
    VENDOR_ID uuid,
    --
    primary key (ID)
)^
-- end HELPDESK_SOFTWARE
-- begin HELPDESK_OTHER_HELP
create table HELPDESK_OTHER_HELP (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end HELPDESK_OTHER_HELP
-- begin HELPDESK_TOWN
create table HELPDESK_TOWN (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end HELPDESK_TOWN
-- begin HELPDESK_VENDOR
create table HELPDESK_VENDOR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    BRAND varchar(255),
    --
    primary key (ID)
)^
-- end HELPDESK_VENDOR

package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_organisationunitgroup", schema = "public", catalog = "hrhis")
public class HrisOrganisationunitgroupEntity {
    private int id;
    private Integer organisationunitgroupsetId;
    private String uid;
    private String name;
    private String description;
    private String dhisuid;
    private String code;
    private Timestamp datecreated;
    private Timestamp lastupdated;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "organisationunitgroupset_id")
    public Integer getOrganisationunitgroupsetId() {
        return organisationunitgroupsetId;
    }

    public void setOrganisationunitgroupsetId(Integer organisationunitgroupsetId) {
        this.organisationunitgroupsetId = organisationunitgroupsetId;
    }

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "dhisuid")
    public String getDhisuid() {
        return dhisuid;
    }

    public void setDhisuid(String dhisuid) {
        this.dhisuid = dhisuid;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "datecreated")
    public Timestamp getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Timestamp datecreated) {
        this.datecreated = datecreated;
    }

    @Basic
    @Column(name = "lastupdated")
    public Timestamp getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Timestamp lastupdated) {
        this.lastupdated = lastupdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisOrganisationunitgroupEntity that = (HrisOrganisationunitgroupEntity) o;
        return id == that.id &&
                Objects.equals(organisationunitgroupsetId, that.organisationunitgroupsetId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(dhisuid, that.dhisuid) &&
                Objects.equals(code, that.code) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, organisationunitgroupsetId, uid, name, description, dhisuid, code, datecreated, lastupdated);
    }
}

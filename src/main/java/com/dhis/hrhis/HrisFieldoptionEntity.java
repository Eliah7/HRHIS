package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_fieldoption", schema = "public", catalog = "hrhis")
public class HrisFieldoptionEntity {
    private int id;
    private int fieldId;
    private String uid;
    private String value;
    private Boolean skipinreport;
    private String description;
    private Integer sort;
    private Timestamp datecreated;
    private Timestamp lastupdated;
    private Boolean hastraining;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "field_id")
    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
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
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "skipinreport")
    public Boolean getSkipinreport() {
        return skipinreport;
    }

    public void setSkipinreport(Boolean skipinreport) {
        this.skipinreport = skipinreport;
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
    @Column(name = "sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    @Basic
    @Column(name = "hastraining")
    public Boolean getHastraining() {
        return hastraining;
    }

    public void setHastraining(Boolean hastraining) {
        this.hastraining = hastraining;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisFieldoptionEntity that = (HrisFieldoptionEntity) o;
        return id == that.id &&
                fieldId == that.fieldId &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(value, that.value) &&
                Objects.equals(skipinreport, that.skipinreport) &&
                Objects.equals(description, that.description) &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated) &&
                Objects.equals(hastraining, that.hastraining);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fieldId, uid, value, skipinreport, description, sort, datecreated, lastupdated, hastraining);
    }
}

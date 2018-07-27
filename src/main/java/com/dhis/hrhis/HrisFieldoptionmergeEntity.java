package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_fieldoptionmerge", schema = "public", catalog = "hrhis")
public class HrisFieldoptionmergeEntity {
    private int id;
    private Integer fieldId;
    private Integer mergedfieldoptionId;
    private String uid;
    private String removedfieldoptionvalue;
    private String removedfieldoptionuid;
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
    @Column(name = "field_id")
    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    @Basic
    @Column(name = "mergedfieldoption_id")
    public Integer getMergedfieldoptionId() {
        return mergedfieldoptionId;
    }

    public void setMergedfieldoptionId(Integer mergedfieldoptionId) {
        this.mergedfieldoptionId = mergedfieldoptionId;
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
    @Column(name = "removedfieldoptionvalue")
    public String getRemovedfieldoptionvalue() {
        return removedfieldoptionvalue;
    }

    public void setRemovedfieldoptionvalue(String removedfieldoptionvalue) {
        this.removedfieldoptionvalue = removedfieldoptionvalue;
    }

    @Basic
    @Column(name = "removedfieldoptionuid")
    public String getRemovedfieldoptionuid() {
        return removedfieldoptionuid;
    }

    public void setRemovedfieldoptionuid(String removedfieldoptionuid) {
        this.removedfieldoptionuid = removedfieldoptionuid;
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
        HrisFieldoptionmergeEntity that = (HrisFieldoptionmergeEntity) o;
        return id == that.id &&
                Objects.equals(fieldId, that.fieldId) &&
                Objects.equals(mergedfieldoptionId, that.mergedfieldoptionId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(removedfieldoptionvalue, that.removedfieldoptionvalue) &&
                Objects.equals(removedfieldoptionuid, that.removedfieldoptionuid) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fieldId, mergedfieldoptionId, uid, removedfieldoptionvalue, removedfieldoptionuid, datecreated, lastupdated);
    }
}

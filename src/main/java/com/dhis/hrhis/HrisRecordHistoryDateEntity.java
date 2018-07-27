package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_record_history_date", schema = "public", catalog = "hrhis")
public class HrisRecordHistoryDateEntity {
    private int id;
    private Integer fieldId;
    private String uid;
    private String instance;
    private String history;
    private Date previousdate;
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
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "instance")
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    @Basic
    @Column(name = "history")
    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Basic
    @Column(name = "previousdate")
    public Date getPreviousdate() {
        return previousdate;
    }

    public void setPreviousdate(Date previousdate) {
        this.previousdate = previousdate;
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
        HrisRecordHistoryDateEntity that = (HrisRecordHistoryDateEntity) o;
        return id == that.id &&
                Objects.equals(fieldId, that.fieldId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(instance, that.instance) &&
                Objects.equals(history, that.history) &&
                Objects.equals(previousdate, that.previousdate) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fieldId, uid, instance, history, previousdate, datecreated, lastupdated);
    }
}

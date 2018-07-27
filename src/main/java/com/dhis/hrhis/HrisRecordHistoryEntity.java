package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_record_history", schema = "public", catalog = "hrhis")
public class HrisRecordHistoryEntity {
    private int id;
    private Integer recordId;
    private Integer fieldId;
    private String uid;
    private String history;
    private String reason;
    private Timestamp startdate;
    private String username;
    private Timestamp datecreated;
    private Timestamp lastupdated;
    private Timestamp enddate;
    private String entitledPayment;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "record_id")
    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
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
    @Column(name = "history")
    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "startdate")
    public Timestamp getStartdate() {
        return startdate;
    }

    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    @Column(name = "enddate")
    public Timestamp getEnddate() {
        return enddate;
    }

    public void setEnddate(Timestamp enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "entitled_payment")
    public String getEntitledPayment() {
        return entitledPayment;
    }

    public void setEntitledPayment(String entitledPayment) {
        this.entitledPayment = entitledPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisRecordHistoryEntity that = (HrisRecordHistoryEntity) o;
        return id == that.id &&
                Objects.equals(recordId, that.recordId) &&
                Objects.equals(fieldId, that.fieldId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(history, that.history) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(startdate, that.startdate) &&
                Objects.equals(username, that.username) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated) &&
                Objects.equals(enddate, that.enddate) &&
                Objects.equals(entitledPayment, that.entitledPayment);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, recordId, fieldId, uid, history, reason, startdate, username, datecreated, lastupdated, enddate, entitledPayment);
    }
}

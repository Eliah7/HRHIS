package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_record", schema = "public", catalog = "hrhis")
public class HrisRecordEntity {
    private int id;
    private int organisationunitId;
    private int formId;
    private String uid;
    private String instance;
    private String value;
    private boolean complete;
    private boolean correct;
    private boolean hashistory;
    private boolean hastraining;
    private Timestamp datecreated;
    private Timestamp lastupdated;
    private String username;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "organisationunit_id")
    public int getOrganisationunitId() {
        return organisationunitId;
    }

    public void setOrganisationunitId(int organisationunitId) {
        this.organisationunitId = organisationunitId;
    }

    @Basic
    @Column(name = "form_id")
    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
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
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "complete")
    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Basic
    @Column(name = "correct")
    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Basic
    @Column(name = "hashistory")
    public boolean isHashistory() {
        return hashistory;
    }

    public void setHashistory(boolean hashistory) {
        this.hashistory = hashistory;
    }

    @Basic
    @Column(name = "hastraining")
    public boolean isHastraining() {
        return hastraining;
    }

    public void setHastraining(boolean hastraining) {
        this.hastraining = hastraining;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisRecordEntity that = (HrisRecordEntity) o;
        return id == that.id &&
                organisationunitId == that.organisationunitId &&
                formId == that.formId &&
                complete == that.complete &&
                correct == that.correct &&
                hashistory == that.hashistory &&
                hastraining == that.hastraining &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(instance, that.instance) &&
                Objects.equals(value, that.value) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, organisationunitId, formId, uid, instance, value, complete, correct, hashistory, hastraining, datecreated, lastupdated, username);
    }
}

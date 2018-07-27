package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_organisationunitcompleteness", schema = "public", catalog = "hrhis")
public class HrisOrganisationunitcompletenessEntity {
    private int id;
    private Integer organisationunitId;
    private int formId;
    private String uid;
    private Integer expectation;
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
    @Column(name = "organisationunit_id")
    public Integer getOrganisationunitId() {
        return organisationunitId;
    }

    public void setOrganisationunitId(Integer organisationunitId) {
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
    @Column(name = "expectation")
    public Integer getExpectation() {
        return expectation;
    }

    public void setExpectation(Integer expectation) {
        this.expectation = expectation;
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
        HrisOrganisationunitcompletenessEntity that = (HrisOrganisationunitcompletenessEntity) o;
        return id == that.id &&
                formId == that.formId &&
                Objects.equals(organisationunitId, that.organisationunitId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(expectation, that.expectation) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, organisationunitId, formId, uid, expectation, datecreated, lastupdated);
    }
}

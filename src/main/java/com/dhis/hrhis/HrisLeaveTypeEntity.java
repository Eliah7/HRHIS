package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_leave_type", schema = "public", catalog = "hrhis")
public class HrisLeaveTypeEntity {
    private int id;
    private Integer fieldId;
    private String name;
    private String uid;
    private Integer maximumDays;
    private String limitApplicable;
    private String description;
    private String paymentApplicable;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "maximum_days")
    public Integer getMaximumDays() {
        return maximumDays;
    }

    public void setMaximumDays(Integer maximumDays) {
        this.maximumDays = maximumDays;
    }

    @Basic
    @Column(name = "limit_applicable")
    public String getLimitApplicable() {
        return limitApplicable;
    }

    public void setLimitApplicable(String limitApplicable) {
        this.limitApplicable = limitApplicable;
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
    @Column(name = "payment_applicable")
    public String getPaymentApplicable() {
        return paymentApplicable;
    }

    public void setPaymentApplicable(String paymentApplicable) {
        this.paymentApplicable = paymentApplicable;
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
        HrisLeaveTypeEntity that = (HrisLeaveTypeEntity) o;
        return id == that.id &&
                Objects.equals(fieldId, that.fieldId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(maximumDays, that.maximumDays) &&
                Objects.equals(limitApplicable, that.limitApplicable) &&
                Objects.equals(description, that.description) &&
                Objects.equals(paymentApplicable, that.paymentApplicable) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fieldId, name, uid, maximumDays, limitApplicable, description, paymentApplicable, datecreated, lastupdated);
    }
}

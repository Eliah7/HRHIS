package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_leave", schema = "public", catalog = "hrhis")
public class HrisLeaveEntity {
    private int id;
    private Integer recordId;
    private Integer leaveTypeId;
    private String uid;
    private String username;
    private Timestamp startdate;
    private Timestamp enddate;
    private int duration;
    private int amount;
    private String leaveBenefitApplicable;
    private String leaveBenefitStatus;
    private String phone;
    private String address;
    private String email;
    private String leaveDestination;
    private String reason;
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
    @Column(name = "record_id")
    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "leave_type_id")
    public Integer getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(Integer leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    @Column(name = "enddate")
    public Timestamp getEnddate() {
        return enddate;
    }

    public void setEnddate(Timestamp enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "duration")
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "amount")
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "leave_benefit_applicable")
    public String getLeaveBenefitApplicable() {
        return leaveBenefitApplicable;
    }

    public void setLeaveBenefitApplicable(String leaveBenefitApplicable) {
        this.leaveBenefitApplicable = leaveBenefitApplicable;
    }

    @Basic
    @Column(name = "leave_benefit_status")
    public String getLeaveBenefitStatus() {
        return leaveBenefitStatus;
    }

    public void setLeaveBenefitStatus(String leaveBenefitStatus) {
        this.leaveBenefitStatus = leaveBenefitStatus;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "leave_destination")
    public String getLeaveDestination() {
        return leaveDestination;
    }

    public void setLeaveDestination(String leaveDestination) {
        this.leaveDestination = leaveDestination;
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
        HrisLeaveEntity that = (HrisLeaveEntity) o;
        return id == that.id &&
                duration == that.duration &&
                amount == that.amount &&
                Objects.equals(recordId, that.recordId) &&
                Objects.equals(leaveTypeId, that.leaveTypeId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(username, that.username) &&
                Objects.equals(startdate, that.startdate) &&
                Objects.equals(enddate, that.enddate) &&
                Objects.equals(leaveBenefitApplicable, that.leaveBenefitApplicable) &&
                Objects.equals(leaveBenefitStatus, that.leaveBenefitStatus) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(email, that.email) &&
                Objects.equals(leaveDestination, that.leaveDestination) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, recordId, leaveTypeId, uid, username, startdate, enddate, duration, amount, leaveBenefitApplicable, leaveBenefitStatus, phone, address, email, leaveDestination, reason, datecreated, lastupdated);
    }
}

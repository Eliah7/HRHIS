package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "hris_leave_relative", schema = "public", catalog = "hrhis")
public class HrisLeaveRelativeEntity {
    private int id;
    private Integer leaveId;
    private String name;
    private Date dateOfBirth;
    private String age;
    private String uid;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "leave_id")
    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
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
    @Column(name = "date_of_birth")
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "age")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisLeaveRelativeEntity that = (HrisLeaveRelativeEntity) o;
        return id == that.id &&
                Objects.equals(leaveId, that.leaveId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(age, that.age) &&
                Objects.equals(uid, that.uid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, leaveId, name, dateOfBirth, age, uid);
    }
}

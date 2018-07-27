package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_participants", schema = "public", catalog = "hrhis")
public class HrisParticipantsEntity {
    private int id;
    private String uid;
    private String username;
    private String firstname;
    private String middlename;
    private String lastname;
    private String currentjobresponsibility;
    private String currentjobtitle;
    private String qualificationandemployement;
    private String town;
    private String district;
    private String region;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "middlename")
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "currentjobresponsibility")
    public String getCurrentjobresponsibility() {
        return currentjobresponsibility;
    }

    public void setCurrentjobresponsibility(String currentjobresponsibility) {
        this.currentjobresponsibility = currentjobresponsibility;
    }

    @Basic
    @Column(name = "currentjobtitle")
    public String getCurrentjobtitle() {
        return currentjobtitle;
    }

    public void setCurrentjobtitle(String currentjobtitle) {
        this.currentjobtitle = currentjobtitle;
    }

    @Basic
    @Column(name = "qualificationandemployement")
    public String getQualificationandemployement() {
        return qualificationandemployement;
    }

    public void setQualificationandemployement(String qualificationandemployement) {
        this.qualificationandemployement = qualificationandemployement;
    }

    @Basic
    @Column(name = "town")
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisParticipantsEntity that = (HrisParticipantsEntity) o;
        return id == that.id &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(username, that.username) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(middlename, that.middlename) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(currentjobresponsibility, that.currentjobresponsibility) &&
                Objects.equals(currentjobtitle, that.currentjobtitle) &&
                Objects.equals(qualificationandemployement, that.qualificationandemployement) &&
                Objects.equals(town, that.town) &&
                Objects.equals(district, that.district) &&
                Objects.equals(region, that.region);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, uid, username, firstname, middlename, lastname, currentjobresponsibility, currentjobtitle, qualificationandemployement, town, district, region);
    }
}

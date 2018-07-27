package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_trainers", schema = "public", catalog = "hrhis")
public class HrisTrainersEntity {
    private int id;
    private String uid;
    private String firstname;
    private String middlename;
    private String lastname;
    private String primaryjobresponsibility;
    private String secondaryjobresponsibility;
    private String profession;
    private String currentjobtitle;
    private String placeofwork;
    private String organisationtype;
    private String trainertype;
    private String trainerlanguage;
    private String traineraffiliation;
    private String experience;
    private String highestlevelofqualification;
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
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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
    @Column(name = "primaryjobresponsibility")
    public String getPrimaryjobresponsibility() {
        return primaryjobresponsibility;
    }

    public void setPrimaryjobresponsibility(String primaryjobresponsibility) {
        this.primaryjobresponsibility = primaryjobresponsibility;
    }

    @Basic
    @Column(name = "secondaryjobresponsibility")
    public String getSecondaryjobresponsibility() {
        return secondaryjobresponsibility;
    }

    public void setSecondaryjobresponsibility(String secondaryjobresponsibility) {
        this.secondaryjobresponsibility = secondaryjobresponsibility;
    }

    @Basic
    @Column(name = "profession")
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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
    @Column(name = "placeofwork")
    public String getPlaceofwork() {
        return placeofwork;
    }

    public void setPlaceofwork(String placeofwork) {
        this.placeofwork = placeofwork;
    }

    @Basic
    @Column(name = "organisationtype")
    public String getOrganisationtype() {
        return organisationtype;
    }

    public void setOrganisationtype(String organisationtype) {
        this.organisationtype = organisationtype;
    }

    @Basic
    @Column(name = "trainertype")
    public String getTrainertype() {
        return trainertype;
    }

    public void setTrainertype(String trainertype) {
        this.trainertype = trainertype;
    }

    @Basic
    @Column(name = "trainerlanguage")
    public String getTrainerlanguage() {
        return trainerlanguage;
    }

    public void setTrainerlanguage(String trainerlanguage) {
        this.trainerlanguage = trainerlanguage;
    }

    @Basic
    @Column(name = "traineraffiliation")
    public String getTraineraffiliation() {
        return traineraffiliation;
    }

    public void setTraineraffiliation(String traineraffiliation) {
        this.traineraffiliation = traineraffiliation;
    }

    @Basic
    @Column(name = "experience")
    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Basic
    @Column(name = "highestlevelofqualification")
    public String getHighestlevelofqualification() {
        return highestlevelofqualification;
    }

    public void setHighestlevelofqualification(String highestlevelofqualification) {
        this.highestlevelofqualification = highestlevelofqualification;
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
        HrisTrainersEntity that = (HrisTrainersEntity) o;
        return id == that.id &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(middlename, that.middlename) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(primaryjobresponsibility, that.primaryjobresponsibility) &&
                Objects.equals(secondaryjobresponsibility, that.secondaryjobresponsibility) &&
                Objects.equals(profession, that.profession) &&
                Objects.equals(currentjobtitle, that.currentjobtitle) &&
                Objects.equals(placeofwork, that.placeofwork) &&
                Objects.equals(organisationtype, that.organisationtype) &&
                Objects.equals(trainertype, that.trainertype) &&
                Objects.equals(trainerlanguage, that.trainerlanguage) &&
                Objects.equals(traineraffiliation, that.traineraffiliation) &&
                Objects.equals(experience, that.experience) &&
                Objects.equals(highestlevelofqualification, that.highestlevelofqualification) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, uid, firstname, middlename, lastname, primaryjobresponsibility, secondaryjobresponsibility, profession, currentjobtitle, placeofwork, organisationtype, trainertype, trainerlanguage, traineraffiliation, experience, highestlevelofqualification, datecreated, lastupdated);
    }
}

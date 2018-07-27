package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_trainings", schema = "public", catalog = "hrhis")
public class HrisTrainingsEntity {
    private int id;
    private String uid;
    private String coursename;
    private String trainingcategory;
    private String traininginstruction;
    private String curiculum;
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
    @Column(name = "coursename")
    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Basic
    @Column(name = "trainingcategory")
    public String getTrainingcategory() {
        return trainingcategory;
    }

    public void setTrainingcategory(String trainingcategory) {
        this.trainingcategory = trainingcategory;
    }

    @Basic
    @Column(name = "traininginstruction")
    public String getTraininginstruction() {
        return traininginstruction;
    }

    public void setTraininginstruction(String traininginstruction) {
        this.traininginstruction = traininginstruction;
    }

    @Basic
    @Column(name = "curiculum")
    public String getCuriculum() {
        return curiculum;
    }

    public void setCuriculum(String curiculum) {
        this.curiculum = curiculum;
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
        HrisTrainingsEntity that = (HrisTrainingsEntity) o;
        return id == that.id &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(coursename, that.coursename) &&
                Objects.equals(trainingcategory, that.trainingcategory) &&
                Objects.equals(traininginstruction, that.traininginstruction) &&
                Objects.equals(curiculum, that.curiculum) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, uid, coursename, trainingcategory, traininginstruction, curiculum, datecreated, lastupdated);
    }
}

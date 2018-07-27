package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_organisationunitstructure", schema = "public", catalog = "hrhis")
public class HrisOrganisationunitstructureEntity {
    private int id;
    private int organisationunitId;
    private Integer levelId;
    private Integer level1Id;
    private Integer level2Id;
    private Integer level3Id;
    private Integer level4Id;
    private Integer level5Id;
    private Integer level6Id;
    private String uid;
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
    public int getOrganisationunitId() {
        return organisationunitId;
    }

    public void setOrganisationunitId(int organisationunitId) {
        this.organisationunitId = organisationunitId;
    }

    @Basic
    @Column(name = "level_id")
    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    @Basic
    @Column(name = "level1_id")
    public Integer getLevel1Id() {
        return level1Id;
    }

    public void setLevel1Id(Integer level1Id) {
        this.level1Id = level1Id;
    }

    @Basic
    @Column(name = "level2_id")
    public Integer getLevel2Id() {
        return level2Id;
    }

    public void setLevel2Id(Integer level2Id) {
        this.level2Id = level2Id;
    }

    @Basic
    @Column(name = "level3_id")
    public Integer getLevel3Id() {
        return level3Id;
    }

    public void setLevel3Id(Integer level3Id) {
        this.level3Id = level3Id;
    }

    @Basic
    @Column(name = "level4_id")
    public Integer getLevel4Id() {
        return level4Id;
    }

    public void setLevel4Id(Integer level4Id) {
        this.level4Id = level4Id;
    }

    @Basic
    @Column(name = "level5_id")
    public Integer getLevel5Id() {
        return level5Id;
    }

    public void setLevel5Id(Integer level5Id) {
        this.level5Id = level5Id;
    }

    @Basic
    @Column(name = "level6_id")
    public Integer getLevel6Id() {
        return level6Id;
    }

    public void setLevel6Id(Integer level6Id) {
        this.level6Id = level6Id;
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
        HrisOrganisationunitstructureEntity that = (HrisOrganisationunitstructureEntity) o;
        return id == that.id &&
                organisationunitId == that.organisationunitId &&
                Objects.equals(levelId, that.levelId) &&
                Objects.equals(level1Id, that.level1Id) &&
                Objects.equals(level2Id, that.level2Id) &&
                Objects.equals(level3Id, that.level3Id) &&
                Objects.equals(level4Id, that.level4Id) &&
                Objects.equals(level5Id, that.level5Id) &&
                Objects.equals(level6Id, that.level6Id) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, organisationunitId, levelId, level1Id, level2Id, level3Id, level4Id, level5Id, level6Id, uid, datecreated, lastupdated);
    }
}

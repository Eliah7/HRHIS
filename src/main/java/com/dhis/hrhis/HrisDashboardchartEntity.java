package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_dashboardchart", schema = "public", catalog = "hrhis")
public class HrisDashboardchartEntity {
    private int id;
    private Integer fieldoneId;
    private Integer fieldtwoId;
    private Integer userId;
    private String uid;
    private String name;
    private String description;
    private String graphtype;
    private boolean lowerlevels;
    private boolean systemwide;
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
    @Column(name = "fieldone_id")
    public Integer getFieldoneId() {
        return fieldoneId;
    }

    public void setFieldoneId(Integer fieldoneId) {
        this.fieldoneId = fieldoneId;
    }

    @Basic
    @Column(name = "fieldtwo_id")
    public Integer getFieldtwoId() {
        return fieldtwoId;
    }

    public void setFieldtwoId(Integer fieldtwoId) {
        this.fieldtwoId = fieldtwoId;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "graphtype")
    public String getGraphtype() {
        return graphtype;
    }

    public void setGraphtype(String graphtype) {
        this.graphtype = graphtype;
    }

    @Basic
    @Column(name = "lowerlevels")
    public boolean isLowerlevels() {
        return lowerlevels;
    }

    public void setLowerlevels(boolean lowerlevels) {
        this.lowerlevels = lowerlevels;
    }

    @Basic
    @Column(name = "systemwide")
    public boolean isSystemwide() {
        return systemwide;
    }

    public void setSystemwide(boolean systemwide) {
        this.systemwide = systemwide;
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
        HrisDashboardchartEntity that = (HrisDashboardchartEntity) o;
        return id == that.id &&
                lowerlevels == that.lowerlevels &&
                systemwide == that.systemwide &&
                Objects.equals(fieldoneId, that.fieldoneId) &&
                Objects.equals(fieldtwoId, that.fieldtwoId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(graphtype, that.graphtype) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fieldoneId, fieldtwoId, userId, uid, name, description, graphtype, lowerlevels, systemwide, datecreated, lastupdated);
    }
}

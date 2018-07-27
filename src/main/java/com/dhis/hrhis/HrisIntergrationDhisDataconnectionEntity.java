package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_intergration_dhis_dataconnection", schema = "public", catalog = "hrhis")
public class HrisIntergrationDhisDataconnectionEntity {
    private int id;
    private Integer parentOrganisationunitId;
    private String uid;
    private String name;
    private String datasetName;
    private String datasetUid;
    private String datasetHtml;
    private String hostUrl;
    private String username;
    private String password;
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
    @Column(name = "parent_organisationunit_id")
    public Integer getParentOrganisationunitId() {
        return parentOrganisationunitId;
    }

    public void setParentOrganisationunitId(Integer parentOrganisationunitId) {
        this.parentOrganisationunitId = parentOrganisationunitId;
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
    @Column(name = "dataset_name")
    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    @Basic
    @Column(name = "dataset_uid")
    public String getDatasetUid() {
        return datasetUid;
    }

    public void setDatasetUid(String datasetUid) {
        this.datasetUid = datasetUid;
    }

    @Basic
    @Column(name = "dataset_html")
    public String getDatasetHtml() {
        return datasetHtml;
    }

    public void setDatasetHtml(String datasetHtml) {
        this.datasetHtml = datasetHtml;
    }

    @Basic
    @Column(name = "host_url")
    public String getHostUrl() {
        return hostUrl;
    }

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        HrisIntergrationDhisDataconnectionEntity that = (HrisIntergrationDhisDataconnectionEntity) o;
        return id == that.id &&
                Objects.equals(parentOrganisationunitId, that.parentOrganisationunitId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(datasetName, that.datasetName) &&
                Objects.equals(datasetUid, that.datasetUid) &&
                Objects.equals(datasetHtml, that.datasetHtml) &&
                Objects.equals(hostUrl, that.hostUrl) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, parentOrganisationunitId, uid, name, datasetName, datasetUid, datasetHtml, hostUrl, username, password, datecreated, lastupdated);
    }
}

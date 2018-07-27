package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_intergration_tiis_data_connection", schema = "public", catalog = "hrhis")
public class HrisIntergrationTiisDataConnectionEntity {
    private int id;
    private Integer organisationunitId;
    private String uid;
    private String name;
    private String recordstablename;
    private String organisationunittablename;
    private String organisationunitlongnamecolumnname;
    private String organisationunitcodecolumnname;
    private String organisationunitownershipcolumnname;
    private String recordsorganisationunitcolumnname;
    private String recordsinstancecolumnname;
    private String tiisparentorganisationunitcode;
    private String hristopmostorganisationunitshrotname;
    private String hrisinstituiongroupname;
    private String hostUrl;
    private String password;
    private String username;
    private String database;
    private String employeeformname;
    private String defaultnationality;
    private String defaulthrnationality;
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
    @Column(name = "recordstablename")
    public String getRecordstablename() {
        return recordstablename;
    }

    public void setRecordstablename(String recordstablename) {
        this.recordstablename = recordstablename;
    }

    @Basic
    @Column(name = "organisationunittablename")
    public String getOrganisationunittablename() {
        return organisationunittablename;
    }

    public void setOrganisationunittablename(String organisationunittablename) {
        this.organisationunittablename = organisationunittablename;
    }

    @Basic
    @Column(name = "organisationunitlongnamecolumnname")
    public String getOrganisationunitlongnamecolumnname() {
        return organisationunitlongnamecolumnname;
    }

    public void setOrganisationunitlongnamecolumnname(String organisationunitlongnamecolumnname) {
        this.organisationunitlongnamecolumnname = organisationunitlongnamecolumnname;
    }

    @Basic
    @Column(name = "organisationunitcodecolumnname")
    public String getOrganisationunitcodecolumnname() {
        return organisationunitcodecolumnname;
    }

    public void setOrganisationunitcodecolumnname(String organisationunitcodecolumnname) {
        this.organisationunitcodecolumnname = organisationunitcodecolumnname;
    }

    @Basic
    @Column(name = "organisationunitownershipcolumnname")
    public String getOrganisationunitownershipcolumnname() {
        return organisationunitownershipcolumnname;
    }

    public void setOrganisationunitownershipcolumnname(String organisationunitownershipcolumnname) {
        this.organisationunitownershipcolumnname = organisationunitownershipcolumnname;
    }

    @Basic
    @Column(name = "recordsorganisationunitcolumnname")
    public String getRecordsorganisationunitcolumnname() {
        return recordsorganisationunitcolumnname;
    }

    public void setRecordsorganisationunitcolumnname(String recordsorganisationunitcolumnname) {
        this.recordsorganisationunitcolumnname = recordsorganisationunitcolumnname;
    }

    @Basic
    @Column(name = "recordsinstancecolumnname")
    public String getRecordsinstancecolumnname() {
        return recordsinstancecolumnname;
    }

    public void setRecordsinstancecolumnname(String recordsinstancecolumnname) {
        this.recordsinstancecolumnname = recordsinstancecolumnname;
    }

    @Basic
    @Column(name = "tiisparentorganisationunitcode")
    public String getTiisparentorganisationunitcode() {
        return tiisparentorganisationunitcode;
    }

    public void setTiisparentorganisationunitcode(String tiisparentorganisationunitcode) {
        this.tiisparentorganisationunitcode = tiisparentorganisationunitcode;
    }

    @Basic
    @Column(name = "hristopmostorganisationunitshrotname")
    public String getHristopmostorganisationunitshrotname() {
        return hristopmostorganisationunitshrotname;
    }

    public void setHristopmostorganisationunitshrotname(String hristopmostorganisationunitshrotname) {
        this.hristopmostorganisationunitshrotname = hristopmostorganisationunitshrotname;
    }

    @Basic
    @Column(name = "hrisinstituiongroupname")
    public String getHrisinstituiongroupname() {
        return hrisinstituiongroupname;
    }

    public void setHrisinstituiongroupname(String hrisinstituiongroupname) {
        this.hrisinstituiongroupname = hrisinstituiongroupname;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    @Column(name = "database")
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    @Basic
    @Column(name = "employeeformname")
    public String getEmployeeformname() {
        return employeeformname;
    }

    public void setEmployeeformname(String employeeformname) {
        this.employeeformname = employeeformname;
    }

    @Basic
    @Column(name = "defaultnationality")
    public String getDefaultnationality() {
        return defaultnationality;
    }

    public void setDefaultnationality(String defaultnationality) {
        this.defaultnationality = defaultnationality;
    }

    @Basic
    @Column(name = "defaulthrnationality")
    public String getDefaulthrnationality() {
        return defaulthrnationality;
    }

    public void setDefaulthrnationality(String defaulthrnationality) {
        this.defaulthrnationality = defaulthrnationality;
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
        HrisIntergrationTiisDataConnectionEntity that = (HrisIntergrationTiisDataConnectionEntity) o;
        return id == that.id &&
                Objects.equals(organisationunitId, that.organisationunitId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(recordstablename, that.recordstablename) &&
                Objects.equals(organisationunittablename, that.organisationunittablename) &&
                Objects.equals(organisationunitlongnamecolumnname, that.organisationunitlongnamecolumnname) &&
                Objects.equals(organisationunitcodecolumnname, that.organisationunitcodecolumnname) &&
                Objects.equals(organisationunitownershipcolumnname, that.organisationunitownershipcolumnname) &&
                Objects.equals(recordsorganisationunitcolumnname, that.recordsorganisationunitcolumnname) &&
                Objects.equals(recordsinstancecolumnname, that.recordsinstancecolumnname) &&
                Objects.equals(tiisparentorganisationunitcode, that.tiisparentorganisationunitcode) &&
                Objects.equals(hristopmostorganisationunitshrotname, that.hristopmostorganisationunitshrotname) &&
                Objects.equals(hrisinstituiongroupname, that.hrisinstituiongroupname) &&
                Objects.equals(hostUrl, that.hostUrl) &&
                Objects.equals(password, that.password) &&
                Objects.equals(username, that.username) &&
                Objects.equals(database, that.database) &&
                Objects.equals(employeeformname, that.employeeformname) &&
                Objects.equals(defaultnationality, that.defaultnationality) &&
                Objects.equals(defaulthrnationality, that.defaulthrnationality) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, organisationunitId, uid, name, recordstablename, organisationunittablename, organisationunitlongnamecolumnname, organisationunitcodecolumnname, organisationunitownershipcolumnname, recordsorganisationunitcolumnname, recordsinstancecolumnname, tiisparentorganisationunitcode, hristopmostorganisationunitshrotname, hrisinstituiongroupname, hostUrl, password, username, database, employeeformname, defaultnationality, defaulthrnationality, datecreated, lastupdated);
    }
}

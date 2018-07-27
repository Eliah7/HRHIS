package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_organisationunit", schema = "public", catalog = "hrhis")
public class HrisOrganisationunitEntity {
    private int id;
    private Integer parentId;
    private String uid;
    private String dhisuid;
    private String code;
    private String shortname;
    private String longname;
    private Boolean active;
    private Date openingdate;
    private Date closingdate;
    private String geocode;
    private String coordinates;
    private String featuretype;
    private String address;
    private String email;
    private String phonenumber;
    private String contactperson;
    private String description;
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
    @Column(name = "parent_id")
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
    @Column(name = "dhisuid")
    public String getDhisuid() {
        return dhisuid;
    }

    public void setDhisuid(String dhisuid) {
        this.dhisuid = dhisuid;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "shortname")
    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    @Basic
    @Column(name = "longname")
    public String getLongname() {
        return longname;
    }

    public void setLongname(String longname) {
        this.longname = longname;
    }

    @Basic
    @Column(name = "active")
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Basic
    @Column(name = "openingdate")
    public Date getOpeningdate() {
        return openingdate;
    }

    public void setOpeningdate(Date openingdate) {
        this.openingdate = openingdate;
    }

    @Basic
    @Column(name = "closingdate")
    public Date getClosingdate() {
        return closingdate;
    }

    public void setClosingdate(Date closingdate) {
        this.closingdate = closingdate;
    }

    @Basic
    @Column(name = "geocode")
    public String getGeocode() {
        return geocode;
    }

    public void setGeocode(String geocode) {
        this.geocode = geocode;
    }

    @Basic
    @Column(name = "coordinates")
    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    @Basic
    @Column(name = "featuretype")
    public String getFeaturetype() {
        return featuretype;
    }

    public void setFeaturetype(String featuretype) {
        this.featuretype = featuretype;
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
    @Column(name = "phonenumber")
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Basic
    @Column(name = "contactperson")
    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
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
        HrisOrganisationunitEntity that = (HrisOrganisationunitEntity) o;
        return id == that.id &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(dhisuid, that.dhisuid) &&
                Objects.equals(code, that.code) &&
                Objects.equals(shortname, that.shortname) &&
                Objects.equals(longname, that.longname) &&
                Objects.equals(active, that.active) &&
                Objects.equals(openingdate, that.openingdate) &&
                Objects.equals(closingdate, that.closingdate) &&
                Objects.equals(geocode, that.geocode) &&
                Objects.equals(coordinates, that.coordinates) &&
                Objects.equals(featuretype, that.featuretype) &&
                Objects.equals(address, that.address) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phonenumber, that.phonenumber) &&
                Objects.equals(contactperson, that.contactperson) &&
                Objects.equals(description, that.description) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, parentId, uid, dhisuid, code, shortname, longname, active, openingdate, closingdate, geocode, coordinates, featuretype, address, email, phonenumber, contactperson, description, datecreated, lastupdated);
    }
}

package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_resourcetable", schema = "public", catalog = "hrhis")
public class HrisResourcetableEntity {
    private int id;
    private String uid;
    private String name;
    private String description;
    private Boolean isgenerating;
    private Timestamp datecreated;
    private Timestamp lastupdated;
    private Timestamp lastgenerated;
    private String messagelog;

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
    @Column(name = "isgenerating")
    public Boolean getIsgenerating() {
        return isgenerating;
    }

    public void setIsgenerating(Boolean isgenerating) {
        this.isgenerating = isgenerating;
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

    @Basic
    @Column(name = "lastgenerated")
    public Timestamp getLastgenerated() {
        return lastgenerated;
    }

    public void setLastgenerated(Timestamp lastgenerated) {
        this.lastgenerated = lastgenerated;
    }

    @Basic
    @Column(name = "messagelog")
    public String getMessagelog() {
        return messagelog;
    }

    public void setMessagelog(String messagelog) {
        this.messagelog = messagelog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisResourcetableEntity that = (HrisResourcetableEntity) o;
        return id == that.id &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(isgenerating, that.isgenerating) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated) &&
                Objects.equals(lastgenerated, that.lastgenerated) &&
                Objects.equals(messagelog, that.messagelog);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, uid, name, description, isgenerating, datecreated, lastupdated, lastgenerated, messagelog);
    }
}

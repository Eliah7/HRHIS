package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_usersettings", schema = "public", catalog = "hrhis")
public class HrisUsersettingsEntity {
    private int id;
    private Integer userId;
    private String uid;
    private boolean emailnotification;
    private boolean smsnotification;
    private boolean completenessalert;
    private boolean qualitycheckalert;
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
    @Column(name = "emailnotification")
    public boolean isEmailnotification() {
        return emailnotification;
    }

    public void setEmailnotification(boolean emailnotification) {
        this.emailnotification = emailnotification;
    }

    @Basic
    @Column(name = "smsnotification")
    public boolean isSmsnotification() {
        return smsnotification;
    }

    public void setSmsnotification(boolean smsnotification) {
        this.smsnotification = smsnotification;
    }

    @Basic
    @Column(name = "completenessalert")
    public boolean isCompletenessalert() {
        return completenessalert;
    }

    public void setCompletenessalert(boolean completenessalert) {
        this.completenessalert = completenessalert;
    }

    @Basic
    @Column(name = "qualitycheckalert")
    public boolean isQualitycheckalert() {
        return qualitycheckalert;
    }

    public void setQualitycheckalert(boolean qualitycheckalert) {
        this.qualitycheckalert = qualitycheckalert;
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
        HrisUsersettingsEntity that = (HrisUsersettingsEntity) o;
        return id == that.id &&
                emailnotification == that.emailnotification &&
                smsnotification == that.smsnotification &&
                completenessalert == that.completenessalert &&
                qualitycheckalert == that.qualitycheckalert &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userId, uid, emailnotification, smsnotification, completenessalert, qualitycheckalert, datecreated, lastupdated);
    }
}

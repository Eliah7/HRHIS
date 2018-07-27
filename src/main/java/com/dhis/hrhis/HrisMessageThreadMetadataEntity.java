package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_message_thread_metadata", schema = "public", catalog = "hrhis")
public class HrisMessageThreadMetadataEntity {
    private int id;
    private Integer threadId;
    private Integer participantId;
    private boolean isDeleted;
    private Timestamp lastParticipantMessageDate;
    private Timestamp lastMessageDate;
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
    @Column(name = "thread_id")
    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    @Basic
    @Column(name = "participant_id")
    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    @Basic
    @Column(name = "is_deleted")
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Basic
    @Column(name = "last_participant_message_date")
    public Timestamp getLastParticipantMessageDate() {
        return lastParticipantMessageDate;
    }

    public void setLastParticipantMessageDate(Timestamp lastParticipantMessageDate) {
        this.lastParticipantMessageDate = lastParticipantMessageDate;
    }

    @Basic
    @Column(name = "last_message_date")
    public Timestamp getLastMessageDate() {
        return lastMessageDate;
    }

    public void setLastMessageDate(Timestamp lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
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
        HrisMessageThreadMetadataEntity that = (HrisMessageThreadMetadataEntity) o;
        return id == that.id &&
                isDeleted == that.isDeleted &&
                Objects.equals(threadId, that.threadId) &&
                Objects.equals(participantId, that.participantId) &&
                Objects.equals(lastParticipantMessageDate, that.lastParticipantMessageDate) &&
                Objects.equals(lastMessageDate, that.lastMessageDate) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, threadId, participantId, isDeleted, lastParticipantMessageDate, lastMessageDate, uid, datecreated, lastupdated);
    }
}

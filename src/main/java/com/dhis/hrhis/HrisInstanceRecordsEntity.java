package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_instance_records", schema = "public", catalog = "hrhis")
public class HrisInstanceRecordsEntity {
    private int id;
    private String uid;
    private int instanceId;
    private int recordId;

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
    @Column(name = "instance_id")
    public int getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    @Basic
    @Column(name = "record_id")
    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisInstanceRecordsEntity that = (HrisInstanceRecordsEntity) o;
        return id == that.id &&
                instanceId == that.instanceId &&
                recordId == that.recordId &&
                Objects.equals(uid, that.uid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, uid, instanceId, recordId);
    }
}

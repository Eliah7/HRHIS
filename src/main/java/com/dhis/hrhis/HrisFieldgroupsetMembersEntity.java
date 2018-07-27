package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_fieldgroupset_members", schema = "public", catalog = "hrhis")
public class HrisFieldgroupsetMembersEntity {
    private int fieldgroupsetId;
    private int fieldgroupId;

    @Basic
    @Column(name = "fieldgroupset_id")
    public int getFieldgroupsetId() {
        return fieldgroupsetId;
    }

    public void setFieldgroupsetId(int fieldgroupsetId) {
        this.fieldgroupsetId = fieldgroupsetId;
    }

    @Basic
    @Column(name = "fieldgroup_id")
    public int getFieldgroupId() {
        return fieldgroupId;
    }

    public void setFieldgroupId(int fieldgroupId) {
        this.fieldgroupId = fieldgroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisFieldgroupsetMembersEntity that = (HrisFieldgroupsetMembersEntity) o;
        return fieldgroupsetId == that.fieldgroupsetId &&
                fieldgroupId == that.fieldgroupId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(fieldgroupsetId, fieldgroupId);
    }
}

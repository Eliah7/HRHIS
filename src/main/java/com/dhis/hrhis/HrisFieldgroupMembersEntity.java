package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_fieldgroup_members", schema = "public", catalog = "hrhis")
public class HrisFieldgroupMembersEntity {
    private int fieldgroupId;
    private int fieldId;

    @Basic
    @Column(name = "fieldgroup_id")
    public int getFieldgroupId() {
        return fieldgroupId;
    }

    public void setFieldgroupId(int fieldgroupId) {
        this.fieldgroupId = fieldgroupId;
    }

    @Basic
    @Column(name = "field_id")
    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisFieldgroupMembersEntity that = (HrisFieldgroupMembersEntity) o;
        return fieldgroupId == that.fieldgroupId &&
                fieldId == that.fieldId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(fieldgroupId, fieldId);
    }
}

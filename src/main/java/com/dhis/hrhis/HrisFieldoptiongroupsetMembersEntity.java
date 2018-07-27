package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_fieldoptiongroupset_members", schema = "public", catalog = "hrhis")
public class HrisFieldoptiongroupsetMembersEntity {
    private int fieldoptiongroupsetId;
    private int fieldoptiongroupId;

    @Basic
    @Column(name = "fieldoptiongroupset_id")
    public int getFieldoptiongroupsetId() {
        return fieldoptiongroupsetId;
    }

    public void setFieldoptiongroupsetId(int fieldoptiongroupsetId) {
        this.fieldoptiongroupsetId = fieldoptiongroupsetId;
    }

    @Basic
    @Column(name = "fieldoptiongroup_id")
    public int getFieldoptiongroupId() {
        return fieldoptiongroupId;
    }

    public void setFieldoptiongroupId(int fieldoptiongroupId) {
        this.fieldoptiongroupId = fieldoptiongroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisFieldoptiongroupsetMembersEntity that = (HrisFieldoptiongroupsetMembersEntity) o;
        return fieldoptiongroupsetId == that.fieldoptiongroupsetId &&
                fieldoptiongroupId == that.fieldoptiongroupId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(fieldoptiongroupsetId, fieldoptiongroupId);
    }
}

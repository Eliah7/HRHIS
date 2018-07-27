package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_fieldoptiongroup_members", schema = "public", catalog = "hrhis")
public class HrisFieldoptiongroupMembersEntity {
    private int fieldoptiongroupId;
    private int fieldoptionId;

    @Basic
    @Column(name = "fieldoptiongroup_id")
    public int getFieldoptiongroupId() {
        return fieldoptiongroupId;
    }

    public void setFieldoptiongroupId(int fieldoptiongroupId) {
        this.fieldoptiongroupId = fieldoptiongroupId;
    }

    @Basic
    @Column(name = "fieldoption_id")
    public int getFieldoptionId() {
        return fieldoptionId;
    }

    public void setFieldoptionId(int fieldoptionId) {
        this.fieldoptionId = fieldoptionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisFieldoptiongroupMembersEntity that = (HrisFieldoptiongroupMembersEntity) o;
        return fieldoptiongroupId == that.fieldoptiongroupId &&
                fieldoptionId == that.fieldoptionId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(fieldoptiongroupId, fieldoptionId);
    }
}

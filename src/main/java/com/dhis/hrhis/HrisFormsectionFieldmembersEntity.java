package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_formsection_fieldmembers", schema = "public", catalog = "hrhis")
public class HrisFormsectionFieldmembersEntity {
    private int formsectionId;
    private int fieldId;
    private int sort;

    @Basic
    @Column(name = "formsection_id")
    public int getFormsectionId() {
        return formsectionId;
    }

    public void setFormsectionId(int formsectionId) {
        this.formsectionId = formsectionId;
    }

    @Basic
    @Column(name = "field_id")
    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    @Basic
    @Column(name = "sort")
    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisFormsectionFieldmembersEntity that = (HrisFormsectionFieldmembersEntity) o;
        return formsectionId == that.formsectionId &&
                fieldId == that.fieldId &&
                sort == that.sort;
    }

    @Override
    public int hashCode() {

        return Objects.hash(formsectionId, fieldId, sort);
    }
}

package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_resourcetable_fieldmembers", schema = "public", catalog = "hrhis")
public class HrisResourcetableFieldmembersEntity {
    private int resourcetableId;
    private int fieldId;
    private int sort;

    @Basic
    @Column(name = "resourcetable_id")
    public int getResourcetableId() {
        return resourcetableId;
    }

    public void setResourcetableId(int resourcetableId) {
        this.resourcetableId = resourcetableId;
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
        HrisResourcetableFieldmembersEntity that = (HrisResourcetableFieldmembersEntity) o;
        return resourcetableId == that.resourcetableId &&
                fieldId == that.fieldId &&
                sort == that.sort;
    }

    @Override
    public int hashCode() {

        return Objects.hash(resourcetableId, fieldId, sort);
    }
}

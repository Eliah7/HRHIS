package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_form_fieldmembers", schema = "public", catalog = "hrhis")
public class HrisFormFieldmembersEntity {
    private int formId;
    private int fieldId;
    private int sort;

    @Basic
    @Column(name = "form_id")
    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
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
        HrisFormFieldmembersEntity that = (HrisFormFieldmembersEntity) o;
        return formId == that.formId &&
                fieldId == that.fieldId &&
                sort == that.sort;
    }

    @Override
    public int hashCode() {

        return Objects.hash(formId, fieldId, sort);
    }
}

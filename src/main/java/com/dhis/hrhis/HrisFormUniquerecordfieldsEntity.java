package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_form_uniquerecordfields", schema = "public", catalog = "hrhis")
public class HrisFormUniquerecordfieldsEntity {
    private int formId;
    private int fieldId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisFormUniquerecordfieldsEntity that = (HrisFormUniquerecordfieldsEntity) o;
        return formId == that.formId &&
                fieldId == that.fieldId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(formId, fieldId);
    }
}

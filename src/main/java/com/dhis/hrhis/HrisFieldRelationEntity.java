package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_field_relation", schema = "public", catalog = "hrhis")
public class HrisFieldRelationEntity {
    private int parentField;
    private int childField;

    @Basic
    @Column(name = "parent_field")
    public int getParentField() {
        return parentField;
    }

    public void setParentField(int parentField) {
        this.parentField = parentField;
    }

    @Basic
    @Column(name = "child_field")
    public int getChildField() {
        return childField;
    }

    public void setChildField(int childField) {
        this.childField = childField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisFieldRelationEntity that = (HrisFieldRelationEntity) o;
        return parentField == that.parentField &&
                childField == that.childField;
    }

    @Override
    public int hashCode() {

        return Objects.hash(parentField, childField);
    }
}

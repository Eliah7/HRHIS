package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_fieldoption_children", schema = "public", catalog = "hrhis")
public class HrisFieldoptionChildrenEntity {
    private int parentFieldoption;
    private int childFieldoption;

    @Basic
    @Column(name = "parent_fieldoption")
    public int getParentFieldoption() {
        return parentFieldoption;
    }

    public void setParentFieldoption(int parentFieldoption) {
        this.parentFieldoption = parentFieldoption;
    }

    @Basic
    @Column(name = "child_fieldoption")
    public int getChildFieldoption() {
        return childFieldoption;
    }

    public void setChildFieldoption(int childFieldoption) {
        this.childFieldoption = childFieldoption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisFieldoptionChildrenEntity that = (HrisFieldoptionChildrenEntity) o;
        return parentFieldoption == that.parentFieldoption &&
                childFieldoption == that.childFieldoption;
    }

    @Override
    public int hashCode() {

        return Objects.hash(parentFieldoption, childFieldoption);
    }
}

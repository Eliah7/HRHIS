package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_friendlyreportcategory", schema = "public", catalog = "hrhis")
public class HrisFriendlyreportcategoryEntity {
    private int friendlyreportId;
    private int fieldoptiongroupId;
    private int sort;

    @Basic
    @Column(name = "friendlyreport_id")
    public int getFriendlyreportId() {
        return friendlyreportId;
    }

    public void setFriendlyreportId(int friendlyreportId) {
        this.friendlyreportId = friendlyreportId;
    }

    @Basic
    @Column(name = "fieldoptiongroup_id")
    public int getFieldoptiongroupId() {
        return fieldoptiongroupId;
    }

    public void setFieldoptiongroupId(int fieldoptiongroupId) {
        this.fieldoptiongroupId = fieldoptiongroupId;
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
        HrisFriendlyreportcategoryEntity that = (HrisFriendlyreportcategoryEntity) o;
        return friendlyreportId == that.friendlyreportId &&
                fieldoptiongroupId == that.fieldoptiongroupId &&
                sort == that.sort;
    }

    @Override
    public int hashCode() {

        return Objects.hash(friendlyreportId, fieldoptiongroupId, sort);
    }
}

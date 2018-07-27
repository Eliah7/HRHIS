package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_relationalfilter_member", schema = "public", catalog = "hrhis")
public class HrisRelationalfilterMemberEntity {
    private int relationalfilterId;
    private int fieldoptionId;

    @Basic
    @Column(name = "relationalfilter_id")
    public int getRelationalfilterId() {
        return relationalfilterId;
    }

    public void setRelationalfilterId(int relationalfilterId) {
        this.relationalfilterId = relationalfilterId;
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
        HrisRelationalfilterMemberEntity that = (HrisRelationalfilterMemberEntity) o;
        return relationalfilterId == that.relationalfilterId &&
                fieldoptionId == that.fieldoptionId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(relationalfilterId, fieldoptionId);
    }
}

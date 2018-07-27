package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_intergration_dhis_fieldoptiongroupsetmember", schema = "public", catalog = "hrhis")
public class HrisIntergrationDhisFieldoptiongroupsetmemberEntity {
    private int dhisDataConnectionId;
    private int fieldOptionGroupsetId;

    @Basic
    @Column(name = "dhis_data_connection_id")
    public int getDhisDataConnectionId() {
        return dhisDataConnectionId;
    }

    public void setDhisDataConnectionId(int dhisDataConnectionId) {
        this.dhisDataConnectionId = dhisDataConnectionId;
    }

    @Basic
    @Column(name = "field_option_groupset_id")
    public int getFieldOptionGroupsetId() {
        return fieldOptionGroupsetId;
    }

    public void setFieldOptionGroupsetId(int fieldOptionGroupsetId) {
        this.fieldOptionGroupsetId = fieldOptionGroupsetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisIntergrationDhisFieldoptiongroupsetmemberEntity that = (HrisIntergrationDhisFieldoptiongroupsetmemberEntity) o;
        return dhisDataConnectionId == that.dhisDataConnectionId &&
                fieldOptionGroupsetId == that.fieldOptionGroupsetId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(dhisDataConnectionId, fieldOptionGroupsetId);
    }
}

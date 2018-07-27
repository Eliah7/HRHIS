package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_intergration_tiis_employee_fieldrelation", schema = "public", catalog = "hrhis")
public class HrisIntergrationTiisEmployeeFieldrelationEntity {
    private int tiisDataConnectionId;
    private Integer fieldId;
    private String columnname;

    @Basic
    @Column(name = "tiis_data_connection_id")
    public int getTiisDataConnectionId() {
        return tiisDataConnectionId;
    }

    public void setTiisDataConnectionId(int tiisDataConnectionId) {
        this.tiisDataConnectionId = tiisDataConnectionId;
    }

    @Basic
    @Column(name = "field_id")
    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    @Basic
    @Column(name = "columnname")
    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisIntergrationTiisEmployeeFieldrelationEntity that = (HrisIntergrationTiisEmployeeFieldrelationEntity) o;
        return tiisDataConnectionId == that.tiisDataConnectionId &&
                Objects.equals(fieldId, that.fieldId) &&
                Objects.equals(columnname, that.columnname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tiisDataConnectionId, fieldId, columnname);
    }
}

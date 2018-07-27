package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_intergration_dhis_dataelementfieldoptionrelation", schema = "public", catalog = "hrhis")
public class HrisIntergrationDhisDataelementfieldoptionrelationEntity {
    private int dhisDataConnectionId;
    private Integer columnFieldoptionGroupId;
    private Integer rowFieldoptionGroupId;
    private String dataelementuid;
    private String dataelementname;
    private String categorycombouid;
    private String categorycomboname;

    @Basic
    @Column(name = "dhis_data_connection_id")
    public int getDhisDataConnectionId() {
        return dhisDataConnectionId;
    }

    public void setDhisDataConnectionId(int dhisDataConnectionId) {
        this.dhisDataConnectionId = dhisDataConnectionId;
    }

    @Basic
    @Column(name = "column_fieldoption_group_id")
    public Integer getColumnFieldoptionGroupId() {
        return columnFieldoptionGroupId;
    }

    public void setColumnFieldoptionGroupId(Integer columnFieldoptionGroupId) {
        this.columnFieldoptionGroupId = columnFieldoptionGroupId;
    }

    @Basic
    @Column(name = "row_fieldoption_group_id")
    public Integer getRowFieldoptionGroupId() {
        return rowFieldoptionGroupId;
    }

    public void setRowFieldoptionGroupId(Integer rowFieldoptionGroupId) {
        this.rowFieldoptionGroupId = rowFieldoptionGroupId;
    }

    @Basic
    @Column(name = "dataelementuid")
    public String getDataelementuid() {
        return dataelementuid;
    }

    public void setDataelementuid(String dataelementuid) {
        this.dataelementuid = dataelementuid;
    }

    @Basic
    @Column(name = "dataelementname")
    public String getDataelementname() {
        return dataelementname;
    }

    public void setDataelementname(String dataelementname) {
        this.dataelementname = dataelementname;
    }

    @Basic
    @Column(name = "categorycombouid")
    public String getCategorycombouid() {
        return categorycombouid;
    }

    public void setCategorycombouid(String categorycombouid) {
        this.categorycombouid = categorycombouid;
    }

    @Basic
    @Column(name = "categorycomboname")
    public String getCategorycomboname() {
        return categorycomboname;
    }

    public void setCategorycomboname(String categorycomboname) {
        this.categorycomboname = categorycomboname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisIntergrationDhisDataelementfieldoptionrelationEntity that = (HrisIntergrationDhisDataelementfieldoptionrelationEntity) o;
        return dhisDataConnectionId == that.dhisDataConnectionId &&
                Objects.equals(columnFieldoptionGroupId, that.columnFieldoptionGroupId) &&
                Objects.equals(rowFieldoptionGroupId, that.rowFieldoptionGroupId) &&
                Objects.equals(dataelementuid, that.dataelementuid) &&
                Objects.equals(dataelementname, that.dataelementname) &&
                Objects.equals(categorycombouid, that.categorycombouid) &&
                Objects.equals(categorycomboname, that.categorycomboname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dhisDataConnectionId, columnFieldoptionGroupId, rowFieldoptionGroupId, dataelementuid, dataelementname, categorycombouid, categorycomboname);
    }
}

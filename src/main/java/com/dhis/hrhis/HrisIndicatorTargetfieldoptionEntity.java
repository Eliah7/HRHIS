package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_indicator_targetfieldoption", schema = "public", catalog = "hrhis")
public class HrisIndicatorTargetfieldoptionEntity {
    private int targetId;
    private int fieldoptionId;
    private int value;
    private Integer maxValue;

    @Basic
    @Column(name = "target_id")
    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    @Basic
    @Column(name = "fieldoption_id")
    public int getFieldoptionId() {
        return fieldoptionId;
    }

    public void setFieldoptionId(int fieldoptionId) {
        this.fieldoptionId = fieldoptionId;
    }

    @Basic
    @Column(name = "value")
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Basic
    @Column(name = "max_value")
    public Integer getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisIndicatorTargetfieldoptionEntity that = (HrisIndicatorTargetfieldoptionEntity) o;
        return targetId == that.targetId &&
                fieldoptionId == that.fieldoptionId &&
                value == that.value &&
                Objects.equals(maxValue, that.maxValue);
    }

    @Override
    public int hashCode() {

        return Objects.hash(targetId, fieldoptionId, value, maxValue);
    }
}

package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_friendlyreport_arithmeticfilter", schema = "public", catalog = "hrhis")
public class HrisFriendlyreportArithmeticfilterEntity {
    private int friendlyreportId;
    private int arithmeticfilterId;

    @Basic
    @Column(name = "friendlyreport_id")
    public int getFriendlyreportId() {
        return friendlyreportId;
    }

    public void setFriendlyreportId(int friendlyreportId) {
        this.friendlyreportId = friendlyreportId;
    }

    @Basic
    @Column(name = "arithmeticfilter_id")
    public int getArithmeticfilterId() {
        return arithmeticfilterId;
    }

    public void setArithmeticfilterId(int arithmeticfilterId) {
        this.arithmeticfilterId = arithmeticfilterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisFriendlyreportArithmeticfilterEntity that = (HrisFriendlyreportArithmeticfilterEntity) o;
        return friendlyreportId == that.friendlyreportId &&
                arithmeticfilterId == that.arithmeticfilterId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(friendlyreportId, arithmeticfilterId);
    }
}

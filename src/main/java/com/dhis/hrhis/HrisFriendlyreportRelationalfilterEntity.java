package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_friendlyreport_relationalfilter", schema = "public", catalog = "hrhis")
public class HrisFriendlyreportRelationalfilterEntity {
    private int friendlyreportId;
    private int relationalfilterId;

    @Basic
    @Column(name = "friendlyreport_id")
    public int getFriendlyreportId() {
        return friendlyreportId;
    }

    public void setFriendlyreportId(int friendlyreportId) {
        this.friendlyreportId = friendlyreportId;
    }

    @Basic
    @Column(name = "relationalfilter_id")
    public int getRelationalfilterId() {
        return relationalfilterId;
    }

    public void setRelationalfilterId(int relationalfilterId) {
        this.relationalfilterId = relationalfilterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisFriendlyreportRelationalfilterEntity that = (HrisFriendlyreportRelationalfilterEntity) o;
        return friendlyreportId == that.friendlyreportId &&
                relationalfilterId == that.relationalfilterId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(friendlyreportId, relationalfilterId);
    }
}

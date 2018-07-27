package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_dashboardchart_organisationunitmembers", schema = "public", catalog = "hrhis")
public class HrisDashboardchartOrganisationunitmembersEntity {
    private int dashboardchartId;
    private int organisationunitId;

    @Basic
    @Column(name = "dashboardchart_id")
    public int getDashboardchartId() {
        return dashboardchartId;
    }

    public void setDashboardchartId(int dashboardchartId) {
        this.dashboardchartId = dashboardchartId;
    }

    @Basic
    @Column(name = "organisationunit_id")
    public int getOrganisationunitId() {
        return organisationunitId;
    }

    public void setOrganisationunitId(int organisationunitId) {
        this.organisationunitId = organisationunitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisDashboardchartOrganisationunitmembersEntity that = (HrisDashboardchartOrganisationunitmembersEntity) o;
        return dashboardchartId == that.dashboardchartId &&
                organisationunitId == that.organisationunitId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(dashboardchartId, organisationunitId);
    }
}

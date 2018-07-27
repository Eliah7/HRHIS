package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_dashboardchart_formmembers", schema = "public", catalog = "hrhis")
public class HrisDashboardchartFormmembersEntity {
    private int dashboardchartId;
    private int formId;

    @Basic
    @Column(name = "dashboardchart_id")
    public int getDashboardchartId() {
        return dashboardchartId;
    }

    public void setDashboardchartId(int dashboardchartId) {
        this.dashboardchartId = dashboardchartId;
    }

    @Basic
    @Column(name = "form_id")
    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisDashboardchartFormmembersEntity that = (HrisDashboardchartFormmembersEntity) o;
        return dashboardchartId == that.dashboardchartId &&
                formId == that.formId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(dashboardchartId, formId);
    }
}

package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_organisationunitgroup_members", schema = "public", catalog = "hrhis")
public class HrisOrganisationunitgroupMembersEntity {
    private int organisationunitgroupId;
    private int organisationunitId;

    @Basic
    @Column(name = "organisationunitgroup_id")
    public int getOrganisationunitgroupId() {
        return organisationunitgroupId;
    }

    public void setOrganisationunitgroupId(int organisationunitgroupId) {
        this.organisationunitgroupId = organisationunitgroupId;
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
        HrisOrganisationunitgroupMembersEntity that = (HrisOrganisationunitgroupMembersEntity) o;
        return organisationunitgroupId == that.organisationunitgroupId &&
                organisationunitId == that.organisationunitId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(organisationunitgroupId, organisationunitId);
    }
}

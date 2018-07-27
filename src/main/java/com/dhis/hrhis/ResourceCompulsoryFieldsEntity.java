package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "_resource_compulsory_fields", schema = "public", catalog = "hrhis")
public class ResourceCompulsoryFieldsEntity {
    private int id;
    private String instance;
    private String level1Mohsw;
    private String level2Categories;
    private String level3RegionsDepartmentsInstitutionsReferrals;
    private String level4DistrictsRegHospitals;
    private String level5Facility;
    private String type;
    private String ownership;
    private String organisationunitName;
    private String formName;
    private Integer organisationunitId;
    private Integer formId;
    private Timestamp lastupdated;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "instance")
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    @Basic
    @Column(name = "level1_mohsw")
    public String getLevel1Mohsw() {
        return level1Mohsw;
    }

    public void setLevel1Mohsw(String level1Mohsw) {
        this.level1Mohsw = level1Mohsw;
    }

    @Basic
    @Column(name = "level2_categories")
    public String getLevel2Categories() {
        return level2Categories;
    }

    public void setLevel2Categories(String level2Categories) {
        this.level2Categories = level2Categories;
    }

    @Basic
    @Column(name = "level3_regions_departments_institutions_referrals")
    public String getLevel3RegionsDepartmentsInstitutionsReferrals() {
        return level3RegionsDepartmentsInstitutionsReferrals;
    }

    public void setLevel3RegionsDepartmentsInstitutionsReferrals(String level3RegionsDepartmentsInstitutionsReferrals) {
        this.level3RegionsDepartmentsInstitutionsReferrals = level3RegionsDepartmentsInstitutionsReferrals;
    }

    @Basic
    @Column(name = "level4_districts_reg_hospitals")
    public String getLevel4DistrictsRegHospitals() {
        return level4DistrictsRegHospitals;
    }

    public void setLevel4DistrictsRegHospitals(String level4DistrictsRegHospitals) {
        this.level4DistrictsRegHospitals = level4DistrictsRegHospitals;
    }

    @Basic
    @Column(name = "level5_facility")
    public String getLevel5Facility() {
        return level5Facility;
    }

    public void setLevel5Facility(String level5Facility) {
        this.level5Facility = level5Facility;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "ownership")
    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    @Basic
    @Column(name = "organisationunit_name")
    public String getOrganisationunitName() {
        return organisationunitName;
    }

    public void setOrganisationunitName(String organisationunitName) {
        this.organisationunitName = organisationunitName;
    }

    @Basic
    @Column(name = "form_name")
    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    @Basic
    @Column(name = "organisationunit_id")
    public Integer getOrganisationunitId() {
        return organisationunitId;
    }

    public void setOrganisationunitId(Integer organisationunitId) {
        this.organisationunitId = organisationunitId;
    }

    @Basic
    @Column(name = "form_id")
    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    @Basic
    @Column(name = "lastupdated")
    public Timestamp getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Timestamp lastupdated) {
        this.lastupdated = lastupdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResourceCompulsoryFieldsEntity that = (ResourceCompulsoryFieldsEntity) o;
        return id == that.id &&
                Objects.equals(instance, that.instance) &&
                Objects.equals(level1Mohsw, that.level1Mohsw) &&
                Objects.equals(level2Categories, that.level2Categories) &&
                Objects.equals(level3RegionsDepartmentsInstitutionsReferrals, that.level3RegionsDepartmentsInstitutionsReferrals) &&
                Objects.equals(level4DistrictsRegHospitals, that.level4DistrictsRegHospitals) &&
                Objects.equals(level5Facility, that.level5Facility) &&
                Objects.equals(type, that.type) &&
                Objects.equals(ownership, that.ownership) &&
                Objects.equals(organisationunitName, that.organisationunitName) &&
                Objects.equals(formName, that.formName) &&
                Objects.equals(organisationunitId, that.organisationunitId) &&
                Objects.equals(formId, that.formId) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, instance, level1Mohsw, level2Categories, level3RegionsDepartmentsInstitutionsReferrals, level4DistrictsRegHospitals, level5Facility, type, ownership, organisationunitName, formName, organisationunitId, formId, lastupdated);
    }
}

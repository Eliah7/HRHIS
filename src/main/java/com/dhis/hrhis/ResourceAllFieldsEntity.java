package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "_resource_all_fields", schema = "public", catalog = "hrhis")
public class ResourceAllFieldsEntity {
    private int id;
    private String instance;
    private String firstname;
    private String middlename;
    private String surname;
    private Date surnameLastUpdated;
    private String surnameLastUpdatedMonthText;
    private Integer surnameLastUpdatedYear;
    private String sex;
    private Date dob;
    private String dobMonthText;
    private Integer dobYear;
    private String basicEducationLevel;
    private String eduEvel;
    private Date eduEvelLastUpdated;
    private String eduEvelLastUpdatedMonthText;
    private Integer eduEvelLastUpdatedYear;
    private String profession;
    private Date professionLastUpdated;
    private String professionLastUpdatedMonthText;
    private Integer professionLastUpdatedYear;
    private String designation;
    private Date designationLastUpdated;
    private String designationLastUpdatedMonthText;
    private Integer designationLastUpdatedYear;
    private String hospDesignation;
    private Date hospDesignationLastUpdated;
    private String hospDesignationLastUpdatedMonthText;
    private Integer hospDesignationLastUpdatedYear;
    private Date firstAppointment;
    private String firstAppointmentMonthText;
    private Integer firstAppointmentYear;
    private Date confirmationDate;
    private String confirmationDateMonthText;
    private Integer confirmationDateYear;
    private Date lastPromo;
    private String lastPromoMonthText;
    private Integer lastPromoYear;
    private Date lastPromoLastUpdated;
    private String lastPromoLastUpdatedMonthText;
    private Integer lastPromoLastUpdatedYear;
    private String employer;
    private String employmentStatus;
    private Date employmentStatusLastUpdated;
    private String employmentStatusLastUpdatedMonthText;
    private Integer employmentStatusLastUpdatedYear;
    private String employmentTerms;
    private Date employmentTermsLastUpdated;
    private String employmentTermsLastUpdatedMonthText;
    private Integer employmentTermsLastUpdatedYear;
    private String employmentduration;
    private String marital;
    private Date maritalLastUpdated;
    private String maritalLastUpdatedMonthText;
    private Integer maritalLastUpdatedYear;
    private String checkNo;
    private String fileNo;
    private String department;
    private Date departmentLastUpdated;
    private String departmentLastUpdatedMonthText;
    private Integer departmentLastUpdatedYear;
    private String hospDept;
    private String superlative;
    private Date superlativeLastUpdated;
    private String superlativeLastUpdatedMonthText;
    private Integer superlativeLastUpdatedYear;
    private String hospSuperlativePost;
    private String salaryScale;
    private Date salaryScaleLastUpdated;
    private String salaryScaleLastUpdatedMonthText;
    private Integer salaryScaleLastUpdatedYear;
    private String hospSalaryScale;
    private Double salary;
    private Date salaryLastUpdated;
    private String salaryLastUpdatedMonthText;
    private Integer salaryLastUpdatedYear;
    private String domicile;
    private String contact;
    private String contactOfNextOfKin;
    private String relationNextKin;
    private String disability;
    private String nationality;
    private String nextKin;
    private Integer numberOfChildren;
    private String regNo;
    private String agedistribution;
    private Date agedistributionLastUpdated;
    private String agedistributionLastUpdatedMonthText;
    private Integer agedistributionLastUpdatedYear;
    private Integer age;
    private Integer retirementdistribution;
    private Date retirementdistributionLastUpdated;
    private String retirementdistributionLastUpdatedMonthText;
    private Integer retirementdistributionLastUpdatedYear;
    private Integer employmentdistribution;
    private Date employmentdistributionLastUpdated;
    private String employmentdistributionLastUpdatedMonthText;
    private Integer employmentdistributionLastUpdatedYear;
    private String email;
    private String religion;
    private Date religionLastUpdated;
    private String religionLastUpdatedMonthText;
    private Integer religionLastUpdatedYear;
    private Date retirementdate;
    private String retirementdateMonthText;
    private Integer retirementdateYear;
    private String level1Mohcdgec;
    private String level2Categories;
    private String level3RegionsDepartmentsInstitutionsReferrals;
    private String level4DistrictsRegHospitals;
    private String level5Facility;
    private String type;
    private String ownership;
    private String organisationunitName;
    private Integer level;
    private String levelname;
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
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "middlename")
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "surname_last_updated")
    public Date getSurnameLastUpdated() {
        return surnameLastUpdated;
    }

    public void setSurnameLastUpdated(Date surnameLastUpdated) {
        this.surnameLastUpdated = surnameLastUpdated;
    }

    @Basic
    @Column(name = "surname_last_updated_month_text")
    public String getSurnameLastUpdatedMonthText() {
        return surnameLastUpdatedMonthText;
    }

    public void setSurnameLastUpdatedMonthText(String surnameLastUpdatedMonthText) {
        this.surnameLastUpdatedMonthText = surnameLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "surname_last_updated_year")
    public Integer getSurnameLastUpdatedYear() {
        return surnameLastUpdatedYear;
    }

    public void setSurnameLastUpdatedYear(Integer surnameLastUpdatedYear) {
        this.surnameLastUpdatedYear = surnameLastUpdatedYear;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "dob")
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "dob_month_text")
    public String getDobMonthText() {
        return dobMonthText;
    }

    public void setDobMonthText(String dobMonthText) {
        this.dobMonthText = dobMonthText;
    }

    @Basic
    @Column(name = "dob_year")
    public Integer getDobYear() {
        return dobYear;
    }

    public void setDobYear(Integer dobYear) {
        this.dobYear = dobYear;
    }

    @Basic
    @Column(name = "basic_education_level")
    public String getBasicEducationLevel() {
        return basicEducationLevel;
    }

    public void setBasicEducationLevel(String basicEducationLevel) {
        this.basicEducationLevel = basicEducationLevel;
    }

    @Basic
    @Column(name = "edu_evel")
    public String getEduEvel() {
        return eduEvel;
    }

    public void setEduEvel(String eduEvel) {
        this.eduEvel = eduEvel;
    }

    @Basic
    @Column(name = "edu_evel_last_updated")
    public Date getEduEvelLastUpdated() {
        return eduEvelLastUpdated;
    }

    public void setEduEvelLastUpdated(Date eduEvelLastUpdated) {
        this.eduEvelLastUpdated = eduEvelLastUpdated;
    }

    @Basic
    @Column(name = "edu_evel_last_updated_month_text")
    public String getEduEvelLastUpdatedMonthText() {
        return eduEvelLastUpdatedMonthText;
    }

    public void setEduEvelLastUpdatedMonthText(String eduEvelLastUpdatedMonthText) {
        this.eduEvelLastUpdatedMonthText = eduEvelLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "edu_evel_last_updated_year")
    public Integer getEduEvelLastUpdatedYear() {
        return eduEvelLastUpdatedYear;
    }

    public void setEduEvelLastUpdatedYear(Integer eduEvelLastUpdatedYear) {
        this.eduEvelLastUpdatedYear = eduEvelLastUpdatedYear;
    }

    @Basic
    @Column(name = "profession")
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Basic
    @Column(name = "profession_last_updated")
    public Date getProfessionLastUpdated() {
        return professionLastUpdated;
    }

    public void setProfessionLastUpdated(Date professionLastUpdated) {
        this.professionLastUpdated = professionLastUpdated;
    }

    @Basic
    @Column(name = "profession_last_updated_month_text")
    public String getProfessionLastUpdatedMonthText() {
        return professionLastUpdatedMonthText;
    }

    public void setProfessionLastUpdatedMonthText(String professionLastUpdatedMonthText) {
        this.professionLastUpdatedMonthText = professionLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "profession_last_updated_year")
    public Integer getProfessionLastUpdatedYear() {
        return professionLastUpdatedYear;
    }

    public void setProfessionLastUpdatedYear(Integer professionLastUpdatedYear) {
        this.professionLastUpdatedYear = professionLastUpdatedYear;
    }

    @Basic
    @Column(name = "designation")
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Basic
    @Column(name = "designation_last_updated")
    public Date getDesignationLastUpdated() {
        return designationLastUpdated;
    }

    public void setDesignationLastUpdated(Date designationLastUpdated) {
        this.designationLastUpdated = designationLastUpdated;
    }

    @Basic
    @Column(name = "designation_last_updated_month_text")
    public String getDesignationLastUpdatedMonthText() {
        return designationLastUpdatedMonthText;
    }

    public void setDesignationLastUpdatedMonthText(String designationLastUpdatedMonthText) {
        this.designationLastUpdatedMonthText = designationLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "designation_last_updated_year")
    public Integer getDesignationLastUpdatedYear() {
        return designationLastUpdatedYear;
    }

    public void setDesignationLastUpdatedYear(Integer designationLastUpdatedYear) {
        this.designationLastUpdatedYear = designationLastUpdatedYear;
    }

    @Basic
    @Column(name = "hosp_designation")
    public String getHospDesignation() {
        return hospDesignation;
    }

    public void setHospDesignation(String hospDesignation) {
        this.hospDesignation = hospDesignation;
    }

    @Basic
    @Column(name = "hosp_designation_last_updated")
    public Date getHospDesignationLastUpdated() {
        return hospDesignationLastUpdated;
    }

    public void setHospDesignationLastUpdated(Date hospDesignationLastUpdated) {
        this.hospDesignationLastUpdated = hospDesignationLastUpdated;
    }

    @Basic
    @Column(name = "hosp_designation_last_updated_month_text")
    public String getHospDesignationLastUpdatedMonthText() {
        return hospDesignationLastUpdatedMonthText;
    }

    public void setHospDesignationLastUpdatedMonthText(String hospDesignationLastUpdatedMonthText) {
        this.hospDesignationLastUpdatedMonthText = hospDesignationLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "hosp_designation_last_updated_year")
    public Integer getHospDesignationLastUpdatedYear() {
        return hospDesignationLastUpdatedYear;
    }

    public void setHospDesignationLastUpdatedYear(Integer hospDesignationLastUpdatedYear) {
        this.hospDesignationLastUpdatedYear = hospDesignationLastUpdatedYear;
    }

    @Basic
    @Column(name = "first_appointment")
    public Date getFirstAppointment() {
        return firstAppointment;
    }

    public void setFirstAppointment(Date firstAppointment) {
        this.firstAppointment = firstAppointment;
    }

    @Basic
    @Column(name = "first_appointment_month_text")
    public String getFirstAppointmentMonthText() {
        return firstAppointmentMonthText;
    }

    public void setFirstAppointmentMonthText(String firstAppointmentMonthText) {
        this.firstAppointmentMonthText = firstAppointmentMonthText;
    }

    @Basic
    @Column(name = "first_appointment_year")
    public Integer getFirstAppointmentYear() {
        return firstAppointmentYear;
    }

    public void setFirstAppointmentYear(Integer firstAppointmentYear) {
        this.firstAppointmentYear = firstAppointmentYear;
    }

    @Basic
    @Column(name = "confirmation_date")
    public Date getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(Date confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    @Basic
    @Column(name = "confirmation_date_month_text")
    public String getConfirmationDateMonthText() {
        return confirmationDateMonthText;
    }

    public void setConfirmationDateMonthText(String confirmationDateMonthText) {
        this.confirmationDateMonthText = confirmationDateMonthText;
    }

    @Basic
    @Column(name = "confirmation_date_year")
    public Integer getConfirmationDateYear() {
        return confirmationDateYear;
    }

    public void setConfirmationDateYear(Integer confirmationDateYear) {
        this.confirmationDateYear = confirmationDateYear;
    }

    @Basic
    @Column(name = "last_promo")
    public Date getLastPromo() {
        return lastPromo;
    }

    public void setLastPromo(Date lastPromo) {
        this.lastPromo = lastPromo;
    }

    @Basic
    @Column(name = "last_promo_month_text")
    public String getLastPromoMonthText() {
        return lastPromoMonthText;
    }

    public void setLastPromoMonthText(String lastPromoMonthText) {
        this.lastPromoMonthText = lastPromoMonthText;
    }

    @Basic
    @Column(name = "last_promo_year")
    public Integer getLastPromoYear() {
        return lastPromoYear;
    }

    public void setLastPromoYear(Integer lastPromoYear) {
        this.lastPromoYear = lastPromoYear;
    }

    @Basic
    @Column(name = "last_promo_last_updated")
    public Date getLastPromoLastUpdated() {
        return lastPromoLastUpdated;
    }

    public void setLastPromoLastUpdated(Date lastPromoLastUpdated) {
        this.lastPromoLastUpdated = lastPromoLastUpdated;
    }

    @Basic
    @Column(name = "last_promo_last_updated_month_text")
    public String getLastPromoLastUpdatedMonthText() {
        return lastPromoLastUpdatedMonthText;
    }

    public void setLastPromoLastUpdatedMonthText(String lastPromoLastUpdatedMonthText) {
        this.lastPromoLastUpdatedMonthText = lastPromoLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "last_promo_last_updated_year")
    public Integer getLastPromoLastUpdatedYear() {
        return lastPromoLastUpdatedYear;
    }

    public void setLastPromoLastUpdatedYear(Integer lastPromoLastUpdatedYear) {
        this.lastPromoLastUpdatedYear = lastPromoLastUpdatedYear;
    }

    @Basic
    @Column(name = "employer")
    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    @Basic
    @Column(name = "employment_status")
    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    @Basic
    @Column(name = "employment_status_last_updated")
    public Date getEmploymentStatusLastUpdated() {
        return employmentStatusLastUpdated;
    }

    public void setEmploymentStatusLastUpdated(Date employmentStatusLastUpdated) {
        this.employmentStatusLastUpdated = employmentStatusLastUpdated;
    }

    @Basic
    @Column(name = "employment_status_last_updated_month_text")
    public String getEmploymentStatusLastUpdatedMonthText() {
        return employmentStatusLastUpdatedMonthText;
    }

    public void setEmploymentStatusLastUpdatedMonthText(String employmentStatusLastUpdatedMonthText) {
        this.employmentStatusLastUpdatedMonthText = employmentStatusLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "employment_status_last_updated_year")
    public Integer getEmploymentStatusLastUpdatedYear() {
        return employmentStatusLastUpdatedYear;
    }

    public void setEmploymentStatusLastUpdatedYear(Integer employmentStatusLastUpdatedYear) {
        this.employmentStatusLastUpdatedYear = employmentStatusLastUpdatedYear;
    }

    @Basic
    @Column(name = "employment_terms")
    public String getEmploymentTerms() {
        return employmentTerms;
    }

    public void setEmploymentTerms(String employmentTerms) {
        this.employmentTerms = employmentTerms;
    }

    @Basic
    @Column(name = "employment_terms_last_updated")
    public Date getEmploymentTermsLastUpdated() {
        return employmentTermsLastUpdated;
    }

    public void setEmploymentTermsLastUpdated(Date employmentTermsLastUpdated) {
        this.employmentTermsLastUpdated = employmentTermsLastUpdated;
    }

    @Basic
    @Column(name = "employment_terms_last_updated_month_text")
    public String getEmploymentTermsLastUpdatedMonthText() {
        return employmentTermsLastUpdatedMonthText;
    }

    public void setEmploymentTermsLastUpdatedMonthText(String employmentTermsLastUpdatedMonthText) {
        this.employmentTermsLastUpdatedMonthText = employmentTermsLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "employment_terms_last_updated_year")
    public Integer getEmploymentTermsLastUpdatedYear() {
        return employmentTermsLastUpdatedYear;
    }

    public void setEmploymentTermsLastUpdatedYear(Integer employmentTermsLastUpdatedYear) {
        this.employmentTermsLastUpdatedYear = employmentTermsLastUpdatedYear;
    }

    @Basic
    @Column(name = "employmentduration")
    public String getEmploymentduration() {
        return employmentduration;
    }

    public void setEmploymentduration(String employmentduration) {
        this.employmentduration = employmentduration;
    }

    @Basic
    @Column(name = "marital")
    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    @Basic
    @Column(name = "marital_last_updated")
    public Date getMaritalLastUpdated() {
        return maritalLastUpdated;
    }

    public void setMaritalLastUpdated(Date maritalLastUpdated) {
        this.maritalLastUpdated = maritalLastUpdated;
    }

    @Basic
    @Column(name = "marital_last_updated_month_text")
    public String getMaritalLastUpdatedMonthText() {
        return maritalLastUpdatedMonthText;
    }

    public void setMaritalLastUpdatedMonthText(String maritalLastUpdatedMonthText) {
        this.maritalLastUpdatedMonthText = maritalLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "marital_last_updated_year")
    public Integer getMaritalLastUpdatedYear() {
        return maritalLastUpdatedYear;
    }

    public void setMaritalLastUpdatedYear(Integer maritalLastUpdatedYear) {
        this.maritalLastUpdatedYear = maritalLastUpdatedYear;
    }

    @Basic
    @Column(name = "check_no")
    public String getCheckNo() {
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    @Basic
    @Column(name = "file_no")
    public String getFileNo() {
        return fileNo;
    }

    public void setFileNo(String fileNo) {
        this.fileNo = fileNo;
    }

    @Basic
    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "department_last_updated")
    public Date getDepartmentLastUpdated() {
        return departmentLastUpdated;
    }

    public void setDepartmentLastUpdated(Date departmentLastUpdated) {
        this.departmentLastUpdated = departmentLastUpdated;
    }

    @Basic
    @Column(name = "department_last_updated_month_text")
    public String getDepartmentLastUpdatedMonthText() {
        return departmentLastUpdatedMonthText;
    }

    public void setDepartmentLastUpdatedMonthText(String departmentLastUpdatedMonthText) {
        this.departmentLastUpdatedMonthText = departmentLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "department_last_updated_year")
    public Integer getDepartmentLastUpdatedYear() {
        return departmentLastUpdatedYear;
    }

    public void setDepartmentLastUpdatedYear(Integer departmentLastUpdatedYear) {
        this.departmentLastUpdatedYear = departmentLastUpdatedYear;
    }

    @Basic
    @Column(name = "hosp_dept")
    public String getHospDept() {
        return hospDept;
    }

    public void setHospDept(String hospDept) {
        this.hospDept = hospDept;
    }

    @Basic
    @Column(name = "superlative")
    public String getSuperlative() {
        return superlative;
    }

    public void setSuperlative(String superlative) {
        this.superlative = superlative;
    }

    @Basic
    @Column(name = "superlative_last_updated")
    public Date getSuperlativeLastUpdated() {
        return superlativeLastUpdated;
    }

    public void setSuperlativeLastUpdated(Date superlativeLastUpdated) {
        this.superlativeLastUpdated = superlativeLastUpdated;
    }

    @Basic
    @Column(name = "superlative_last_updated_month_text")
    public String getSuperlativeLastUpdatedMonthText() {
        return superlativeLastUpdatedMonthText;
    }

    public void setSuperlativeLastUpdatedMonthText(String superlativeLastUpdatedMonthText) {
        this.superlativeLastUpdatedMonthText = superlativeLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "superlative_last_updated_year")
    public Integer getSuperlativeLastUpdatedYear() {
        return superlativeLastUpdatedYear;
    }

    public void setSuperlativeLastUpdatedYear(Integer superlativeLastUpdatedYear) {
        this.superlativeLastUpdatedYear = superlativeLastUpdatedYear;
    }

    @Basic
    @Column(name = "hosp_superlative_post")
    public String getHospSuperlativePost() {
        return hospSuperlativePost;
    }

    public void setHospSuperlativePost(String hospSuperlativePost) {
        this.hospSuperlativePost = hospSuperlativePost;
    }

    @Basic
    @Column(name = "salary_scale")
    public String getSalaryScale() {
        return salaryScale;
    }

    public void setSalaryScale(String salaryScale) {
        this.salaryScale = salaryScale;
    }

    @Basic
    @Column(name = "salary_scale_last_updated")
    public Date getSalaryScaleLastUpdated() {
        return salaryScaleLastUpdated;
    }

    public void setSalaryScaleLastUpdated(Date salaryScaleLastUpdated) {
        this.salaryScaleLastUpdated = salaryScaleLastUpdated;
    }

    @Basic
    @Column(name = "salary_scale_last_updated_month_text")
    public String getSalaryScaleLastUpdatedMonthText() {
        return salaryScaleLastUpdatedMonthText;
    }

    public void setSalaryScaleLastUpdatedMonthText(String salaryScaleLastUpdatedMonthText) {
        this.salaryScaleLastUpdatedMonthText = salaryScaleLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "salary_scale_last_updated_year")
    public Integer getSalaryScaleLastUpdatedYear() {
        return salaryScaleLastUpdatedYear;
    }

    public void setSalaryScaleLastUpdatedYear(Integer salaryScaleLastUpdatedYear) {
        this.salaryScaleLastUpdatedYear = salaryScaleLastUpdatedYear;
    }

    @Basic
    @Column(name = "hosp_salary_scale")
    public String getHospSalaryScale() {
        return hospSalaryScale;
    }

    public void setHospSalaryScale(String hospSalaryScale) {
        this.hospSalaryScale = hospSalaryScale;
    }

    @Basic
    @Column(name = "salary")
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "salary_last_updated")
    public Date getSalaryLastUpdated() {
        return salaryLastUpdated;
    }

    public void setSalaryLastUpdated(Date salaryLastUpdated) {
        this.salaryLastUpdated = salaryLastUpdated;
    }

    @Basic
    @Column(name = "salary_last_updated_month_text")
    public String getSalaryLastUpdatedMonthText() {
        return salaryLastUpdatedMonthText;
    }

    public void setSalaryLastUpdatedMonthText(String salaryLastUpdatedMonthText) {
        this.salaryLastUpdatedMonthText = salaryLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "salary_last_updated_year")
    public Integer getSalaryLastUpdatedYear() {
        return salaryLastUpdatedYear;
    }

    public void setSalaryLastUpdatedYear(Integer salaryLastUpdatedYear) {
        this.salaryLastUpdatedYear = salaryLastUpdatedYear;
    }

    @Basic
    @Column(name = "domicile")
    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    @Basic
    @Column(name = "contact")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "contact_of_next_of_kin")
    public String getContactOfNextOfKin() {
        return contactOfNextOfKin;
    }

    public void setContactOfNextOfKin(String contactOfNextOfKin) {
        this.contactOfNextOfKin = contactOfNextOfKin;
    }

    @Basic
    @Column(name = "relation_next_kin")
    public String getRelationNextKin() {
        return relationNextKin;
    }

    public void setRelationNextKin(String relationNextKin) {
        this.relationNextKin = relationNextKin;
    }

    @Basic
    @Column(name = "disability")
    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    @Basic
    @Column(name = "nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "next_kin")
    public String getNextKin() {
        return nextKin;
    }

    public void setNextKin(String nextKin) {
        this.nextKin = nextKin;
    }

    @Basic
    @Column(name = "number_of_children")
    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    @Basic
    @Column(name = "reg_no")
    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    @Basic
    @Column(name = "agedistribution")
    public String getAgedistribution() {
        return agedistribution;
    }

    public void setAgedistribution(String agedistribution) {
        this.agedistribution = agedistribution;
    }

    @Basic
    @Column(name = "agedistribution_last_updated")
    public Date getAgedistributionLastUpdated() {
        return agedistributionLastUpdated;
    }

    public void setAgedistributionLastUpdated(Date agedistributionLastUpdated) {
        this.agedistributionLastUpdated = agedistributionLastUpdated;
    }

    @Basic
    @Column(name = "agedistribution_last_updated_month_text")
    public String getAgedistributionLastUpdatedMonthText() {
        return agedistributionLastUpdatedMonthText;
    }

    public void setAgedistributionLastUpdatedMonthText(String agedistributionLastUpdatedMonthText) {
        this.agedistributionLastUpdatedMonthText = agedistributionLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "agedistribution_last_updated_year")
    public Integer getAgedistributionLastUpdatedYear() {
        return agedistributionLastUpdatedYear;
    }

    public void setAgedistributionLastUpdatedYear(Integer agedistributionLastUpdatedYear) {
        this.agedistributionLastUpdatedYear = agedistributionLastUpdatedYear;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "retirementdistribution")
    public Integer getRetirementdistribution() {
        return retirementdistribution;
    }

    public void setRetirementdistribution(Integer retirementdistribution) {
        this.retirementdistribution = retirementdistribution;
    }

    @Basic
    @Column(name = "retirementdistribution_last_updated")
    public Date getRetirementdistributionLastUpdated() {
        return retirementdistributionLastUpdated;
    }

    public void setRetirementdistributionLastUpdated(Date retirementdistributionLastUpdated) {
        this.retirementdistributionLastUpdated = retirementdistributionLastUpdated;
    }

    @Basic
    @Column(name = "retirementdistribution_last_updated_month_text")
    public String getRetirementdistributionLastUpdatedMonthText() {
        return retirementdistributionLastUpdatedMonthText;
    }

    public void setRetirementdistributionLastUpdatedMonthText(String retirementdistributionLastUpdatedMonthText) {
        this.retirementdistributionLastUpdatedMonthText = retirementdistributionLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "retirementdistribution_last_updated_year")
    public Integer getRetirementdistributionLastUpdatedYear() {
        return retirementdistributionLastUpdatedYear;
    }

    public void setRetirementdistributionLastUpdatedYear(Integer retirementdistributionLastUpdatedYear) {
        this.retirementdistributionLastUpdatedYear = retirementdistributionLastUpdatedYear;
    }

    @Basic
    @Column(name = "employmentdistribution")
    public Integer getEmploymentdistribution() {
        return employmentdistribution;
    }

    public void setEmploymentdistribution(Integer employmentdistribution) {
        this.employmentdistribution = employmentdistribution;
    }

    @Basic
    @Column(name = "employmentdistribution_last_updated")
    public Date getEmploymentdistributionLastUpdated() {
        return employmentdistributionLastUpdated;
    }

    public void setEmploymentdistributionLastUpdated(Date employmentdistributionLastUpdated) {
        this.employmentdistributionLastUpdated = employmentdistributionLastUpdated;
    }

    @Basic
    @Column(name = "employmentdistribution_last_updated_month_text")
    public String getEmploymentdistributionLastUpdatedMonthText() {
        return employmentdistributionLastUpdatedMonthText;
    }

    public void setEmploymentdistributionLastUpdatedMonthText(String employmentdistributionLastUpdatedMonthText) {
        this.employmentdistributionLastUpdatedMonthText = employmentdistributionLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "employmentdistribution_last_updated_year")
    public Integer getEmploymentdistributionLastUpdatedYear() {
        return employmentdistributionLastUpdatedYear;
    }

    public void setEmploymentdistributionLastUpdatedYear(Integer employmentdistributionLastUpdatedYear) {
        this.employmentdistributionLastUpdatedYear = employmentdistributionLastUpdatedYear;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "religion")
    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Basic
    @Column(name = "religion_last_updated")
    public Date getReligionLastUpdated() {
        return religionLastUpdated;
    }

    public void setReligionLastUpdated(Date religionLastUpdated) {
        this.religionLastUpdated = religionLastUpdated;
    }

    @Basic
    @Column(name = "religion_last_updated_month_text")
    public String getReligionLastUpdatedMonthText() {
        return religionLastUpdatedMonthText;
    }

    public void setReligionLastUpdatedMonthText(String religionLastUpdatedMonthText) {
        this.religionLastUpdatedMonthText = religionLastUpdatedMonthText;
    }

    @Basic
    @Column(name = "religion_last_updated_year")
    public Integer getReligionLastUpdatedYear() {
        return religionLastUpdatedYear;
    }

    public void setReligionLastUpdatedYear(Integer religionLastUpdatedYear) {
        this.religionLastUpdatedYear = religionLastUpdatedYear;
    }

    @Basic
    @Column(name = "retirementdate")
    public Date getRetirementdate() {
        return retirementdate;
    }

    public void setRetirementdate(Date retirementdate) {
        this.retirementdate = retirementdate;
    }

    @Basic
    @Column(name = "retirementdate_month_text")
    public String getRetirementdateMonthText() {
        return retirementdateMonthText;
    }

    public void setRetirementdateMonthText(String retirementdateMonthText) {
        this.retirementdateMonthText = retirementdateMonthText;
    }

    @Basic
    @Column(name = "retirementdate_year")
    public Integer getRetirementdateYear() {
        return retirementdateYear;
    }

    public void setRetirementdateYear(Integer retirementdateYear) {
        this.retirementdateYear = retirementdateYear;
    }

    @Basic
    @Column(name = "level1_mohcdgec")
    public String getLevel1Mohcdgec() {
        return level1Mohcdgec;
    }

    public void setLevel1Mohcdgec(String level1Mohcdgec) {
        this.level1Mohcdgec = level1Mohcdgec;
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
    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "levelname")
    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname;
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
        ResourceAllFieldsEntity that = (ResourceAllFieldsEntity) o;
        return id == that.id &&
                Objects.equals(instance, that.instance) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(middlename, that.middlename) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(surnameLastUpdated, that.surnameLastUpdated) &&
                Objects.equals(surnameLastUpdatedMonthText, that.surnameLastUpdatedMonthText) &&
                Objects.equals(surnameLastUpdatedYear, that.surnameLastUpdatedYear) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(dob, that.dob) &&
                Objects.equals(dobMonthText, that.dobMonthText) &&
                Objects.equals(dobYear, that.dobYear) &&
                Objects.equals(basicEducationLevel, that.basicEducationLevel) &&
                Objects.equals(eduEvel, that.eduEvel) &&
                Objects.equals(eduEvelLastUpdated, that.eduEvelLastUpdated) &&
                Objects.equals(eduEvelLastUpdatedMonthText, that.eduEvelLastUpdatedMonthText) &&
                Objects.equals(eduEvelLastUpdatedYear, that.eduEvelLastUpdatedYear) &&
                Objects.equals(profession, that.profession) &&
                Objects.equals(professionLastUpdated, that.professionLastUpdated) &&
                Objects.equals(professionLastUpdatedMonthText, that.professionLastUpdatedMonthText) &&
                Objects.equals(professionLastUpdatedYear, that.professionLastUpdatedYear) &&
                Objects.equals(designation, that.designation) &&
                Objects.equals(designationLastUpdated, that.designationLastUpdated) &&
                Objects.equals(designationLastUpdatedMonthText, that.designationLastUpdatedMonthText) &&
                Objects.equals(designationLastUpdatedYear, that.designationLastUpdatedYear) &&
                Objects.equals(hospDesignation, that.hospDesignation) &&
                Objects.equals(hospDesignationLastUpdated, that.hospDesignationLastUpdated) &&
                Objects.equals(hospDesignationLastUpdatedMonthText, that.hospDesignationLastUpdatedMonthText) &&
                Objects.equals(hospDesignationLastUpdatedYear, that.hospDesignationLastUpdatedYear) &&
                Objects.equals(firstAppointment, that.firstAppointment) &&
                Objects.equals(firstAppointmentMonthText, that.firstAppointmentMonthText) &&
                Objects.equals(firstAppointmentYear, that.firstAppointmentYear) &&
                Objects.equals(confirmationDate, that.confirmationDate) &&
                Objects.equals(confirmationDateMonthText, that.confirmationDateMonthText) &&
                Objects.equals(confirmationDateYear, that.confirmationDateYear) &&
                Objects.equals(lastPromo, that.lastPromo) &&
                Objects.equals(lastPromoMonthText, that.lastPromoMonthText) &&
                Objects.equals(lastPromoYear, that.lastPromoYear) &&
                Objects.equals(lastPromoLastUpdated, that.lastPromoLastUpdated) &&
                Objects.equals(lastPromoLastUpdatedMonthText, that.lastPromoLastUpdatedMonthText) &&
                Objects.equals(lastPromoLastUpdatedYear, that.lastPromoLastUpdatedYear) &&
                Objects.equals(employer, that.employer) &&
                Objects.equals(employmentStatus, that.employmentStatus) &&
                Objects.equals(employmentStatusLastUpdated, that.employmentStatusLastUpdated) &&
                Objects.equals(employmentStatusLastUpdatedMonthText, that.employmentStatusLastUpdatedMonthText) &&
                Objects.equals(employmentStatusLastUpdatedYear, that.employmentStatusLastUpdatedYear) &&
                Objects.equals(employmentTerms, that.employmentTerms) &&
                Objects.equals(employmentTermsLastUpdated, that.employmentTermsLastUpdated) &&
                Objects.equals(employmentTermsLastUpdatedMonthText, that.employmentTermsLastUpdatedMonthText) &&
                Objects.equals(employmentTermsLastUpdatedYear, that.employmentTermsLastUpdatedYear) &&
                Objects.equals(employmentduration, that.employmentduration) &&
                Objects.equals(marital, that.marital) &&
                Objects.equals(maritalLastUpdated, that.maritalLastUpdated) &&
                Objects.equals(maritalLastUpdatedMonthText, that.maritalLastUpdatedMonthText) &&
                Objects.equals(maritalLastUpdatedYear, that.maritalLastUpdatedYear) &&
                Objects.equals(checkNo, that.checkNo) &&
                Objects.equals(fileNo, that.fileNo) &&
                Objects.equals(department, that.department) &&
                Objects.equals(departmentLastUpdated, that.departmentLastUpdated) &&
                Objects.equals(departmentLastUpdatedMonthText, that.departmentLastUpdatedMonthText) &&
                Objects.equals(departmentLastUpdatedYear, that.departmentLastUpdatedYear) &&
                Objects.equals(hospDept, that.hospDept) &&
                Objects.equals(superlative, that.superlative) &&
                Objects.equals(superlativeLastUpdated, that.superlativeLastUpdated) &&
                Objects.equals(superlativeLastUpdatedMonthText, that.superlativeLastUpdatedMonthText) &&
                Objects.equals(superlativeLastUpdatedYear, that.superlativeLastUpdatedYear) &&
                Objects.equals(hospSuperlativePost, that.hospSuperlativePost) &&
                Objects.equals(salaryScale, that.salaryScale) &&
                Objects.equals(salaryScaleLastUpdated, that.salaryScaleLastUpdated) &&
                Objects.equals(salaryScaleLastUpdatedMonthText, that.salaryScaleLastUpdatedMonthText) &&
                Objects.equals(salaryScaleLastUpdatedYear, that.salaryScaleLastUpdatedYear) &&
                Objects.equals(hospSalaryScale, that.hospSalaryScale) &&
                Objects.equals(salary, that.salary) &&
                Objects.equals(salaryLastUpdated, that.salaryLastUpdated) &&
                Objects.equals(salaryLastUpdatedMonthText, that.salaryLastUpdatedMonthText) &&
                Objects.equals(salaryLastUpdatedYear, that.salaryLastUpdatedYear) &&
                Objects.equals(domicile, that.domicile) &&
                Objects.equals(contact, that.contact) &&
                Objects.equals(contactOfNextOfKin, that.contactOfNextOfKin) &&
                Objects.equals(relationNextKin, that.relationNextKin) &&
                Objects.equals(disability, that.disability) &&
                Objects.equals(nationality, that.nationality) &&
                Objects.equals(nextKin, that.nextKin) &&
                Objects.equals(numberOfChildren, that.numberOfChildren) &&
                Objects.equals(regNo, that.regNo) &&
                Objects.equals(agedistribution, that.agedistribution) &&
                Objects.equals(agedistributionLastUpdated, that.agedistributionLastUpdated) &&
                Objects.equals(agedistributionLastUpdatedMonthText, that.agedistributionLastUpdatedMonthText) &&
                Objects.equals(agedistributionLastUpdatedYear, that.agedistributionLastUpdatedYear) &&
                Objects.equals(age, that.age) &&
                Objects.equals(retirementdistribution, that.retirementdistribution) &&
                Objects.equals(retirementdistributionLastUpdated, that.retirementdistributionLastUpdated) &&
                Objects.equals(retirementdistributionLastUpdatedMonthText, that.retirementdistributionLastUpdatedMonthText) &&
                Objects.equals(retirementdistributionLastUpdatedYear, that.retirementdistributionLastUpdatedYear) &&
                Objects.equals(employmentdistribution, that.employmentdistribution) &&
                Objects.equals(employmentdistributionLastUpdated, that.employmentdistributionLastUpdated) &&
                Objects.equals(employmentdistributionLastUpdatedMonthText, that.employmentdistributionLastUpdatedMonthText) &&
                Objects.equals(employmentdistributionLastUpdatedYear, that.employmentdistributionLastUpdatedYear) &&
                Objects.equals(email, that.email) &&
                Objects.equals(religion, that.religion) &&
                Objects.equals(religionLastUpdated, that.religionLastUpdated) &&
                Objects.equals(religionLastUpdatedMonthText, that.religionLastUpdatedMonthText) &&
                Objects.equals(religionLastUpdatedYear, that.religionLastUpdatedYear) &&
                Objects.equals(retirementdate, that.retirementdate) &&
                Objects.equals(retirementdateMonthText, that.retirementdateMonthText) &&
                Objects.equals(retirementdateYear, that.retirementdateYear) &&
                Objects.equals(level1Mohcdgec, that.level1Mohcdgec) &&
                Objects.equals(level2Categories, that.level2Categories) &&
                Objects.equals(level3RegionsDepartmentsInstitutionsReferrals, that.level3RegionsDepartmentsInstitutionsReferrals) &&
                Objects.equals(level4DistrictsRegHospitals, that.level4DistrictsRegHospitals) &&
                Objects.equals(level5Facility, that.level5Facility) &&
                Objects.equals(type, that.type) &&
                Objects.equals(ownership, that.ownership) &&
                Objects.equals(organisationunitName, that.organisationunitName) &&
                Objects.equals(level, that.level) &&
                Objects.equals(levelname, that.levelname) &&
                Objects.equals(formName, that.formName) &&
                Objects.equals(organisationunitId, that.organisationunitId) &&
                Objects.equals(formId, that.formId) &&
                Objects.equals(lastupdated, that.lastupdated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, instance, firstname, middlename, surname, surnameLastUpdated, surnameLastUpdatedMonthText, surnameLastUpdatedYear, sex, dob, dobMonthText, dobYear, basicEducationLevel, eduEvel, eduEvelLastUpdated, eduEvelLastUpdatedMonthText, eduEvelLastUpdatedYear, profession, professionLastUpdated, professionLastUpdatedMonthText, professionLastUpdatedYear, designation, designationLastUpdated, designationLastUpdatedMonthText, designationLastUpdatedYear, hospDesignation, hospDesignationLastUpdated, hospDesignationLastUpdatedMonthText, hospDesignationLastUpdatedYear, firstAppointment, firstAppointmentMonthText, firstAppointmentYear, confirmationDate, confirmationDateMonthText, confirmationDateYear, lastPromo, lastPromoMonthText, lastPromoYear, lastPromoLastUpdated, lastPromoLastUpdatedMonthText, lastPromoLastUpdatedYear, employer, employmentStatus, employmentStatusLastUpdated, employmentStatusLastUpdatedMonthText, employmentStatusLastUpdatedYear, employmentTerms, employmentTermsLastUpdated, employmentTermsLastUpdatedMonthText, employmentTermsLastUpdatedYear, employmentduration, marital, maritalLastUpdated, maritalLastUpdatedMonthText, maritalLastUpdatedYear, checkNo, fileNo, department, departmentLastUpdated, departmentLastUpdatedMonthText, departmentLastUpdatedYear, hospDept, superlative, superlativeLastUpdated, superlativeLastUpdatedMonthText, superlativeLastUpdatedYear, hospSuperlativePost, salaryScale, salaryScaleLastUpdated, salaryScaleLastUpdatedMonthText, salaryScaleLastUpdatedYear, hospSalaryScale, salary, salaryLastUpdated, salaryLastUpdatedMonthText, salaryLastUpdatedYear, domicile, contact, contactOfNextOfKin, relationNextKin, disability, nationality, nextKin, numberOfChildren, regNo, agedistribution, agedistributionLastUpdated, agedistributionLastUpdatedMonthText, agedistributionLastUpdatedYear, age, retirementdistribution, retirementdistributionLastUpdated, retirementdistributionLastUpdatedMonthText, retirementdistributionLastUpdatedYear, employmentdistribution, employmentdistributionLastUpdated, employmentdistributionLastUpdatedMonthText, employmentdistributionLastUpdatedYear, email, religion, religionLastUpdated, religionLastUpdatedMonthText, religionLastUpdatedYear, retirementdate, retirementdateMonthText, retirementdateYear, level1Mohcdgec, level2Categories, level3RegionsDepartmentsInstitutionsReferrals, level4DistrictsRegHospitals, level5Facility, type, ownership, organisationunitName, level, levelname, formName, organisationunitId, formId, lastupdated);
    }
}

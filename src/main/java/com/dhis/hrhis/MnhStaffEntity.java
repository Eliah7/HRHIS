package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "mnh_staff", schema = "public", catalog = "hrhis")
public class MnhStaffEntity {
    private String fileNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateOfBirth;
    private String sex;
    private String marstat;
    private String nationality;
    private String district;
    private String domicile;
    private String chequeNumber;
    private Double basicSalary;
    private String dateOfAppoitment;
    private String confirmationDate;
    private String dateLastPromotion;
    private String employmentStatus;
    private String designation;
    private String payscale;
    private String deptName;
    private String empContacts;
    private String nextKinContact;
    private String nextOfKinName;
    private String empClassification;
    private String religion;

    @Basic
    @Column(name = "file_number")
    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "middle_name")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "date_of_birth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
    @Column(name = "marstat")
    public String getMarstat() {
        return marstat;
    }

    public void setMarstat(String marstat) {
        this.marstat = marstat;
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
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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
    @Column(name = "cheque_number")
    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    @Basic
    @Column(name = "basic_salary")
    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Basic
    @Column(name = "date_of_appoitment")
    public String getDateOfAppoitment() {
        return dateOfAppoitment;
    }

    public void setDateOfAppoitment(String dateOfAppoitment) {
        this.dateOfAppoitment = dateOfAppoitment;
    }

    @Basic
    @Column(name = "confirmation_date")
    public String getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(String confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    @Basic
    @Column(name = "date_last_promotion")
    public String getDateLastPromotion() {
        return dateLastPromotion;
    }

    public void setDateLastPromotion(String dateLastPromotion) {
        this.dateLastPromotion = dateLastPromotion;
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
    @Column(name = "designation")
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Basic
    @Column(name = "payscale")
    public String getPayscale() {
        return payscale;
    }

    public void setPayscale(String payscale) {
        this.payscale = payscale;
    }

    @Basic
    @Column(name = "dept_name")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "emp_contacts")
    public String getEmpContacts() {
        return empContacts;
    }

    public void setEmpContacts(String empContacts) {
        this.empContacts = empContacts;
    }

    @Basic
    @Column(name = "next_kin_contact")
    public String getNextKinContact() {
        return nextKinContact;
    }

    public void setNextKinContact(String nextKinContact) {
        this.nextKinContact = nextKinContact;
    }

    @Basic
    @Column(name = "next_of_kin_name")
    public String getNextOfKinName() {
        return nextOfKinName;
    }

    public void setNextOfKinName(String nextOfKinName) {
        this.nextOfKinName = nextOfKinName;
    }

    @Basic
    @Column(name = "emp_classification")
    public String getEmpClassification() {
        return empClassification;
    }

    public void setEmpClassification(String empClassification) {
        this.empClassification = empClassification;
    }

    @Basic
    @Column(name = "religion")
    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MnhStaffEntity that = (MnhStaffEntity) o;
        return Objects.equals(fileNumber, that.fileNumber) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(middleName, that.middleName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(marstat, that.marstat) &&
                Objects.equals(nationality, that.nationality) &&
                Objects.equals(district, that.district) &&
                Objects.equals(domicile, that.domicile) &&
                Objects.equals(chequeNumber, that.chequeNumber) &&
                Objects.equals(basicSalary, that.basicSalary) &&
                Objects.equals(dateOfAppoitment, that.dateOfAppoitment) &&
                Objects.equals(confirmationDate, that.confirmationDate) &&
                Objects.equals(dateLastPromotion, that.dateLastPromotion) &&
                Objects.equals(employmentStatus, that.employmentStatus) &&
                Objects.equals(designation, that.designation) &&
                Objects.equals(payscale, that.payscale) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(empContacts, that.empContacts) &&
                Objects.equals(nextKinContact, that.nextKinContact) &&
                Objects.equals(nextOfKinName, that.nextOfKinName) &&
                Objects.equals(empClassification, that.empClassification) &&
                Objects.equals(religion, that.religion);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fileNumber, firstName, middleName, lastName, dateOfBirth, sex, marstat, nationality, district, domicile, chequeNumber, basicSalary, dateOfAppoitment, confirmationDate, dateLastPromotion, employmentStatus, designation, payscale, deptName, empContacts, nextKinContact, nextOfKinName, empClassification, religion);
    }
}

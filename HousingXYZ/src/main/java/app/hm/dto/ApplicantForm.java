package app.hm.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class ApplicantForm {

    private Long id;
    private String fullName;
    private String fullNameBangla;
    private String fathersName;
    private String fathersNameBangla;
    private String mothersName;
    private String mothersBangla;
    private String spouseName;
    private String profession;
    private String designation;
    private String dateOfJoiningOnJob;
    private LocalDate dateOfPRL;
    private String borrowerACNo;
    private String nid;
    private LocalDate dob;
    private String email;
    private String gender;
    private Double salaryScale;
    private Double basicSalary;
    private Double houseRent;
    private Double totalSalary;
    private Double salaryDeduction;
    private Double netSalary;
    private String workAddress;
    private String residentialAddress;
    private String permanentAddress;
    private String mobile;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullNameBangla() {
        return fullNameBangla;
    }

    public void setFullNameBangla(String fullNameBangla) {
        this.fullNameBangla = fullNameBangla;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getFathersNameBangla() {
        return fathersNameBangla;
    }

    public void setFathersNameBangla(String fathersNameBangla) {
        this.fathersNameBangla = fathersNameBangla;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getMothersBangla() {
        return mothersBangla;
    }

    public void setMothersBangla(String mothersBangla) {
        this.mothersBangla = mothersBangla;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDateOfJoiningOnJob() {
        return dateOfJoiningOnJob;
    }

    public void setDateOfJoiningOnJob(String dateOfJoiningOnJob) {
        this.dateOfJoiningOnJob = dateOfJoiningOnJob;
    }

    public LocalDate getDateOfPRL() {
        return dateOfPRL;
    }

    public void setDateOfPRL(LocalDate dateOfPRL) {
        this.dateOfPRL = dateOfPRL;
    }

    public String getBorrowerACNo() {
        return borrowerACNo;
    }

    public void setBorrowerACNo(String borrowerACNo) {
        this.borrowerACNo = borrowerACNo;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalaryScale() {
        return salaryScale;
    }

    public void setSalaryScale(Double salaryScale) {
        this.salaryScale = salaryScale;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(Double houseRent) {
        this.houseRent = houseRent;
    }

    public Double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(Double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public Double getSalaryDeduction() {
        return salaryDeduction;
    }

    public void setSalaryDeduction(Double salaryDeduction) {
        this.salaryDeduction = salaryDeduction;
    }

    public Double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(Double netSalary) {
        this.netSalary = netSalary;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

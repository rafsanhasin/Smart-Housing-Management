package app.hm.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "applicant") // You can change the table name as needed
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicantId;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String fullNameBangla;

    @Column(nullable = false)
    private String fathersName;

    @Column(nullable = false)
    private String fathersNameBangla;

    @Column(nullable = false)
    private String mothersName;

    @Column(nullable = false)
    private String mothersBangla;

    @Column(nullable = true) // nullable = true is default, but explicit for clarity
    private String spouseName;

    @Column(nullable = false)
    private String profession;

    @Column(nullable = false)
    private String designation;

    @Column(nullable = false)
    private String dateOfJoiningOnJob;

    @Column(nullable = false)
    private LocalDate dateOfPRL;

    @Column(nullable = false)
    private String borrowerACNo;

    @Column(nullable = false, unique = true)
    private String nid;

    @Column(nullable = false)
    private LocalDate dob;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private Double salaryScale;

    @Column(nullable = false)
    private Double basicSalary;

    @Column(nullable = false)
    private Double houseRent;

    @Column(nullable = false)
    private Double totalSalary;

    @Column(nullable = false)
    private Double salaryDeduction;

    @Column(nullable = false)
    private Double netSalary;

    @Column(nullable = false)
    private String workAddress;

    @Column(nullable = false)
    private String residentialAddress;

    @Column(nullable = false)
    private String permanentAddress;

    @Column(nullable = false)
    private String mobile;

//    public Applicant(Long id, String fullName, String fullNameBangla, String fathersName, String fathersNameBangla,
//                    String mothersName, String mothersBangla, String spouseName, String profession, String designation,
//                    String dateOfJoiningOnJob, LocalDate dateOfPRL, String borrowerACNo, String nid, LocalDate dob,
//                    String email, String gender,
//                    Double salaryScale, Double basicSalary, Double houseRent, Double totalSalary, Double salaryDeduction,
//                    Double netSalary, String workAddress, String residentialAddress, String permanentAddress, String mobile) {
//        this.id = id;
//        this.fullName = fullName;
//        this.fullNameBangla = fullNameBangla;
//        this.fathersName = fathersName;
//        this.fathersNameBangla = fathersNameBangla;
//        this.mothersName = mothersName;
//        this.mothersBangla = mothersBangla;
//        this.spouseName = spouseName;
//        this.profession = profession;
//        this.designation = designation;
//        this.dateOfJoiningOnJob = dateOfJoiningOnJob;
//        this.dateOfPRL = dateOfPRL;
//        this.borrowerACNo = borrowerACNo;
//        this.nid = nid;
//        this.dob = dob;
//        this.email = email;
//        this.gender = gender;
//        this.salaryScale = salaryScale;
//        this.basicSalary = basicSalary;
//        this.houseRent = houseRent;
//        this.totalSalary = totalSalary;
//        this.salaryDeduction = salaryDeduction;
//        this.netSalary = netSalary;
//        this.workAddress = workAddress;
//        this.residentialAddress = residentialAddress;
//        this.permanentAddress = permanentAddress;
//        this.mobile = mobile;
//    }

    // Getters and Setters
    public Long getId() {
        return applicantId;
    }

    public void setId(Long applicantId) {
        this.applicantId = applicantId;
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

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + applicantId +
                ", fullName='" + fullName + '\'' +
                ", nid='" + nid + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
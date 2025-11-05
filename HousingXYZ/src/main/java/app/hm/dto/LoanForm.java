package app.hm.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class LoanForm {
    @NotBlank
    private String fullName;
    
    @NotBlank
    private String fullNameBangla;
    
    @NotBlank
    private String fathersName;
    
    @NotBlank
    private String fathersNameBangla; 
    
    @NotBlank
    private String mothersName;
    
    @NotBlank
    private String mothersBangla; 
    
    @Null
    private String spouseName;
    
    @NotBlank
    private String profession; 
    
    @NotBlank
    private String designation; 
    
    @NotBlank
    private String dateOfJoiningOnJob;
    
    @NotBlank
    private LocalDate dateOfPRL;
    
    @NotBlank
    private String borrowerACNo;
    
    @NotBlank
    private String nid;
    
    @NotNull
    private LocalDate dob;

    @NotBlank
    private String gender;

    @NotBlank
    private String email;

    @NotBlank
    private String mobile;

    @NotNull
    private String loanPurpose;

    @NotNull
    @Positive
    private Double expectedLoan;

    @NotNull
    @Min(1)
    private Integer loanTenure;

    @NotNull
    @Positive
    private Double salaryScale;
    
    @NotNull
    @Positive
    private Double basicSalary;
    
    @NotNull
    @Positive
    private Double houseRent;
    
    @NotNull
    @Positive
    private Double totalSalary;
    
    @NotNull
    @Positive
    private Double salaryDeduction;
    
    @NotNull
    @Positive
    private Double netSalary;
    
    @NotNull
    private String workAddress;
    
    @NotNull
    private String residentialAddress;
    
    @NotNull
    private String permanentAddress;
    



    @Null
    private String loanAgainstPF_sanction_no;

    @Null
    private LocalDate loanAgainstPF_date;

    @Null
    private Double loanAgainstPF_amount;

    @Null
    private Double loanAgainstPF_monthly_installment;

    @Null
    private Double loanAgainstPF_remaining_amount;

    @Null
    private Double loanAgainstPF_current_loan_balance;



    @Null
    private String employeeHouseLoan_sanction_no;

    @Null
    private LocalDate employeeHouseLoan_date;

    @Null
    private Double employeeHouseLoan_amount;

    @Null
    private Double employeeHouseLoan_monthly_installment;

    @Null
    private Double employeeHouseLoan_remaining_amount;

    @Null
    private Double employeeHouseLoan_current_loan_balance;



    @Null
    private String generalHouseLoan_sanction_no;

    @Null
    private LocalDate generalHouseLoan_date;

    @Null
    private Double generalHouseLoan_amount;

    @Null
    private Double generalHouseLoan_monthly_installment;

    @Null
    private Double generalHouseLoan_remaining_amount;

    @Null
    private Double generalHouseLoan_current_loan_balance;


    @Null
    private String computerLoan_sanction_no;

    @Null
    private LocalDate computerLoan_date;

    @Null
    private Double computerLoan_amount;

    @Null
    private Double computerLoan_monthly_installment;

    @Null
    private Double computerLoan_remaining_amount;

    @Null
    private Double computerLoan_current_loan_balance;


    @Null
    private String motorcarLoan_sanction_no;

    @Null
    private LocalDate motorcarLoan_date;

    @Null
    private Double motorcarLoan_amount;

    @Null
    private Double motorcarLoan_monthly_installment;

    @Null
    private Double motorcarLoan_remaining_amount;

    @Null
    private Double motorcarLoan_current_loan_balance;


    @Null
    private String motorcycleLoan_sanction_no;

    @Null
    private LocalDate motorcycleLoan_date;

    @Null
    private Double motorcycleLoan_amount;

    @Null
    private Double motorcycleLoan_monthly_installment;

    @Null
    private Double motorcycleLoan_remaining_amount;

    @Null
    private Double motorcycleLoan_current_loan_balance;


    @Null
    private String sewingMachineLoan_sanction_no;

    @Null
    private LocalDate sewingMachineLoan_date;

    @Null
    private Double sewingMachineLoan_amount;

    @Null
    private Double sewingMachineLoan_monthly_installment;

    @Null
    private Double sewingMachineLoan_remaining_amount;

    @Null
    private Double sewingMachineLoan_current_loan_balance;


    @Null
    private String consumerLoan_sanction_no;

    @Null
    private LocalDate consumerLoan_date;

    @Null
    private Double consumerLoan_amount;

    @Null
    private Double consumerLoan_monthly_installment;

    @Null
    private Double consumerLoan_remaining_amount;

    @Null
    private Double consumerLoan_current_loan_balance;


    @Null
    private String otherLoan_sanction_no;

    @Null
    private LocalDate otherLoan_date;

    @Null
    private Double otherLoan_amount;

    @Null
    private Double otherLoan_monthly_installment;

    @Null
    private Double otherLoan_remaining_amount;

    @Null
    private Double otherLoan_current_loan_balance;



    @Null
    private String otherExLoan_institute;

    @Null
    private String otherExLoan_status;

    @Null
    private Double otherExLoan_amount;

    @Null
    private Double otherExLoan_installment_amount;

    @Null
    private Double otherExLoan_current_loan_balance;

    @Null
    private Double otherExLoan_classification_status;


    @NotBlank
    private String guarantorFullName;

    @NotBlank
    private String guarantorFullNameBangla;

    @NotBlank
    private String guarantorFathersName;

    @NotBlank
    private String guarantorFathersNameBangla;

    @NotBlank
    private String guarantorMothersName;

    @NotBlank
    private String guarantorMothersBangla;

    @NotBlank
    private String guarantorPresentAddress;

    @NotBlank
    private String guarantorPermanentAddress;

    @NotBlank
    private String guarantorNid;

    @NotBlank
    private String guarantorAcNo;


    // Basic Information
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

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public Double getExpectedLoan() {
        return expectedLoan;
    }

    public void setExpectedLoan(Double expectedLoan) {
        this.expectedLoan = expectedLoan;
    }

    public Integer getLoanTenure() {
        return loanTenure;
    }

    public void setLoanTenure(Integer loanTenure) {
        this.loanTenure = loanTenure;
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

    // Loan Against PF
    public String getLoanAgainstPF_sanction_no() {
        return loanAgainstPF_sanction_no;
    }

    public void setLoanAgainstPF_sanction_no(String loanAgainstPF_sanction_no) {
        this.loanAgainstPF_sanction_no = loanAgainstPF_sanction_no;
    }

    public LocalDate getLoanAgainstPF_date() {
        return loanAgainstPF_date;
    }

    public void setLoanAgainstPF_date(LocalDate loanAgainstPF_date) {
        this.loanAgainstPF_date = loanAgainstPF_date;
    }

    public Double getLoanAgainstPF_amount() {
        return loanAgainstPF_amount;
    }

    public void setLoanAgainstPF_amount(Double loanAgainstPF_amount) {
        this.loanAgainstPF_amount = loanAgainstPF_amount;
    }

    public Double getLoanAgainstPF_monthly_installment() {
        return loanAgainstPF_monthly_installment;
    }

    public void setLoanAgainstPF_monthly_installment(Double loanAgainstPF_monthly_installment) {
        this.loanAgainstPF_monthly_installment = loanAgainstPF_monthly_installment;
    }

    public Double getLoanAgainstPF_remaining_amount() {
        return loanAgainstPF_remaining_amount;
    }

    public void setLoanAgainstPF_remaining_amount(Double loanAgainstPF_remaining_amount) {
        this.loanAgainstPF_remaining_amount = loanAgainstPF_remaining_amount;
    }

    public Double getLoanAgainstPF_current_loan_balance() {
        return loanAgainstPF_current_loan_balance;
    }

    public void setLoanAgainstPF_current_loan_balance(Double loanAgainstPF_current_loan_balance) {
        this.loanAgainstPF_current_loan_balance = loanAgainstPF_current_loan_balance;
    }

    // Employee House Loan
    public String getEmployeeHouseLoan_sanction_no() {
        return employeeHouseLoan_sanction_no;
    }

    public void setEmployeeHouseLoan_sanction_no(String employeeHouseLoan_sanction_no) {
        this.employeeHouseLoan_sanction_no = employeeHouseLoan_sanction_no;
    }

    public LocalDate getEmployeeHouseLoan_date() {
        return employeeHouseLoan_date;
    }

    public void setEmployeeHouseLoan_date(LocalDate employeeHouseLoan_date) {
        this.employeeHouseLoan_date = employeeHouseLoan_date;
    }

    public Double getEmployeeHouseLoan_amount() {
        return employeeHouseLoan_amount;
    }

    public void setEmployeeHouseLoan_amount(Double employeeHouseLoan_amount) {
        this.employeeHouseLoan_amount = employeeHouseLoan_amount;
    }

    public Double getEmployeeHouseLoan_monthly_installment() {
        return employeeHouseLoan_monthly_installment;
    }

    public void setEmployeeHouseLoan_monthly_installment(Double employeeHouseLoan_monthly_installment) {
        this.employeeHouseLoan_monthly_installment = employeeHouseLoan_monthly_installment;
    }

    public Double getEmployeeHouseLoan_remaining_amount() {
        return employeeHouseLoan_remaining_amount;
    }

    public void setEmployeeHouseLoan_remaining_amount(Double employeeHouseLoan_remaining_amount) {
        this.employeeHouseLoan_remaining_amount = employeeHouseLoan_remaining_amount;
    }

    public Double getEmployeeHouseLoan_current_loan_balance() {
        return employeeHouseLoan_current_loan_balance;
    }

    public void setEmployeeHouseLoan_current_loan_balance(Double employeeHouseLoan_current_loan_balance) {
        this.employeeHouseLoan_current_loan_balance = employeeHouseLoan_current_loan_balance;
    }

    // General House Loan
    public String getGeneralHouseLoan_sanction_no() {
        return generalHouseLoan_sanction_no;
    }

    public void setGeneralHouseLoan_sanction_no(String generalHouseLoan_sanction_no) {
        this.generalHouseLoan_sanction_no = generalHouseLoan_sanction_no;
    }

    public LocalDate getGeneralHouseLoan_date() {
        return generalHouseLoan_date;
    }

    public void setGeneralHouseLoan_date(LocalDate generalHouseLoan_date) {
        this.generalHouseLoan_date = generalHouseLoan_date;
    }

    public Double getGeneralHouseLoan_amount() {
        return generalHouseLoan_amount;
    }

    public void setGeneralHouseLoan_amount(Double generalHouseLoan_amount) {
        this.generalHouseLoan_amount = generalHouseLoan_amount;
    }

    public Double getGeneralHouseLoan_monthly_installment() {
        return generalHouseLoan_monthly_installment;
    }

    public void setGeneralHouseLoan_monthly_installment(Double generalHouseLoan_monthly_installment) {
        this.generalHouseLoan_monthly_installment = generalHouseLoan_monthly_installment;
    }

    public Double getGeneralHouseLoan_remaining_amount() {
        return generalHouseLoan_remaining_amount;
    }

    public void setGeneralHouseLoan_remaining_amount(Double generalHouseLoan_remaining_amount) {
        this.generalHouseLoan_remaining_amount = generalHouseLoan_remaining_amount;
    }

    public Double getGeneralHouseLoan_current_loan_balance() {
        return generalHouseLoan_current_loan_balance;
    }

    public void setGeneralHouseLoan_current_loan_balance(Double generalHouseLoan_current_loan_balance) {
        this.generalHouseLoan_current_loan_balance = generalHouseLoan_current_loan_balance;
    }

    // Computer Loan
    public String getComputerLoan_sanction_no() {
        return computerLoan_sanction_no;
    }

    public void setComputerLoan_sanction_no(String computerLoan_sanction_no) {
        this.computerLoan_sanction_no = computerLoan_sanction_no;
    }

    public LocalDate getComputerLoan_date() {
        return computerLoan_date;
    }

    public void setComputerLoan_date(LocalDate computerLoan_date) {
        this.computerLoan_date = computerLoan_date;
    }

    public Double getComputerLoan_amount() {
        return computerLoan_amount;
    }

    public void setComputerLoan_amount(Double computerLoan_amount) {
        this.computerLoan_amount = computerLoan_amount;
    }

    public Double getComputerLoan_monthly_installment() {
        return computerLoan_monthly_installment;
    }

    public void setComputerLoan_monthly_installment(Double computerLoan_monthly_installment) {
        this.computerLoan_monthly_installment = computerLoan_monthly_installment;
    }

    public Double getComputerLoan_remaining_amount() {
        return computerLoan_remaining_amount;
    }

    public void setComputerLoan_remaining_amount(Double computerLoan_remaining_amount) {
        this.computerLoan_remaining_amount = computerLoan_remaining_amount;
    }

    public Double getComputerLoan_current_loan_balance() {
        return computerLoan_current_loan_balance;
    }

    public void setComputerLoan_current_loan_balance(Double computerLoan_current_loan_balance) {
        this.computerLoan_current_loan_balance = computerLoan_current_loan_balance;
    }

    // Motorcar Loan
    public String getMotorcarLoan_sanction_no() {
        return motorcarLoan_sanction_no;
    }

    public void setMotorcarLoan_sanction_no(String motorcarLoan_sanction_no) {
        this.motorcarLoan_sanction_no = motorcarLoan_sanction_no;
    }

    public LocalDate getMotorcarLoan_date() {
        return motorcarLoan_date;
    }

    public void setMotorcarLoan_date(LocalDate motorcarLoan_date) {
        this.motorcarLoan_date = motorcarLoan_date;
    }

    public Double getMotorcarLoan_amount() {
        return motorcarLoan_amount;
    }

    public void setMotorcarLoan_amount(Double motorcarLoan_amount) {
        this.motorcarLoan_amount = motorcarLoan_amount;
    }

    public Double getMotorcarLoan_monthly_installment() {
        return motorcarLoan_monthly_installment;
    }

    public void setMotorcarLoan_monthly_installment(Double motorcarLoan_monthly_installment) {
        this.motorcarLoan_monthly_installment = motorcarLoan_monthly_installment;
    }

    public Double getMotorcarLoan_remaining_amount() {
        return motorcarLoan_remaining_amount;
    }

    public void setMotorcarLoan_remaining_amount(Double motorcarLoan_remaining_amount) {
        this.motorcarLoan_remaining_amount = motorcarLoan_remaining_amount;
    }

    public Double getMotorcarLoan_current_loan_balance() {
        return motorcarLoan_current_loan_balance;
    }

    public void setMotorcarLoan_current_loan_balance(Double motorcarLoan_current_loan_balance) {
        this.motorcarLoan_current_loan_balance = motorcarLoan_current_loan_balance;
    }

    // Motorcycle Loan
    public String getMotorcycleLoan_sanction_no() {
        return motorcycleLoan_sanction_no;
    }

    public void setMotorcycleLoan_sanction_no(String motorcycleLoan_sanction_no) {
        this.motorcycleLoan_sanction_no = motorcycleLoan_sanction_no;
    }

    public LocalDate getMotorcycleLoan_date() {
        return motorcycleLoan_date;
    }

    public void setMotorcycleLoan_date(LocalDate motorcycleLoan_date) {
        this.motorcycleLoan_date = motorcycleLoan_date;
    }

    public Double getMotorcycleLoan_amount() {
        return motorcycleLoan_amount;
    }

    public void setMotorcycleLoan_amount(Double motorcycleLoan_amount) {
        this.motorcycleLoan_amount = motorcycleLoan_amount;
    }

    public Double getMotorcycleLoan_monthly_installment() {
        return motorcycleLoan_monthly_installment;
    }

    public void setMotorcycleLoan_monthly_installment(Double motorcycleLoan_monthly_installment) {
        this.motorcycleLoan_monthly_installment = motorcycleLoan_monthly_installment;
    }

    public Double getMotorcycleLoan_remaining_amount() {
        return motorcycleLoan_remaining_amount;
    }

    public void setMotorcycleLoan_remaining_amount(Double motorcycleLoan_remaining_amount) {
        this.motorcycleLoan_remaining_amount = motorcycleLoan_remaining_amount;
    }

    public Double getMotorcycleLoan_current_loan_balance() {
        return motorcycleLoan_current_loan_balance;
    }

    public void setMotorcycleLoan_current_loan_balance(Double motorcycleLoan_current_loan_balance) {
        this.motorcycleLoan_current_loan_balance = motorcycleLoan_current_loan_balance;
    }

    // Sewing Machine Loan
    public String getSewingMachineLoan_sanction_no() {
        return sewingMachineLoan_sanction_no;
    }

    public void setSewingMachineLoan_sanction_no(String sewingMachineLoan_sanction_no) {
        this.sewingMachineLoan_sanction_no = sewingMachineLoan_sanction_no;
    }

    public LocalDate getSewingMachineLoan_date() {
        return sewingMachineLoan_date;
    }

    public void setSewingMachineLoan_date(LocalDate sewingMachineLoan_date) {
        this.sewingMachineLoan_date = sewingMachineLoan_date;
    }

    public Double getSewingMachineLoan_amount() {
        return sewingMachineLoan_amount;
    }

    public void setSewingMachineLoan_amount(Double sewingMachineLoan_amount) {
        this.sewingMachineLoan_amount = sewingMachineLoan_amount;
    }

    public Double getSewingMachineLoan_monthly_installment() {
        return sewingMachineLoan_monthly_installment;
    }

    public void setSewingMachineLoan_monthly_installment(Double sewingMachineLoan_monthly_installment) {
        this.sewingMachineLoan_monthly_installment = sewingMachineLoan_monthly_installment;
    }

    public Double getSewingMachineLoan_remaining_amount() {
        return sewingMachineLoan_remaining_amount;
    }

    public void setSewingMachineLoan_remaining_amount(Double sewingMachineLoan_remaining_amount) {
        this.sewingMachineLoan_remaining_amount = sewingMachineLoan_remaining_amount;
    }

    public Double getSewingMachineLoan_current_loan_balance() {
        return sewingMachineLoan_current_loan_balance;
    }

    public void setSewingMachineLoan_current_loan_balance(Double sewingMachineLoan_current_loan_balance) {
        this.sewingMachineLoan_current_loan_balance = sewingMachineLoan_current_loan_balance;
    }

    // Consumer Loan
    public String getConsumerLoan_sanction_no() {
        return consumerLoan_sanction_no;
    }

    public void setConsumerLoan_sanction_no(String consumerLoan_sanction_no) {
        this.consumerLoan_sanction_no = consumerLoan_sanction_no;
    }

    public LocalDate getConsumerLoan_date() {
        return consumerLoan_date;
    }

    public void setConsumerLoan_date(LocalDate consumerLoan_date) {
        this.consumerLoan_date = consumerLoan_date;
    }

    public Double getConsumerLoan_amount() {
        return consumerLoan_amount;
    }

    public void setConsumerLoan_amount(Double consumerLoan_amount) {
        this.consumerLoan_amount = consumerLoan_amount;
    }

    public Double getConsumerLoan_monthly_installment() {
        return consumerLoan_monthly_installment;
    }

    public void setConsumerLoan_monthly_installment(Double consumerLoan_monthly_installment) {
        this.consumerLoan_monthly_installment = consumerLoan_monthly_installment;
    }

    public Double getConsumerLoan_remaining_amount() {
        return consumerLoan_remaining_amount;
    }

    public void setConsumerLoan_remaining_amount(Double consumerLoan_remaining_amount) {
        this.consumerLoan_remaining_amount = consumerLoan_remaining_amount;
    }

    public Double getConsumerLoan_current_loan_balance() {
        return consumerLoan_current_loan_balance;
    }

    public void setConsumerLoan_current_loan_balance(Double consumerLoan_current_loan_balance) {
        this.consumerLoan_current_loan_balance = consumerLoan_current_loan_balance;
    }

    // Other Loan
    public String getOtherLoan_sanction_no() {
        return otherLoan_sanction_no;
    }

    public void setOtherLoan_sanction_no(String otherLoan_sanction_no) {
        this.otherLoan_sanction_no = otherLoan_sanction_no;
    }

    public LocalDate getOtherLoan_date() {
        return otherLoan_date;
    }

    public void setOtherLoan_date(LocalDate otherLoan_date) {
        this.otherLoan_date = otherLoan_date;
    }

    public Double getOtherLoan_amount() {
        return otherLoan_amount;
    }

    public void setOtherLoan_amount(Double otherLoan_amount) {
        this.otherLoan_amount = otherLoan_amount;
    }

    public Double getOtherLoan_monthly_installment() {
        return otherLoan_monthly_installment;
    }

    public void setOtherLoan_monthly_installment(Double otherLoan_monthly_installment) {
        this.otherLoan_monthly_installment = otherLoan_monthly_installment;
    }

    public Double getOtherLoan_remaining_amount() {
        return otherLoan_remaining_amount;
    }

    public void setOtherLoan_remaining_amount(Double otherLoan_remaining_amount) {
        this.otherLoan_remaining_amount = otherLoan_remaining_amount;
    }

    public Double getOtherLoan_current_loan_balance() {
        return otherLoan_current_loan_balance;
    }

    public void setOtherLoan_current_loan_balance(Double otherLoan_current_loan_balance) {
        this.otherLoan_current_loan_balance = otherLoan_current_loan_balance;
    }

    // Other External Loan
    public String getOtherExLoan_institute() {
        return otherExLoan_institute;
    }

    public void setOtherExLoan_institute(String otherExLoan_institute) {
        this.otherExLoan_institute = otherExLoan_institute;
    }

    public String getOtherExLoan_status() {
        return otherExLoan_status;
    }

    public void setOtherExLoan_status(String otherExLoan_status) {
        this.otherExLoan_status = otherExLoan_status;
    }

    public Double getOtherExLoan_amount() {
        return otherExLoan_amount;
    }

    public void setOtherExLoan_amount(Double otherExLoan_amount) {
        this.otherExLoan_amount = otherExLoan_amount;
    }

    public Double getOtherExLoan_installment_amount() {
        return otherExLoan_installment_amount;
    }

    public void setOtherExLoan_installment_amount(Double otherExLoan_installment_amount) {
        this.otherExLoan_installment_amount = otherExLoan_installment_amount;
    }

    public Double getOtherExLoan_current_loan_balance() {
        return otherExLoan_current_loan_balance;
    }

    public void setOtherExLoan_current_loan_balance(Double otherExLoan_current_loan_balance) {
        this.otherExLoan_current_loan_balance = otherExLoan_current_loan_balance;
    }

    public Double getOtherExLoan_classification_status() {
        return otherExLoan_classification_status;
    }

    public void setOtherExLoan_classification_status(Double otherExLoan_classification_status) {
        this.otherExLoan_classification_status = otherExLoan_classification_status;
    }

    // Guarantor Information
    public String getGuarantorFullName() {
        return guarantorFullName;
    }

    public void setGuarantorFullName(String guarantorFullName) {
        this.guarantorFullName = guarantorFullName;
    }

    public String getGuarantorFullNameBangla() {
        return guarantorFullNameBangla;
    }

    public void setGuarantorFullNameBangla(String guarantorFullNameBangla) {
        this.guarantorFullNameBangla = guarantorFullNameBangla;
    }

    public String getGuarantorFathersName() {
        return guarantorFathersName;
    }

    public void setGuarantorFathersName(String guarantorFathersName) {
        this.guarantorFathersName = guarantorFathersName;
    }

    public String getGuarantorFathersNameBangla() {
        return guarantorFathersNameBangla;
    }

    public void setGuarantorFathersNameBangla(String guarantorFathersNameBangla) {
        this.guarantorFathersNameBangla = guarantorFathersNameBangla;
    }

    public String getGuarantorMothersName() {
        return guarantorMothersName;
    }

    public void setGuarantorMothersName(String guarantorMothersName) {
        this.guarantorMothersName = guarantorMothersName;
    }

    public String getGuarantorMothersBangla() {
        return guarantorMothersBangla;
    }

    public void setGuarantorMothersBangla(String guarantorMothersBangla) {
        this.guarantorMothersBangla = guarantorMothersBangla;
    }

    public String getGuarantorPresentAddress() {
        return guarantorPresentAddress;
    }

    public void setGuarantorPresentAddress(String guarantorPresentAddress) {
        this.guarantorPresentAddress = guarantorPresentAddress;
    }

    public String getGuarantorPermanentAddress() {
        return guarantorPermanentAddress;
    }

    public void setGuarantorPermanentAddress(String guarantorPermanentAddress) {
        this.guarantorPermanentAddress = guarantorPermanentAddress;
    }

    public String getGuarantorNid() {
        return guarantorNid;
    }

    public void setGuarantorNid(String guarantorNid) {
        this.guarantorNid = guarantorNid;
    }

    public String getGuarantorAcNo() {
        return guarantorAcNo;
    }

    public void setGuarantorAcNo(String guarantorAcNo) {
        this.guarantorAcNo = guarantorAcNo;
    }
    
    

    // Getters & Setters
    // (Generate them or use Lombok @Data)
}

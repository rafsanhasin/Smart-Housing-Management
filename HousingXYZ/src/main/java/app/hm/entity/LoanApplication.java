package app.hm.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

import app.hm.enums.LoanStatus;

@Entity
@Table(name = "loan_applications")
public class LoanApplication {
    // ===== Applicant Info =====
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanApplicationId;

    @Column(nullable = false)
    private LoanStatus status =LoanStatus.PENDING; // default status

    @Column(nullable = false)
    private LocalDate submittedDate = LocalDate.now();

    @Column(nullable = false)
    private String loanPurpose;

    @Column(nullable = false)
    private Double expectedLoan;

    @Column(nullable = false)
    private Integer loanTenure;

    // Link to User
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Applicant (Required)
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "applicant_id", referencedColumnName = "applicantId", nullable = false)
    private Applicant applicant;

    // Guarantor (Required)
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "guarantor_id", referencedColumnName = "guarantorId", nullable = false)
    private GuarantorInfo guarantor;

    // Existing Loan Info (Optional)
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "existing_loan_info_id", referencedColumnName = "existingLoanInfoId")
    private ExistingLoanInfo existingLoanInfo;


    // ===== Getters & Setters =====
    public Long getId() { return loanApplicationId; }
    public void setId(Long loanApplicationId) { this.loanApplicationId = loanApplicationId; }
    public LoanStatus getStatus() {
        return status;
    }
    public void setStatus(LoanStatus status) {
        this.status = status;
    }
    public LocalDate getSubmittedDate() { return submittedDate; }
    public void setSubmittedDate(LocalDate submittedDate) { this.submittedDate = submittedDate; }
    public String getLoanPurpose() {
        return loanPurpose;
    }
    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }
    public Integer getLoanTenure() {
        return loanTenure;
    }
    public void setLoanTenure(Integer loanTenure) {
        this.loanTenure = loanTenure;
    }
    public Double getExpectedLoan() {
        return expectedLoan;
    }
    public void setExpectedLoan(Double expectedLoan) {
        this.expectedLoan = expectedLoan;
    }

    public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public GuarantorInfo getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(GuarantorInfo guarantor) {
        this.guarantor = guarantor;
    }

    public ExistingLoanInfo getExistingLoanInfo() {
        return existingLoanInfo;
    }

    public void setExistingLoanInfo(ExistingLoanInfo existingLoanInfo) {
        this.existingLoanInfo = existingLoanInfo;
    }


}

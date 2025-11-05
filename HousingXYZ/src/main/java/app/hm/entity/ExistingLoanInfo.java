package app.hm.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "applicants_existing_loan_info")

public class ExistingLoanInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long existingLoanInfoId;

    // Loan Against PF
    @Column(nullable = true)
    private String loanAgainstPF_sanction_no;

    @Column(nullable = true)
    private LocalDate loanAgainstPF_date;

    @Column(nullable = true)
    private Double loanAgainstPF_amount;

    @Column(nullable = true)
    private Double loanAgainstPF_monthly_installment;

    @Column(nullable = true)
    private Double loanAgainstPF_remaining_amount;

    @Column(nullable = true)
    private Double loanAgainstPF_current_loan_balance;

    // Employee House Loan
    @Column(nullable = true)
    private String employeeHouseLoan_sanction_no;

    @Column(nullable = true)
    private LocalDate employeeHouseLoan_date;

    @Column(nullable = true)
    private Double employeeHouseLoan_amount;

    @Column(nullable = true)
    private Double employeeHouseLoan_monthly_installment;

    @Column(nullable = true)
    private Double employeeHouseLoan_remaining_amount;

    @Column(nullable = true)
    private Double employeeHouseLoan_current_loan_balance;

    // General House Loan
    @Column(nullable = true)
    private String generalHouseLoan_sanction_no;

    @Column(nullable = true)
    private LocalDate generalHouseLoan_date;

    @Column(nullable = true)
    private Double generalHouseLoan_amount;

    @Column(nullable = true)
    private Double generalHouseLoan_monthly_installment;

    @Column(nullable = true)
    private Double generalHouseLoan_remaining_amount;

    @Column(nullable = true)
    private Double generalHouseLoan_current_loan_balance;

    // Computer Loan
    @Column(nullable = true)
    private String computerLoan_sanction_no;

    @Column(nullable = true)
    private LocalDate computerLoan_date;

    @Column(nullable = true)
    private Double computerLoan_amount;

    @Column(nullable = true)
    private Double computerLoan_monthly_installment;

    @Column(nullable = true)
    private Double computerLoan_remaining_amount;

    @Column(nullable = true)
    private Double computerLoan_current_loan_balance;

    // Motorcar Loan
    @Column(nullable = true)
    private String motorcarLoan_sanction_no;

    @Column(nullable = true)
    private LocalDate motorcarLoan_date;

    @Column(nullable = true)
    private Double motorcarLoan_amount;

    @Column(nullable = true)
    private Double motorcarLoan_monthly_installment;

    @Column(nullable = true)
    private Double motorcarLoan_remaining_amount;

    @Column(nullable = true)
    private Double motorcarLoan_current_loan_balance;

    // Motorcycle Loan
    @Column(nullable = true)
    private String motorcycleLoan_sanction_no;

    @Column(nullable = true)
    private LocalDate motorcycleLoan_date;

    @Column(nullable = true)
    private Double motorcycleLoan_amount;

    @Column(nullable = true)
    private Double motorcycleLoan_monthly_installment;

    @Column(nullable = true)
    private Double motorcycleLoan_remaining_amount;

    @Column(nullable = true)
    private Double motorcycleLoan_current_loan_balance;

    // Sewing Machine Loan
    @Column(nullable = true)
    private String sewingMachineLoan_sanction_no;

    @Column(nullable = true)
    private LocalDate sewingMachineLoan_date;

    @Column(nullable = true)
    private Double sewingMachineLoan_amount;

    @Column(nullable = true)
    private Double sewingMachineLoan_monthly_installment;

    @Column(nullable = true)
    private Double sewingMachineLoan_remaining_amount;

    @Column(nullable = true)
    private Double sewingMachineLoan_current_loan_balance;

    // Consumer Loan
    @Column(nullable = true)
    private String consumerLoan_sanction_no;

    @Column(nullable = true)
    private LocalDate consumerLoan_date;

    @Column(nullable = true)
    private Double consumerLoan_amount;

    @Column(nullable = true)
    private Double consumerLoan_monthly_installment;

    @Column(nullable = true)
    private Double consumerLoan_remaining_amount;

    @Column(nullable = true)
    private Double consumerLoan_current_loan_balance;

    // Other Loan
    @Column(nullable = true)
    private String otherLoan_sanction_no;

    @Column(nullable = true)
    private LocalDate otherLoan_date;

    @Column(nullable = true)
    private Double otherLoan_amount;

    @Column(nullable = true)
    private Double otherLoan_monthly_installment;

    @Column(nullable = true)
    private Double otherLoan_remaining_amount;

    @Column(nullable = true)
    private Double otherLoan_current_loan_balance;

    // Other External Loan
    @Column(nullable = true)
    private String otherExLoan_institute;

    @Column(nullable = true)
    private String otherExLoan_status;

    @Column(nullable = true)
    private Double otherExLoan_amount;

    @Column(nullable = true)
    private Double otherExLoan_installment_amount;

    @Column(nullable = true)
    private Double otherExLoan_current_loan_balance;

    @Column(nullable = true)
    private Double otherExLoan_classification_status;
}
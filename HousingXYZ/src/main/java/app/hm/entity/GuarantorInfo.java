package app.hm.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "applicants_guarantor_info")

public class GuarantorInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guarantorId;

    // Guarantor Information
    @Column(nullable = false)
    private String guarantorFullName;

    @Column(nullable = false)
    private String guarantorFullNameBangla;

    @Column(nullable = false)
    private String guarantorFathersName;

    @Column(nullable = false)
    private String guarantorFathersNameBangla;

    @Column(nullable = false)
    private String guarantorMothersName;

    @Column(nullable = false)
    private String guarantorMothersBangla;

    @Column(nullable = false)
    private String guarantorPresentAddress;

    @Column(nullable = false)
    private String guarantorPermanentAddress;

    @Column(nullable = false)
    private String guarantorNid;

    @Column(nullable = false)
    private String guarantorAcNo;

    // Guarantor Information Getters and Setters
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
}
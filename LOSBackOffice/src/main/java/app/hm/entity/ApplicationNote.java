package app.hm.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ApplicationNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private LoanApplication application;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    @ManyToOne
    @JoinColumn(name = "forwarded_to")
    private User forwardedTo; // next officer

    @Lob
    private String content; // HTML content from Summernote

    private boolean forwarded = false;
    private boolean editable = true;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt;
    private LocalDateTime forwardedAt;

    @OneToMany(mappedBy = "note", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NoteSignature> signatures = new ArrayList<>();

    @OneToMany(mappedBy = "note", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NoteAttachment> attachments = new ArrayList<>();

    // ===== Getters and Setters =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LoanApplication getApplication() {
        return application;
    }

    public void setApplication(LoanApplication application) {
        this.application = application;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public User getForwardedTo() {
        return forwardedTo;
    }

    public void setForwardedTo(User forwardedTo) {
        this.forwardedTo = forwardedTo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isForwarded() {
        return forwarded;
    }

    public void setForwarded(boolean forwarded) {
        this.forwarded = forwarded;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getForwardedAt() {
        return forwardedAt;
    }

    public void setForwardedAt(LocalDateTime forwardedAt) {
        this.forwardedAt = forwardedAt;
    }

    public List<NoteSignature> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<NoteSignature> signatures) {
        this.signatures = signatures;
    }

    public List<NoteAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<NoteAttachment> attachments) {
        this.attachments = attachments;
    }
}

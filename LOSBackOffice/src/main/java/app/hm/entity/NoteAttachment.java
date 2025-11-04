package app.hm.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class NoteAttachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;
    private String filePath;
    private String contentType;

    private LocalDateTime uploadedAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "note_id")
    private ApplicationNote note;

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    public String getFilePath() { return filePath; }
    public void setFilePath(String filePath) { this.filePath = filePath; }

    public String getContentType() { return contentType; }
    public void setContentType(String contentType) { this.contentType = contentType; }

    public LocalDateTime getUploadedAt() { return uploadedAt; }
    public void setUploadedAt(LocalDateTime uploadedAt) { this.uploadedAt = uploadedAt; }

    public ApplicationNote getNote() { return note; }
    public void setNote(ApplicationNote note) { this.note = note; }
}

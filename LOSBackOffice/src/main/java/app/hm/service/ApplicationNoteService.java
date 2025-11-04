package app.hm.service;

import app.hm.entity.*;
import app.hm.repo.ApplicationNoteRepo;
import app.hm.repo.NoteAttachmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ApplicationNoteService {

    private  ApplicationNoteRepo noteRepo;
    private  NoteAttachmentRepository attachmentRepo;

    public ApplicationNoteService(ApplicationNoteRepo noteRepo, NoteAttachmentRepository attachmentRepo) {
        this.noteRepo = noteRepo;
        this.attachmentRepo = attachmentRepo;
    }

    public List<ApplicationNote> getNotesByApplication(LoanApplication app) {
        return noteRepo.findByApplicationOrderByCreatedAtDesc(app);
    }

    public ApplicationNote getNoteById(Long id) {
        return noteRepo.findById(id).orElse(null);
    }

    public ApplicationNote save(ApplicationNote note) {
        note.setUpdatedAt(LocalDateTime.now());
        return noteRepo.save(note);
    }

    public void forwardNote(ApplicationNote note, User forwardTo) {
        note.setForwarded(true);
        note.setEditable(false);
        note.setForwardedTo(forwardTo);
        note.setForwardedAt(LocalDateTime.now());
        noteRepo.save(note);
    }

    public void saveAttachment(ApplicationNote note, MultipartFile file) throws IOException {
        String uploadDir = "uploads/notes/" + note.getId();
        File dir = new File(uploadDir);
        if (!dir.exists()) dir.mkdirs();

        String filePath = uploadDir + "/" + file.getOriginalFilename();
        file.transferTo(new File(filePath));

        NoteAttachment attach = new NoteAttachment();
        attach.setFileName(file.getOriginalFilename());
        attach.setFilePath(filePath);
        attach.setContentType(file.getContentType());
        attach.setNote(note);
        attachmentRepo.save(attach);
    }
}

package app.hm.repo;


import app.hm.entity.NoteAttachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteAttachmentRepository extends JpaRepository<NoteAttachment, Long> {
}


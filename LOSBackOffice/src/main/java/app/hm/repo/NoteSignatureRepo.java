package app.hm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import app.hm.entity.LoanApplication;
import app.hm.entity.NoteSignature;

public interface NoteSignatureRepo extends JpaRepository<NoteSignature, Long> {

}

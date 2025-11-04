package app.hm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.hm.entity.ApplicationNote;
import app.hm.entity.LoanApplication;

public interface ApplicationNoteRepo extends JpaRepository<ApplicationNote, Long>{
	List<ApplicationNote> findByApplicationId(Long appId);
    List<ApplicationNote> findByApplicationOrderByCreatedAtDesc(LoanApplication app);


}

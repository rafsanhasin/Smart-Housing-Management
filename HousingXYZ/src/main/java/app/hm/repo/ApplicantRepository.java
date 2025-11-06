package app.hm.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import app.hm.entity.Applicant;
import app.hm.entity.User;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
	 // Find all loan applications by a specific user
    List<Applicant> findByUser(User user);
    Optional<Applicant> findByNid(String nid);
    Optional<Applicant> findByEmail(String email);
}

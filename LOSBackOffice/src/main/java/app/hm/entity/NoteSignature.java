package app.hm.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class NoteSignature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "note_id")
    private ApplicationNote note;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String designation; // optional, e.g., "Senior Officer"
    private LocalDateTime signedAt = LocalDateTime.now();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ApplicationNote getNote() {
		return note;
	}
	public void setNote(ApplicationNote note) {
		this.note = note;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public LocalDateTime getSignedAt() {
		return signedAt;
	}
	public void setSignedAt(LocalDateTime signedAt) {
		this.signedAt = signedAt;
	}

    
    
    // getters and setters
}

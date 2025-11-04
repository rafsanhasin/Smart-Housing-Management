package app.hm.ctl;

import app.hm.entity.*;
import app.hm.service.ApplicationNoteService;
import app.hm.service.UserService;
import app.hm.repo.LoanApplicationRepository;
import app.hm.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/office/notes")
public class NoteController {

    private final ApplicationNoteService noteService;
    private final LoanApplicationRepository loanRepo;
    private final UserRepository userRepo;
@Autowired UserService userService;
    public NoteController(ApplicationNoteService noteService,
                          LoanApplicationRepository loanRepo,
                          UserRepository userRepo) {
        this.noteService = noteService;
        this.loanRepo = loanRepo;
        this.userRepo = userRepo;
    }

    @GetMapping("/view/{appId}")
    public String viewNotes(@PathVariable("appId") Long appId,
                            @AuthenticationPrincipal UserDetails userDetails,
                            Model model) {
        LoanApplication app = loanRepo.findById(appId).orElse(null);
        if (app == null) return "redirect:/office/applications";

        User currentUser = userService.findByUsername(userDetails.getUsername());
        List<ApplicationNote> notes = noteService.getNotesByApplication(app);

        ApplicationNote editableNote = notes.stream()
                .filter(n -> n.getCreatedBy().equals(currentUser) && n.isEditable())
                .findFirst()
                .orElse(null);

        model.addAttribute("app", app);
        model.addAttribute("notes", notes);
        model.addAttribute("editableNote", editableNote);
        model.addAttribute("users", userRepo.findAll());
        
        model.addAttribute("content", "office/note-view"); // Thymeleaf fragment

        return "user-layout";
    }

    @PostMapping("/save")
    public String saveNote(@RequestParam("appId") Long appId,
                           @RequestParam("content") String content,
                           @AuthenticationPrincipal UserDetails userDetails) {
        LoanApplication app = loanRepo.findById(appId).orElseThrow();
        User currentUser = userService.findByUsername(userDetails.getUsername());

        ApplicationNote note = new ApplicationNote();
        note.setApplication(app);
        note.setCreatedBy(currentUser);
        note.setContent(content);
        noteService.save(note);
        return "redirect:/office/notes/view/" + appId;
    }

    @PostMapping("/update")
    public String updateNote(@RequestParam("id") Long id,
                             @RequestParam("content") String content,
                             @AuthenticationPrincipal UserDetails userDetails) {
        ApplicationNote note = noteService.getNoteById(id);
        if (note != null) {
            note.setContent(content);
            noteService.save(note);
        }
        return "redirect:/office/notes/view/" + note.getApplication().getId();
    }

    @PostMapping("/forward/{noteId}")
    public String forwardNote(@PathVariable("noteId") Long noteId,
                              @RequestParam("forwardToId") Long forwardToId) {
        ApplicationNote note = noteService.getNoteById(noteId);
        User forwardTo = userRepo.findById(forwardToId).orElse(null);
        if (note != null && forwardTo != null) {
            noteService.forwardNote(note, forwardTo);
        }
        return "redirect:/office/notes/view/" + note.getApplication().getId();
    }

    @PostMapping("/attach")
    public String attachFile(@RequestParam("noteId") Long noteId,
                             @RequestParam("file") MultipartFile file) throws IOException {
        ApplicationNote note = noteService.getNoteById(noteId);
        noteService.saveAttachment(note, file);
        return "redirect:/office/notes/view/" + note.getApplication().getId();
    }
}

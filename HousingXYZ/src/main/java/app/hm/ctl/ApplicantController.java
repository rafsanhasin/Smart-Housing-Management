package app.hm.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.hm.dto.ApplicantForm;
import app.hm.entity.Applicant;
import app.hm.repo.ApplicantRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/applicant")
public class ApplicantController {

    @Autowired
    private ApplicantRepository applicantRepository;

    // ✅ Step 1: Show Applicant Info Form
    @GetMapping("/form")
    public String showApplicantForm(Model model) {
        model.addAttribute("applicantForm", new ApplicantForm());
        model.addAttribute("content", "user/loan-form"); // Your applicant info template
        return "user-layout";
    }

    // ✅ Step 2: Handle Applicant Form Submission
    @PostMapping("/form")
    public String submitApplicantForm(
            @Valid @ModelAttribute("applicantForm") ApplicantForm applicantForm,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            model.addAttribute("content", "user/loan-form");
            return "user-layout"; // re-display form with validation errors
        }

        // Convert DTO → Entity manually or via mapper
        Applicant applicant = new Applicant();
        applicant.setFullName(applicantForm.getFullName());
        applicant.setDateOfBirth(applicantForm.getDateOfBirth());
        applicant.setNid(applicantForm.getNid());
        applicant.setPhone(applicantForm.getPhone());
        applicant.setAddress(applicantForm.getAddress());
        applicant.setOccupation(applicantForm.getOccupation());
        applicant.setMonthlyIncome(applicantForm.getMonthlyIncome());

        // Save applicant
        applicantRepository.save(applicant);

        // Redirect to loan form (linking applicantId)
        return "redirect:/loan/apply?applicantId=" + applicant.getApplicantId();
    }
}

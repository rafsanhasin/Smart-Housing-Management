package app.hm.ctl;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import app.hm.dto.DocumentForm;
import app.hm.dto.LoanForm;
import app.hm.entity.LoanApplication;
import app.hm.entity.User;
import app.hm.repo.LoanApplicationRepository;
import app.hm.service.UserService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/customer")
public class LoanController {

    @Autowired
    private LoanApplicationRepository loanApplicationRepository;

    @GetMapping("/apply-loan")
    public String showApplyLoanForm(Model model) {
        model.addAttribute("loanForm", new LoanForm());
        model.addAttribute("content", "user/apply-loan"); // Thymeleaf fragment
        return "user-layout";
    }
    @Autowired UserService userService;
    @PostMapping("/apply-loan")
    public String submitLoanForm(@Valid @ModelAttribute("loanForm") LoanForm loanForm,
                                 BindingResult result, Model model,Principal principal) {

        if (result.hasErrors()) {
        	 model.addAttribute("content", "user/apply-loan"); // Thymeleaf fragment
             return "user-layout";
        }
        String username = principal.getName();
        User user = userService.findByUsername(username);

        // Map DTO to Entity
        LoanApplication loan = new LoanApplication();
        loan.setFullName(loanForm.getFullName());
        loan.setNid(loanForm.getNid());
        loan.setEmail(loanForm.getEmail());
        loan.setMobile(loanForm.getMobile());
        loan.setDob(loanForm.getDob());
        loan.setGender(loanForm.getGender());
        loan.setEmploymentType(loanForm.getEmploymentType());
        loan.setOrganization(loanForm.getOrganization());
        loan.setIncome(loanForm.getIncome());
        loan.setLoanType(loanForm.getLoanType());
        loan.setPurpose(loanForm.getPurpose());
        loan.setAmount(loanForm.getAmount());
        loan.setTenure(loanForm.getTenure());
        loan.setUser(user);
        // Save to DB
        loanApplicationRepository.save(loan);

        // Redirect to document upload page
        return "redirect:/customer/upload-documents?loanId=" + loan.getId();
    }
   

}

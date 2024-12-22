package edu.rut.web.controllers;

import edu.rut.web.dto.feedback.CreateFeedbackForm;
import edu.rut.web.dto.feedback.EditFeedbackForm;
import edu.rut.web.dto.feedback.FeedbackSearchForm;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/feedbacks")
public interface FeedbackController extends BaseController {

	@GetMapping("/{productId}")
	String getFeedbacks(@ModelAttribute("form") FeedbackSearchForm form,
						Model model,
						@PathVariable Long productId);

	@GetMapping("/create/{productId}")
	String createForm(Model model,
					  @PathVariable Long productId);

	@PostMapping("/create/{productId}")
	String saveFeedback(@Valid @ModelAttribute("form") CreateFeedbackForm form,
						BindingResult bindingResult,
						Model model,
						@AuthenticationPrincipal UserDetails userDetails,
						@PathVariable Long productId);

	@DeleteMapping("/delete/{id}")
	String deleteFeedback(@PathVariable Long id);

	@PutMapping("/update/{id}")
	String updateFeedback(@PathVariable Long id,
						  @Valid @ModelAttribute("form") EditFeedbackForm form,
						  BindingResult bindingResult,
						  Model model,
						  @AuthenticationPrincipal UserDetails userDetails);

	@GetMapping("/update/{id}")
	String updateForm(@PathVariable Long id,
					  Model model);
}

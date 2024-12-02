package edu.rut.web.controllers;

import edu.rut.web.dto.feedback.FeedbackViewModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/v1/feedbacks")
public interface FeedbackController extends BaseController {

	@GetMapping("/")
	String getFeedbacks(@Valid @ModelAttribute("form") FeedbackViewModel viewModel,
						Model model);

	@GetMapping("/{id}")
	String getFeedback(@PathVariable Long id,
					   Model model);

	@GetMapping("/create")
	String createForm(Model model);

	@PostMapping("/create")
	String saveFeedback(@Valid @ModelAttribute("form") FeedbackViewModel viewModel,
						Model model);

	@DeleteMapping("/delete/{id}")
	String deleteFeedback(@PathVariable Long id);

	@PutMapping("/update/{id}")
	String updateFeedback(@PathVariable Long id,
						  @Valid @ModelAttribute("form") FeedbackViewModel viewModel,
						  Model model);
}

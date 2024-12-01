package edu.rut.web.controllers.model;

import edu.rut.web.controllers.BaseController;
import edu.rut.web.dto.feedback.FeedbackViewModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/feedbacks")
public interface FeedbackController extends BaseController {

    @GetMapping("/")
    String getFeedbacks(@ModelAttribute FeedbackViewModel viewModel,
                     Model model);

    @GetMapping("/{id}")
    String getFeedback(@PathVariable Long id,
                    Model model);

    @GetMapping("/create")
    String createForm(Model model);

    @PostMapping("/create")
    String saveFeedback(@ModelAttribute FeedbackViewModel viewModel,
                     Model model);

    @DeleteMapping("/delete/{id}")
    String deleteFeedback(@PathVariable Long id);

    @PutMapping("/update/{id}")
    String updateFeedback(@PathVariable Long id,
                       @ModelAttribute FeedbackViewModel viewModel,
                       Model model);
}

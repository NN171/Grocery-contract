package edu.rut.web.controllers.model;

import edu.rut.web.controllers.BaseController;
import edu.rut.web.dto.FeedbackViewModel;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/feedbacks")
public interface FeedbackController extends BaseController {

    @GetMapping("/")
    FeedbackViewModel getFeedbacks();

    @GetMapping("/feedback/")
    FeedbackViewModel getFeedback(Long id);

    @PostMapping("/")
    FeedbackViewModel saveFeedback();

    @DeleteMapping("/")
    FeedbackViewModel deleteFeedback(Long id);

    @PutMapping("/")
    FeedbackViewModel updateFeedback();
}

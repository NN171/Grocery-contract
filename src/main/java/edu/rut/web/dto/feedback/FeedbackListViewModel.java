package edu.rut.web.dto.feedback;

import java.util.List;

public record FeedbackListViewModel(
		List<FeedbackViewModel> viewModels
) {
}

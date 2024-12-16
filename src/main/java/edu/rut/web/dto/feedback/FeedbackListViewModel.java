package edu.rut.web.dto.feedback;

import edu.rut.web.dto.base.BaseViewModel;

import java.util.List;

public record FeedbackListViewModel(
		BaseViewModel viewModel,
		List<FeedbackViewModel> feedbackViewModels,
		String productName,
		Integer page,
		Integer totalPages
) {
}

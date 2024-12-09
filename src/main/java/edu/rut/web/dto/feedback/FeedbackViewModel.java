package edu.rut.web.dto.feedback;

import edu.rut.web.dto.base.BaseViewModel;

public record FeedbackViewModel(
		Long id,
		Integer rating,
		String comment,
		String date
) {
}

package edu.rut.web.dto.feedback;

public record FeedbackViewModel(
		Long id,
		Integer rating,
		String comment,
		String date,
		Long productId,
		String customerName
) {
}

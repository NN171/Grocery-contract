package edu.rut.web.dto.product;

import edu.rut.web.dto.feedback.FeedbackListViewModel;

import java.time.LocalDate;

public record ProductViewModel(
		Long id,
		String name,
		Double price,
		Integer amount,
		LocalDate prodDate,
		LocalDate expiryDate,
		Double avgRating,
		FeedbackListViewModel feedbackList,
		ProductListViewModel productList
) {
}

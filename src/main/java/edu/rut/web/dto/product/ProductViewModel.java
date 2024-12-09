package edu.rut.web.dto.product;

import edu.rut.web.dto.base.BaseViewModel;
import edu.rut.web.dto.feedback.FeedbackListViewModel;

public record ProductViewModel(
		Long id,
		String name,
		Double price,
		Integer amount,
		String prodDate,
		String expiryDate,
		Double avgRating,
		FeedbackListViewModel feedbackList,
		ProductListViewModel productList
) {
}

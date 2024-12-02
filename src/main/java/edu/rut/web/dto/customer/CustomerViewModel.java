package edu.rut.web.dto.customer;

import edu.rut.web.dto.feedback.FeedbackListViewModel;
import edu.rut.web.dto.order.OrderListViewModel;

public record CustomerViewModel(
		String firstName,
		String lastName,
		String phone,
		Integer discount,
		OrderListViewModel orderViewModel,
		FeedbackListViewModel feedbackViewModel
) {
}

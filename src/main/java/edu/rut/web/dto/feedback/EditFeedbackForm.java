package edu.rut.web.dto.feedback;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public record EditFeedbackForm(
		Long id,
		@Min(1) @Max(5) Integer rating,
		String comment,
		Long productId,
		Long customerId
) {
}

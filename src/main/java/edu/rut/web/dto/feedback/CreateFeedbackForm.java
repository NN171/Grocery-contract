package edu.rut.web.dto.feedback;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public record CreateFeedbackForm(
		Long productId,
		@Min(1) @Max(5) Integer rating,
		String comment
) {
}

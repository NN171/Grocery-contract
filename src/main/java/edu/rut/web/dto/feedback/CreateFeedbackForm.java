package edu.rut.web.dto.feedback;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record CreateFeedbackForm(
		@NotBlank Long productId,
		@NotBlank(message = "Рейтинг обязателен") @Min(1) @Max(5) Integer rating,
		String comment
) {
}

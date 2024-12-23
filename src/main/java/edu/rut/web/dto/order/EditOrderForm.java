package edu.rut.web.dto.order;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

public record EditOrderForm(
		Long id,
		@NotBlank(message = "Статус обязателен") String status,
		@DecimalMin("0") Double price
) {
}

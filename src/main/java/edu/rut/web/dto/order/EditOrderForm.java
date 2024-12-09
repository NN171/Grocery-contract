package edu.rut.web.dto.order;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

public record EditOrderForm(
		@NotBlank(message = "Идентификатор обязателен") Long id,
		@NotBlank(message = "Статус обязателен") String status,
		@NotBlank(message = "Цена обязательна") @DecimalMin("0") Double price
) {
}

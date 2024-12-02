package edu.rut.web.dto.order;

import jakarta.validation.constraints.NotBlank;

public record EditOrderForm(
		@NotBlank(message = "Идентификатор обязателен") Long id,
		@NotBlank(message = "Название продукта обязательно") String productName
) {
}

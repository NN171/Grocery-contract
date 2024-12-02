package edu.rut.web.dto.product;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

public record EditProductForm(
		@NotBlank(message = "Идентификатор обязателен") Long id,
		@NotBlank(message = "Название обязательно") String name,
		@NotBlank(message = "Цена обязательна") @DecimalMin("0") double price,
		@NotBlank(message = "Количество обязательно") Integer amount
) {
}

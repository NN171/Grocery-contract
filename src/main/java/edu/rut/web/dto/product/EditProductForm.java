package edu.rut.web.dto.product;

import jakarta.validation.constraints.NotBlank;

public record EditProductForm(
		Long id,
		@NotBlank(message = "Название обязательно") String name,
		double price,
		Integer amount,
		@NotBlank(message = "Дата изготовления обязательна") String creationDate,
		@NotBlank(message = "Дата окончания срока годности обязательна") String expiryDate
) {
}

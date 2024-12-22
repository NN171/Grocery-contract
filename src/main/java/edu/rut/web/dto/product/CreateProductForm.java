package edu.rut.web.dto.product;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

public record CreateProductForm(
		@NotBlank(message = "Название обязательно") String name,
		@DecimalMin("0") double price,
		Integer amount,
		@NotBlank(message = "Дата изготовления обязательна") String creationDate,
		@NotBlank(message = "Дата окончания срока годности обязательна") String expiryDate
) {
}

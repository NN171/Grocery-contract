package edu.rut.web.dto.product;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

public record CreateProductForm(
		@NotBlank(message = "Название обязательно") String name,
		@NotBlank(message = "Цена обязательна") @DecimalMin("0") double price,
		@NotBlank(message = "Количество обязательно") Integer amount,
		@NotBlank(message = "Дата изготовления обязательна") String creationDate,
		@NotBlank(message = "Дата окончания срока годности обязательна") String expiryDate
) {
}

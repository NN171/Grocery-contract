package edu.rut.web.dto.product;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record CreateProductForm(
		@NotBlank(message = "Название обязательно") String name,
		@DecimalMin("0") double price,
		Integer amount,
		LocalDate creationDate,
		LocalDate expiryDate
) {
}

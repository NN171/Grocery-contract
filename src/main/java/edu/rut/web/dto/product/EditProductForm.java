package edu.rut.web.dto.product;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record EditProductForm(
		Long id,
		@NotBlank(message = "Название обязательно") String name,
		double price,
		Integer amount,
		LocalDate creationDate,
		LocalDate expiryDate
) {
}

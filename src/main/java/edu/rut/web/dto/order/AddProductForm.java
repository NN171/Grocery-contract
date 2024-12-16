package edu.rut.web.dto.order;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record AddProductForm(
		@DecimalMin("0") Double price,
		@NotBlank(message = "Название продукта обязательно") String productName,
		@Min(0L) Long productId,
		@Min(1) Integer quantity
) {
}

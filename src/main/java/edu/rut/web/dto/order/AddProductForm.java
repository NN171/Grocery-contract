package edu.rut.web.dto.order;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;

public record AddProductForm(
		@DecimalMin("0") Double price,
		@Min(0L) Long productId,
		@Min(1) Integer quantity
) {
}

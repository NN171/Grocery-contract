package edu.rut.web.dto.order;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record CreateOrderForm(
		@Min(0L) Long customerId,
		@Min(0L) Long employeeId,
		@NotEmpty List<AddProductForm> productList
) {
}

package edu.rut.web.dto.productOrder;

public record ProductOrderViewModel(
		Long id,
		String productName,
		int quantity,
		double price
) {
}

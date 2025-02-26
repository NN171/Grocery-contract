package edu.rut.web.dto.order;

import edu.rut.web.dto.productOrder.ProductOrderViewModel;

import java.util.List;

public record OrderViewModel(
		Long id,
		String status,
		double price,
		List<ProductOrderViewModel> products
) {
}

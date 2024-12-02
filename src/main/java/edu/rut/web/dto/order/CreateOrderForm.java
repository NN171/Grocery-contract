package edu.rut.web.dto.order;

import edu.rut.web.dto.product.ProductViewModel;

import java.util.List;

public record CreateOrderForm(
		List<ProductViewModel> productViewModels
) {
}

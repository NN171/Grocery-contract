package edu.rut.web.dto.order;

import edu.rut.web.dto.base.BaseViewModel;
import edu.rut.web.dto.product.ProductListViewModel;

public record OrderViewModel(
		Long id,
		Double price,
		Long customer,
		Long employee,
		ProductListViewModel productList
) {
}

package edu.rut.web.dto.product;

import java.util.List;

public record ProductListViewModel(
		List<ProductViewModel> viewModels
) {
}

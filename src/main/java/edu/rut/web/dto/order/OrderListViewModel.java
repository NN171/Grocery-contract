package edu.rut.web.dto.order;

import java.util.List;

public record OrderListViewModel(
		List<OrderViewModel> viewModels
) {
}

package edu.rut.web.dto.order;

import edu.rut.web.dto.base.BaseViewModel;

import java.util.List;

public record OrderListViewModel(
		BaseViewModel viewModel,
		List<OrderViewModel> orderViewModels,
		Integer page,
		Integer totalPages
) {
}

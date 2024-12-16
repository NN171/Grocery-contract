package edu.rut.web.dto.customer;

import edu.rut.web.dto.base.BaseViewModel;

import java.util.List;

public record CustomerListViewModel(
		BaseViewModel viewModel,
		List<CustomerViewModel> viewModelList,
		Integer page,
		Integer totalPages
) {
}

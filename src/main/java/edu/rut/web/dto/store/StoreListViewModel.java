package edu.rut.web.dto.store;

import edu.rut.web.dto.base.BaseViewModel;
import edu.rut.web.dto.employee.EmployeeViewModel;

import java.util.List;

public record StoreListViewModel(
		BaseViewModel viewModel,
		List<StoreViewModel> storeViewModels,
		Integer pages
) {
}

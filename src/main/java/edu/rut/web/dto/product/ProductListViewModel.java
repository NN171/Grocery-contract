package edu.rut.web.dto.product;

import edu.rut.web.dto.base.BaseViewModel;
import edu.rut.web.dto.employee.EmployeeViewModel;

import java.util.List;

public record ProductListViewModel(
		BaseViewModel viewModel,
		List<ProductViewModel> productViewModels,
		Integer pages
) {
}

package edu.rut.web.dto.employee;

import edu.rut.web.dto.base.BaseViewModel;

import java.util.List;

public record EmployeeListViewModel(
		BaseViewModel viewModel,
		List<EmployeeViewModel> employeeViewModels,
		Integer page,
		Integer totalPages
) {
}

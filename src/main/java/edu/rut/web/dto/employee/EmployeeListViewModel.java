package edu.rut.web.dto.employee;

import java.util.List;

public record EmployeeListViewModel(
		List<EmployeeViewModel> employeeViewModels
) {
}

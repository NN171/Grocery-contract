package edu.rut.web.dto.store;

import edu.rut.web.dto.employee.EmployeeListViewModel;

public record StoreViewModel(
		Long id,
		String address,
		Integer employeesNum,
		Double soldAmount,
		EmployeeListViewModel employeeListViewModel
) {
}

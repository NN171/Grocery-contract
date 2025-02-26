package edu.rut.web.dto.employee;

import edu.rut.web.dto.order.OrderListViewModel;

public record EmployeeViewModel(
		Long id,
		String firstName,
		String lastName,
		String phone,
		String storeAddress,
		OrderListViewModel orderViewModels
) {
}

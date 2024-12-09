package edu.rut.web.dto.employee;

import edu.rut.web.dto.base.BaseViewModel;
import edu.rut.web.dto.order.OrderListViewModel;

public record EmployeeViewModel(
		Long id,
		String firstName,
		String lastName,
		String phoneNumber,
		String storeAddress,
		OrderListViewModel orderViewModels
) {
}

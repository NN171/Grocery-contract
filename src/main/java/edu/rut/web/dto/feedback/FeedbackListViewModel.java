package edu.rut.web.dto.feedback;

import edu.rut.web.dto.base.BaseViewModel;
import edu.rut.web.dto.employee.EmployeeViewModel;

import java.util.List;

public record FeedbackListViewModel(
		BaseViewModel viewModel,
		List<FeedbackViewModel> FeedbackViewModels,
		Integer pages
) {
}

package edu.rut.web.controllers;

import edu.rut.web.dto.employee.EmployeeSearchForm;
import edu.rut.web.dto.employee.EmployeeViewModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employees")
public interface EmployeeController extends BaseController {

	@GetMapping("/")
	String getEmployees(@ModelAttribute("form") EmployeeSearchForm form,
						Model model);

	@GetMapping("/{id}")
	String getEmployee
			(@PathVariable Long id,
			 Model model);

	@GetMapping("/create")
	String createForm(Model model);

	@PostMapping("/create")
	String saveEmployee
			(@Valid @ModelAttribute("form") EmployeeViewModel viewModel,
			 Model model);

	@DeleteMapping("/delete/{id}")
	String deleteEmployee
			(@PathVariable Long id);

	@PutMapping("/update/{id}")
	String updateEmployee
			(@PathVariable Long id,
			 @Valid @ModelAttribute("form") EmployeeViewModel viewModel,
			 Model model);
}

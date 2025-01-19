package edu.rut.web.controllers;

import edu.rut.web.dto.employee.CreateEmployeeForm;
import edu.rut.web.dto.employee.EditEmployeeForm;
import edu.rut.web.dto.employee.EmployeeSearchForm;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employees")
public interface EmployeeController extends BaseController {

	/**
	 * Получение страницы сотрудников
	 */
	@GetMapping("/")
	String getEmployees(@ModelAttribute("form") EmployeeSearchForm form,
						Model model);

	/**
	 * Форма создания сотрудника
	 */
	@GetMapping("/create")
	String createForm(Model model);

	/**
	 * Создание сотрудника
	 */
	@PostMapping("/create")
	String saveEmployee
			(@Valid @ModelAttribute("form") CreateEmployeeForm form,
			 BindingResult bindingResult,
			 Model model);

	/**
	 * Удаление сотрудника
	 */
	@DeleteMapping("/delete/{id}")
	String deleteEmployee
			(@PathVariable Long id);

	/**
	 * Изменение сотрудника
	 */
	@PutMapping("/update/{id}")
	String updateEmployee
			(@PathVariable Long id,
			 @Valid @ModelAttribute("form") EditEmployeeForm form,
			 BindingResult bindingResult,
			 Model model);

	/**
	 * Форма для изменения сотрудника
	 */
	@GetMapping("/update/{id}")
	String updateForm(@PathVariable Long id,
					  Model model);
}

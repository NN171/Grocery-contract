package edu.rut.web.controllers;

import edu.rut.web.dto.customer.CustomerViewModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "api/v1/customers")
public interface CustomerController extends BaseController {

	@GetMapping("/")
	String getCustomers(@ModelAttribute("form") CustomerViewModel viewModel,
						Model model);

	@GetMapping("/{id}")
	String getCustomer(@PathVariable Long id,
					   Model model);

	@GetMapping("/create")
	String createForm(Model model);

	@PostMapping("/create")
	String saveCustomer(@Valid @ModelAttribute("form") CustomerViewModel viewModel,
						Model model);

	@DeleteMapping("/delete/{id}")
	String deleteCustomer(@PathVariable Long id);

	@PutMapping("/update/{id}")
	String updateCustomer(@PathVariable Long id,
						  @Valid @ModelAttribute("form") CustomerViewModel viewModel,
						  Model model);
}

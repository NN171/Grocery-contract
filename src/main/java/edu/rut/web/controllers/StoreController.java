package edu.rut.web.controllers;

import edu.rut.web.dto.store.StoreSearchForm;
import edu.rut.web.dto.store.StoreViewModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/stores")
public interface StoreController extends BaseController {

	@GetMapping("/")
	String getStores(@ModelAttribute("form") StoreSearchForm form,
					 Model model);

	@GetMapping("/{id}")
	String getStore(@PathVariable Long id,
					Model model);

	@GetMapping("/create")
	String createForm(Model model);

	@PostMapping("/create")
	String saveStore(@Valid @ModelAttribute("form") StoreViewModel viewModel,
					 Model model);

	@DeleteMapping("/delete/{id}")
	String deleteStore(@PathVariable Long id);

	@PutMapping("/update/{id}")
	String updateStore(@PathVariable Long id,
					   @Valid @ModelAttribute("form") StoreViewModel viewModel,
					   Model model);
}

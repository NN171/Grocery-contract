package edu.rut.web.controllers;

import edu.rut.web.dto.store.CreateStoreForm;
import edu.rut.web.dto.store.EditStoreForm;
import edu.rut.web.dto.store.StoreSearchForm;
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

@RequestMapping("/stores")
public interface StoreController extends BaseController {

	@GetMapping("/")
	String getStores(@ModelAttribute("form") StoreSearchForm form,
					 Model model);

	@GetMapping("/create")
	String createForm(Model model);

	@PostMapping("/create")
	String saveStore(@Valid @ModelAttribute("form") CreateStoreForm form,
					 BindingResult bindingResult,
					 Model model);

	@DeleteMapping("/delete/{id}")
	String deleteStore(@PathVariable Long id);

	@PutMapping("/update/{id}")
	String updateStore(@PathVariable Long id,
					   @Valid @ModelAttribute("form") EditStoreForm form,
					   BindingResult bindingResult,
					   Model model);

	@GetMapping("/update/{id}")
	String updateForm(@PathVariable Long id,
					  Model model);
}

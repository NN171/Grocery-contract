package edu.rut.web.controllers;

import edu.rut.web.dto.product.CreateProductForm;
import edu.rut.web.dto.product.EditProductForm;
import edu.rut.web.dto.product.ProductSearchForm;
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

@RequestMapping("/products")
public interface ProductController extends BaseController {

	@GetMapping("/")
	String getProducts(@ModelAttribute("form") ProductSearchForm form,
					   Model model);

	@GetMapping("/create")
	String createForm(Model model);

	@PostMapping("/create")
	String saveProduct(@Valid @ModelAttribute("form") CreateProductForm form,
					   BindingResult bindingResult,
					   Model model);

	@DeleteMapping("/delete/{id}")
	String deleteProduct(@PathVariable Long id);

	@PutMapping("/update/{id}")
	String updateProduct(@PathVariable Long id,
						 @Valid @ModelAttribute("form") EditProductForm form,
						 BindingResult bindingResult,
						 Model model);

	@GetMapping("/update/{id}")
	String updateForm(@PathVariable Long id,
					  Model model);
}

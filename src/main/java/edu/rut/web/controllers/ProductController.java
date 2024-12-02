package edu.rut.web.controllers;

import edu.rut.web.dto.product.ProductViewModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/v1/products")
public interface ProductController extends BaseController {

	@GetMapping("/")
	String getProducts(@Valid @ModelAttribute("form") ProductViewModel viewModel,
					   Model model);

	@GetMapping("/{id}")
	String getProduct(@PathVariable Long id,
					  Model model);

	@GetMapping("/create")
	String createForm(Model model);

	@PostMapping("/create")
	String saveProduct(@Valid @ModelAttribute("form") ProductViewModel viewModel,
					   Model model);

	@DeleteMapping("/delete/{id}")
	String deleteProduct(@PathVariable Long id);

	@PutMapping("/update/{id}")
	String updateProduct(@PathVariable Long id,
						 @Valid @ModelAttribute("form") ProductViewModel viewModel,
						 Model model);
}

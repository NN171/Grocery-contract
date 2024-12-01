package edu.rut.web.controllers.model;

import edu.rut.web.controllers.BaseController;
import edu.rut.web.dto.product.ProductViewModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/products")
public interface ProductController extends BaseController {

    @GetMapping("/")
    String getProducts(@ModelAttribute ProductViewModel viewModel,
                     Model model);

    @GetMapping("/{id}")
    String getProduct(@PathVariable Long id,
                    Model model);

    @GetMapping("/create")
    String createForm(Model model);

    @PostMapping("/create")
    String saveProduct(@ModelAttribute ProductViewModel viewModel,
                     Model model);

    @DeleteMapping("/delete/{id}")
    String deleteProduct(@PathVariable Long id);

    @PutMapping("/update/{id}")
    String updateProduct(@PathVariable Long id,
                       @ModelAttribute ProductViewModel viewModel,
                       Model model);
}

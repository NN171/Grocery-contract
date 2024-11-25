package edu.rut.web.controllers.model;

import edu.rut.web.controllers.BaseController;
import edu.rut.web.dto.CustomerViewModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "api/v1/customers")
public interface CustomerController extends BaseController {

    @GetMapping("/")
    String getCustomers(@ModelAttribute CustomerViewModel viewModel,
                     Model model);

    @GetMapping("/{id}")
    String getCustomer(@PathVariable Long id,
                    Model model);

    @GetMapping("/create")
    String createForm(Model model);

    @PostMapping("/create")
    String saveCustomer(@ModelAttribute CustomerViewModel viewModel,
                     Model model);

    @DeleteMapping("/delete/{id}")
    String deleteCustomer(@PathVariable Long id);

    @PutMapping("/update/{id}")
    String updateCustomer(@PathVariable Long id,
                       @ModelAttribute CustomerViewModel viewModel,
                       Model model);
}

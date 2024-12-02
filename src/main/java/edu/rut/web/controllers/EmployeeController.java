package edu.rut.web.controllers;

import edu.rut.web.dto.employee.EmployeeViewModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/employees")
public interface EmployeeController extends BaseController {

    @GetMapping("/")
    String getEmployees(@ModelAttribute EmployeeViewModel viewModel,
                     Model model);

    @GetMapping("/{id}")
    String getEmployee
            (@PathVariable Long id,
                    Model model);

    @GetMapping("/create")
    String createForm(Model model);

    @PostMapping("/create")
    String saveEmployee
            (@ModelAttribute EmployeeViewModel viewModel,
                     Model model);

    @DeleteMapping("/delete/{id}")
    String deleteEmployee
            (@PathVariable Long id);

    @PutMapping("/update/{id}")
    String updateEmployee
            (@PathVariable Long id,
                       @ModelAttribute EmployeeViewModel viewModel,
                       Model model);
}

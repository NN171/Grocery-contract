package edu.rut.web.controllers.model;

import edu.rut.web.controllers.BaseController;
import edu.rut.web.dto.CustomerViewModel;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "api/v1/customers")
public interface CustomerController extends BaseController {

    @GetMapping("/")
    CustomerViewModel getCustomers();

    @GetMapping("/customer/")
    CustomerViewModel getCustomer(Long id);

    @PostMapping("/")
    CustomerViewModel saveCustomer();

    @DeleteMapping("/")
    CustomerViewModel deleteCustomer();

    @PutMapping("/")
    CustomerViewModel updateCustomer();
}

package edu.rut.web.controllers.model;

import edu.rut.web.controllers.BaseController;
import edu.rut.web.dto.EmployeeViewModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/employees")
public interface EmployeeController extends BaseController {

    @GetMapping("/")
    EmployeeViewModel getEmployees();

    @GetMapping("/employee/")
    EmployeeViewModel getEmployee(Long id);

    @PostMapping("/")
    EmployeeViewModel saveEmployee();

    @DeleteMapping("/")
    EmployeeViewModel deleteEmployee(Long id);

    @PutMapping("/")
    EmployeeViewModel updateEmployee();
}

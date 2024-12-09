package edu.rut.web.controllers;

import edu.rut.web.dto.order.CreateOrderForm;
import edu.rut.web.dto.order.EditOrderForm;
import edu.rut.web.dto.order.OrderSearchForm;
import edu.rut.web.dto.order.OrderViewModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/orders")
public interface OrderController extends BaseController {

    @GetMapping("/")
    String getOrders(@ModelAttribute("form") OrderSearchForm form,
                     Model model);

    @GetMapping("/{id}")
    String getOrder(@PathVariable Long id,
                    Model model);

    @GetMapping("/create")
    String createForm(Model model);

    @PostMapping("/create")
    String saveOrder(@Valid @ModelAttribute("form") CreateOrderForm form,
                     BindingResult bindingResult,
                     Model model);

    @PutMapping("/update/{id}")
    String updateOrder(@PathVariable Long id,
                       @Valid @ModelAttribute("form") EditOrderForm form,
                       BindingResult bindingResult,
                       Model model);

    @GetMapping("/update/{id}")
    String updateForm(@PathVariable Long id,
                      Model model);
}

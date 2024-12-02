package edu.rut.web.controllers;

import edu.rut.web.dto.order.OrderViewModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/orders")
public interface OrderController extends BaseController {

    @GetMapping("/")
    String getOrders(@Valid @ModelAttribute("form") OrderViewModel viewModel,
                     Model model);

    @GetMapping("/{id}")
    String getOrder(@PathVariable Long id,
                    Model model);

    @GetMapping("/create")
    String createForm(Model model);

    @PostMapping("/create")
    String saveOrder(@Valid @ModelAttribute("form") OrderViewModel viewModel,
                     Model model);

    @PutMapping("/update/{id}")
    String updateOrder(@PathVariable Long id,
                       @Valid @ModelAttribute("form") OrderViewModel viewModel,
                       Model model);
}

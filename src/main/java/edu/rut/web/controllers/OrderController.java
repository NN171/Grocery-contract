package edu.rut.web.controllers;

import edu.rut.web.dto.order.OrderViewModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/orders")
public interface OrderController extends BaseController {

    @GetMapping("/")
    String getOrders(@ModelAttribute OrderViewModel viewModel,
                     Model model);

    @GetMapping("/{id}")
    String getOrder(@PathVariable Long id,
                    Model model);

    @GetMapping("/create")
    String createForm(Model model);

    @PostMapping("/create")
    String saveOrder(@ModelAttribute OrderViewModel viewModel,
                     Model model);

    @PutMapping("/update/{id}")
    String updateOrder(@PathVariable Long id,
                       @ModelAttribute OrderViewModel viewModel,
                       Model model);
}

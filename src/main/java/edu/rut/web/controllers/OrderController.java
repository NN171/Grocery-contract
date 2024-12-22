package edu.rut.web.controllers;

import edu.rut.web.dto.order.CreateOrderForm;
import edu.rut.web.dto.order.OrderSearchForm;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/orders")
public interface OrderController extends BaseController {

	@GetMapping("/")
	String getOrders(@ModelAttribute("form") OrderSearchForm form,
					 Model model);

	@GetMapping("/add")
	String addProduct(@RequestParam Long productId,
					  @RequestParam int quantity,
					  Model model,
					  @AuthenticationPrincipal UserDetails userDetails);

	@GetMapping("/order")
	String getOrder(Model model,
					@AuthenticationPrincipal UserDetails userDetails);

	@GetMapping("/create")
	String createForm(Model model);

	@PostMapping("/create")
	String saveOrder(@Valid @ModelAttribute("form") CreateOrderForm form,
					 BindingResult bindingResult,
					 Model model);

}

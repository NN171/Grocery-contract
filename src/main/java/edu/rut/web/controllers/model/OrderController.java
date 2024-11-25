package edu.rut.web.controllers.model;

import edu.rut.web.controllers.BaseController;
import edu.rut.web.dto.OrderViewModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("api/v1/orders")
public interface OrderController extends BaseController {

    @GetMapping("/")
    OrderViewModel getOrders();

    @GetMapping("/order/")
    OrderViewModel getOrder(Long id);

    @PostMapping("/")
    OrderViewModel saveOrder();

    @PutMapping("/")
    OrderViewModel updateOrder();
}

package edu.rut.web.controllers.model;

import edu.rut.web.controllers.BaseController;
import edu.rut.web.dto.ProductViewModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/products")
public interface ProductController extends BaseController {

    @GetMapping("/")
    ProductViewModel getProducts();

    @GetMapping("/product/")
    ProductViewModel getProduct(Long id);

    @PostMapping("/")
    ProductViewModel saveProduct();

    @DeleteMapping("/")
    ProductViewModel deleteProduct(Long id);

    @PutMapping("/")
    ProductViewModel updateProduct();
}

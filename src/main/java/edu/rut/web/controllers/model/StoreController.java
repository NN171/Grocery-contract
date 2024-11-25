package edu.rut.web.controllers.model;

import edu.rut.web.controllers.BaseController;
import edu.rut.web.dto.StoreViewModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/stores")
public interface StoreController extends BaseController {

    @GetMapping("/")
    StoreViewModel getStores();

    @GetMapping("/store/")
    StoreViewModel getStore(Long id);

    @PostMapping("/")
    StoreViewModel saveStore();

    @DeleteMapping("/")
    StoreViewModel deleteStore(Long id);

    @PutMapping("/")
    StoreViewModel updateStore();
}

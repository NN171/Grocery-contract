package edu.rut.web.controllers;

import edu.rut.web.dto.store.StoreViewModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/stores")
public interface StoreController extends BaseController {

    @GetMapping("/")
    String getStores(@ModelAttribute StoreViewModel viewModel,
                     Model model);

    @GetMapping("/{id}")
    String getStore(@PathVariable Long id,
                    Model model);

    @GetMapping("/create")
    String createForm(Model model);

    @PostMapping("/create")
    String saveStore(@ModelAttribute StoreViewModel viewModel,
                     Model model);

    @DeleteMapping("/delete/{id}")
    String deleteStore(@PathVariable Long id);

    @PutMapping("/update/{id}")
    String updateStore(@PathVariable Long id,
                       @ModelAttribute StoreViewModel viewModel,
                       Model model);
}

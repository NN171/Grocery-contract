package edu.rut.web.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/customs")
public interface CustomController {

	@GetMapping("/highrates")
	String getHighRated(Model model);

	@GetMapping("/frequents")
	String getFrequents(Model model,
						@AuthenticationPrincipal UserDetails userDetails);
}

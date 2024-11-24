package edu.rut.web.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Контроллер домашней страницы
 */
@RequestMapping(path = "/")
public interface HomeController extends BaseController {

	/**
	 * Отображение домашней страницы
	 */
	@GetMapping()
	String index(Model model);
}

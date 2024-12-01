package edu.rut.web.controllers;

import edu.rut.web.dto.base.BaseViewModel;

/**
 * Базовый контроллер
 */
public interface BaseController {

	/**
	 * Базовая модель представления
	 */
	BaseViewModel createBaseViewModel(String title);
}

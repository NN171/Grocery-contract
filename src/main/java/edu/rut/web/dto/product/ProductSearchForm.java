package edu.rut.web.dto.product;

import jakarta.validation.constraints.Min;

public record ProductSearchForm(
		@Min(value = 0, message = "Страница должна быть больше 0")
		Integer page,
		@Min(value = 1, message = "Размер страницы должен быть больше 0")
		Integer size
) {
}

package edu.rut.web.dto.store;

import jakarta.validation.constraints.NotBlank;

public record EditStoreForm(
		@NotBlank(message = "Идентификатор обязателен") Long id,
		@NotBlank(message = "Адрес обязателен") String address
) {
}

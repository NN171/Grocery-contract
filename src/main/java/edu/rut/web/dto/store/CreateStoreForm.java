package edu.rut.web.dto.store;

import jakarta.validation.constraints.NotBlank;

public record CreateStoreForm(
		@NotBlank(message = "Адрес обязателен") String address
) {
}

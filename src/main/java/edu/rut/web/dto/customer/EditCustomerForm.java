package edu.rut.web.dto.customer;

import jakarta.validation.constraints.NotBlank;

public record EditCustomerForm(
		@NotBlank(message = "Идентификатор обязателен") Long id,
		@NotBlank(message = "Имя обязательно") String firstName,
		@NotBlank(message = "Фамилия обязательна") String lastName,
		@NotBlank(message = "Номер телефона обязателен") String phone
) {
}

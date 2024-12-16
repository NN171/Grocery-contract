package edu.rut.web.dto.employee;

import jakarta.validation.constraints.NotBlank;

public record CreateEmployeeForm(
		@NotBlank(message = "Имя обязательно") String firstName,
		@NotBlank(message = "Фамилия обязательна") String lastName,
		@NotBlank(message = "Номер телефона обязателен") String phone,
		@NotBlank(message = "Адрес обязателен") String storeAddress
) {
}

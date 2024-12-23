package edu.rut.web.dto.custom;

import java.time.LocalDate;

public record ProductFrequentViewModel(
		String name,
		double price,
		LocalDate prodDate,
		LocalDate expiryDate,
		double avgRating
) {
}

package edu.rut.web.dto.custom;

public record ProductRateViewModel(
		String name,
		double price,
		double avgRating
) {
}

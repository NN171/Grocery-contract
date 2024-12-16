package edu.rut.web.dto.custom;

public record ProductFrequentViewModel(
		String name,
		double price,
		String prodDate,
		String expiryDate,
		double avgRating
) {
}

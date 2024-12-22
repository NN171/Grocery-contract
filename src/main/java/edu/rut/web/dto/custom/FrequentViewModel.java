package edu.rut.web.dto.custom;

import edu.rut.web.dto.base.BaseViewModel;

import java.util.List;

public record FrequentViewModel(
		BaseViewModel baseViewModel,
		List<ProductFrequentViewModel> productViewModels
) {
}

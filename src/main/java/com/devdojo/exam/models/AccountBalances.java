package com.devdojo.exam.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountBalances {
	private Double totalBalance;
	
	public Double totalBalances() {
		return 1.00;
	}
}

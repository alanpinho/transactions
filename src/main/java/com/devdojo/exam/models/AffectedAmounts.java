package com.devdojo.exam.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AffectedAmounts {
	private double defaultValue = 0;
	private long fundsAmount;
	private long interestAmount;
	private long feesAmount;
	private long overdraftAmount;
	private long overdraftFeesAmount;
	private long overdraftInterestAmount;
	private long technicalOverdraftAmount;
	private long technicalOverdraftInterestAmount;
	private long fractionAmount;
	
	public AffectedAmounts(long fundsAmount, long interestAmount, long feesAmount,
			long overdraftAmount, long overdraftFeesAmount, 
			long overdraftInterestAmount, long technicalOverdraftAmount,
			long technicalOverdraftInterestAmount, long fractionAmount) {
		
		this.fundsAmount = fundsAmount;
		this.interestAmount = interestAmount;
		this.feesAmount = feesAmount;
		this.overdraftAmount = overdraftAmount;
		this.overdraftFeesAmount = overdraftFeesAmount;
		this.technicalOverdraftAmount = technicalOverdraftAmount;
		this.technicalOverdraftInterestAmount = technicalOverdraftInterestAmount;
		this.fractionAmount = fractionAmount;
	}
}

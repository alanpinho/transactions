package com.devdojo.exam.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Terms {
	private InterestSettings interestSettings;
	private OverdraftInterestSettings overdraftInterestSettings;
	private OverdraftSettings overdraftSettings;
	
}

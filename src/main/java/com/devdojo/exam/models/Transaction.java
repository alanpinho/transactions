package com.devdojo.exam.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.devdojo.exam.models.enums.CurrencyCode;
import com.devdojo.exam.models.enums.TypeTransaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
	private String encodedKey; //id
	private Long id;
	private Date creationDate; //bookingDate
	private Date valueDate;
	private String parentAccountKey; //arrangementId
	private TypeTransaction type;
	private Long amount;
	private CurrencyCode currencyCode;
	
	private AffectedAmounts affectedAmounts;	
	private List<Taxes> taxes;	
	private AccountBalances accountBalances;
	
	private String userKey;
	private String branchKey;
	

	private Terms terms;
	
	private TransactionDetails transactionDetails;	
	private TransferDetails transferDetails;
	
	private List<Fees> fees = new ArrayList<>();
	

	
	
	
	
}

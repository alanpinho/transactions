package com.devdojo.exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devdojo.exam.models.Transaction;

@RestController
public class TransactionController {
	@GetMapping
	public Transaction transaction() {
		return new Transaction();
	}
}

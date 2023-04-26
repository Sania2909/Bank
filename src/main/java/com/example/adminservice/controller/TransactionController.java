package com.example.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.model.Transaction;
import com.example.adminservice.service.TransactionService;

@RestController
@RequestMapping("/admin")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@GetMapping("/allTransaction")
	public List<Transaction> showAllTransaction(){
		return transactionService.showAllTransaction();
	}

}

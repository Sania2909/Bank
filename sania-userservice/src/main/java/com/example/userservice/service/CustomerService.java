package com.example.userservice.service;

import java.util.List;

import com.example.userservice.model.Customer;
import com.example.userservice.model.LoanDto;
import com.example.userservice.model.TransactionDto;

public interface CustomerService {
	public Customer addCustomer(Customer customer);
	
	public LoanDto applyLoan(LoanDto loan);
	
	public List<TransactionDto> showAllTransaction();

}

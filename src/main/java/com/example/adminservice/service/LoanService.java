package com.example.adminservice.service;

import java.util.List;

import com.example.adminservice.model.Loan;

public interface LoanService {
	public List<Loan> allLoanCustomers();
	public Loan applyLoan(Loan loan);

}

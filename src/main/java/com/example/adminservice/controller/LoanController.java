package com.example.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.model.Branch;
import com.example.adminservice.model.Loan;
import com.example.adminservice.service.BranchService;
import com.example.adminservice.service.LoanService;

@RestController
@RequestMapping("/admin")
public class LoanController {
	
	@Autowired 
	LoanService loanService;
	
	@GetMapping("/allLoan")
    public List<Loan> allLoanCustomers(){
		return loanService.allLoanCustomers();
	}
	
	@PostMapping("/applyloan")
	public Loan applyLoan(Loan loan) {
		return loanService.applyLoan(loan);
	}

}

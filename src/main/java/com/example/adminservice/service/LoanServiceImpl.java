package com.example.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.adminservice.dao.LoanDao;
import com.example.adminservice.model.Loan;

public class LoanServiceImpl implements LoanService {

	@Autowired
	LoanDao loanDao;
	
	@Override
	public List<Loan> allLoanCustomers() {
		// TODO Auto-generated method stub
		return loanDao.findAll();
	}

	@Override
	public Loan applyLoan(Loan loan) {
		// TODO Auto-generated method stub
		return  (Loan) loanDao.save(loan);
	}

}

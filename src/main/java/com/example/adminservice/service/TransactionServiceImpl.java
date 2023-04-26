package com.example.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.adminservice.dao.TransactionDao;
import com.example.adminservice.model.Loan;
import com.example.adminservice.model.Transaction;

public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao transactionDao;

	@Override
	public List<Transaction> showAllTransaction() {
		// TODO Auto-generated method stub
		return transactionDao.findAll();
	}
	
	
}

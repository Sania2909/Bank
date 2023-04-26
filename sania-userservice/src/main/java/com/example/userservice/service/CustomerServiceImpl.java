package com.example.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.userservice.AdminProxy;
import com.example.userservice.dao.CustomerDao;
import com.example.userservice.model.Customer;
import com.example.userservice.model.LoanDto;
import com.example.userservice.model.TransactionDto;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	AdminProxy aproxy;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}

	@Override
	public LoanDto applyLoan(LoanDto loan) {
		// TODO Auto-generated method stub
		return aproxy.applyLoan(loan);
	}

	@Override
	public List<TransactionDto> showAllTransaction() {
		// TODO Auto-generated method stub
		return aproxy.showAllTransaction();
	}

}

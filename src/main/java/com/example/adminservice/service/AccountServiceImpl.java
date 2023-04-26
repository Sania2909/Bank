package com.example.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.adminservice.dao.AccountDao;
import com.example.adminservice.model.Account;

public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDao accountDao;
	
	@Override
	public Account openAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.save(account);
	}

	@Override
	public void deleteAccount(String account_number) {
		// TODO Auto-generated method stub
		accountDao.deleteById(account_number);
		
	}

	@Override
	public List<Account> showAllAccount() {
		// TODO Auto-generated method stub
		return accountDao.findAll();
	}

}

package com.example.adminservice.service;

import java.util.List;

import com.example.adminservice.model.Account;

public interface AccountService {
	public Account openAccount(Account account);
	public void deleteAccount(String account_number);
	public List<Account> showAllAccount();

}

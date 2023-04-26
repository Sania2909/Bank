package com.example.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.model.Account;
import com.example.adminservice.service.AccountService;


@RestController
@RequestMapping("/admin")

public class AccountController {

	@Autowired 
	AccountService accountService;
	
	@GetMapping("/allAccount")
    public List<Account> showAllAccount(){
		return accountService.showAllAccount();
	}
	
	@PostMapping("/addAccount")
	public Account openAccount(@RequestBody Account account) {
		return accountService.openAccount(account);
	}
	
	@DeleteMapping("/deleteAccount/{account_number}")
	public String deleteAccount(@PathVariable("account_number") String account_number) {
		accountService.deleteAccount(account_number);
		return "Account deleted";
		
	}
	
}

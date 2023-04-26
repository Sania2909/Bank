package com.example.userservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.userservice.model.LoanDto;
import com.example.userservice.model.TransactionDto;

@FeignClient("ADMIN-SERVICE")
public interface AdminProxy {

	@PostMapping("/applyloan")
	LoanDto applyLoan(LoanDto loan);

	@GetMapping("/alltransactions")
	List<TransactionDto> showAllTransaction();
	
	
	
	

}

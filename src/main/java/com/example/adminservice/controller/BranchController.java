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
import com.example.adminservice.model.Branch;
import com.example.adminservice.service.BranchService;

@RestController
@RequestMapping("/admin")
public class BranchController {
	
	@Autowired 
	BranchService branchService;
	
	@GetMapping("/allBranch")
    public List<Branch> showAllBranch(){
		return branchService.showAllBranch();
	}
	
	@PostMapping("/addBranch")
	public Branch insertBranch(@RequestBody Branch branch) {
		return branchService.insertBranch(branch);
	}
	
	@DeleteMapping("/deleteBranch/{branch_id}")
	public String deleteBranch(@PathVariable("branch_id") String branch_id) {
		branchService.deleteBranch(branch_id);
		return "Branch deleted";
		
	}

}

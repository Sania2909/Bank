package com.example.adminservice.service;

import java.util.List;

import com.example.adminservice.model.Branch;

public interface BranchService {
	public Branch insertBranch(Branch branch);
	public void deleteBranch(String branch_id);
	public List<Branch> showAllBranch();

}

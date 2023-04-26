package com.example.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.adminservice.dao.BranchDao;
import com.example.adminservice.model.Branch;

public class BranchServiceImpl implements BranchService {

	@Autowired
	BranchDao branchDao;
	
	@Override
	public Branch insertBranch(Branch branch) {
		// TODO Auto-generated method stub
		return branchDao.save(branch);
	}

	@Override
	public void deleteBranch(String branch_id) {
		// TODO Auto-generated method stub
		branchDao.deleteById(branch_id);

	}

	@Override
	public List<Branch> showAllBranch() {
		// TODO Auto-generated method stub
		return branchDao.findAll();
	}

}

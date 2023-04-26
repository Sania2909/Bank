package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adminservice.model.Branch;

public interface BranchDao extends JpaRepository<Branch,String>  {

}

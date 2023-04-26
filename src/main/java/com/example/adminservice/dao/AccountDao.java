package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adminservice.model.Account;

public interface AccountDao extends JpaRepository<Account,String> {

}

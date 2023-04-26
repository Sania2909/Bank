package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adminservice.model.Transaction;

public interface TransactionDao extends JpaRepository<Transaction,String> {

}

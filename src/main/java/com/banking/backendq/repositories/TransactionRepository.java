package com.banking.backendq.repositories;

import com.banking.backendq.model.Account;
import com.banking.backendq.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccount(Account account);
}

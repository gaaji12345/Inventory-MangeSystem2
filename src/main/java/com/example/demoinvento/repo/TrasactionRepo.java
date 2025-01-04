package com.example.demoinvento.repo;/*  gaajiCode
    99
    03/01/2025
    */


import com.example.demoinvento.enitity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TrasactionRepo extends JpaRepository<Transaction, Long>, JpaSpecificationExecutor<Transaction> {
}

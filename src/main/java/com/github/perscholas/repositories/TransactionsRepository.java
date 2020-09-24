package com.github.perscholas.repositories;

import com.github.perscholas.models.Transactions;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface TransactionsRepository extends CrudRepository<Transactions, Long> {

    @Query("FROM Transactions WHERE account_account_number = ?1")
    List<Transactions> findByAccountNumber(Long accountNumber);
}
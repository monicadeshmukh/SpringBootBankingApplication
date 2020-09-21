package com.github.perscholas.repositories;

import com.github.perscholas.models.Transactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface TransactionsRepository extends CrudRepository<Transactions, Long> {
}
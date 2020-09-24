package com.github.perscholas.repositories;

import com.github.perscholas.models.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Query("FROM Customer WHERE userName = ?1 AND password = ?2")
    List<Customer> findByUserNameAndPassword(String userName, String password);

    @Query("From Customer WHERE account_account_number = ?1")
    List<Customer> findByAccountNumber(Long accountNumber);

    @Query("From Customer WHERE account_account_number != ?1")
    List<Customer> findByNotAccountNumber(Long accountNumber);
}



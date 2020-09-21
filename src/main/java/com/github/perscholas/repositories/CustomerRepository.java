package com.github.perscholas.repositories;

import com.github.perscholas.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByUserNameAndPassword(String userName, String password);
}


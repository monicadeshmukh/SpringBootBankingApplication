package com.github.perscholas.repositories;

import com.github.perscholas.models.Accounts;
import com.github.perscholas.models.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {

}

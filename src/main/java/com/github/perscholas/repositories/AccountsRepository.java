package com.github.perscholas.repositories;

import com.github.perscholas.models.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {
}

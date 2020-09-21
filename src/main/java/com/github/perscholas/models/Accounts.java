package com.github.perscholas.models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.github.perscholas.models.Accounts;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "Accounts")
public class Accounts implements Serializable {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountNumber;

    @OneToOne()
   // @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    @Column(name = "balance", nullable = false)
    private Double balance;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    //@ElementCollection
    private Set<Transactions> transactions = null;

    //private List<Accounts> payees;

    //getters and setters

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transactions> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(Transactions transaction){
        this.transactions.add(transaction);
    }

    public void removeTransaction(Transactions transaction){
        this.transactions.remove(transaction);
    }
}

package com.github.perscholas.models;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Transactions")
public class Transactions implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;


    @ManyToOne()
    @JoinColumn(name = "accountNumber", nullable = false)
    private Accounts account;

    @Column(name= "transactionDate", nullable = false)
    @CreatedDate
    private Date transactionDate;

    @Column(name = "deposit")
    private Double deposit;

    @Column(name = "withdrawal")
    private Double withdrawal;

    @Column(name = "description")
    private String description;

    @JoinColumn(name = "accountNumber", nullable = false)
    private Accounts customerAccount;

    //getters and setters

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(Double withdrawal) {
        this.withdrawal = withdrawal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Accounts getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(Accounts customerAccount) {
        this.customerAccount = customerAccount;
    }
}

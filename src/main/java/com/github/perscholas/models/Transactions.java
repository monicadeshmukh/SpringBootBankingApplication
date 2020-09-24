package com.github.perscholas.models;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
//import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Transactions")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;


    @ManyToOne
    //@JoinColumn(name = "accountNumber", nullable = false)
    private Accounts account;

    @Column(name= "transactionDate", nullable = false)
    private LocalDateTime transactionDate;

    @Column(name = "deposit")
    private Double deposit;

    @Column(name = "withdrawal")
    private Double withdrawal;

    @Column(name = "description")
    private String description;

    //@JoinColumn(name = "accountNumber",  nullable = false)
    @Column(name="payeeAccount")
    private Long payeeAccount;


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

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
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

    public Long getPayeeAccount() {
        return payeeAccount;
    }

    public void setPayeeAccount(Long payeeAccount) {
        this.payeeAccount = payeeAccount;
    }

}

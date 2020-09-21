package com.github.perscholas.models;

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
    private Date transactionDate;

    @Column(name = "deposit")
    private Double deposit;

    @Column(name = "withdrawal")
    private Double withdrawal;

    @Column(name = "description")
    private String description;
}

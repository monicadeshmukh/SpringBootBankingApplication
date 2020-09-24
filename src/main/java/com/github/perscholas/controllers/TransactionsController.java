//package com.github.perscholas;
package com.github.perscholas.controllers;


import com.github.perscholas.exception.ApplicationException;
import com.github.perscholas.models.Accounts;
import com.github.perscholas.models.Customer;
import com.github.perscholas.models.Transactions;
import com.github.perscholas.repositories.AccountsRepository;
import com.github.perscholas.repositories.CustomerRepository;
import com.github.perscholas.repositories.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class TransactionsController {
    private CustomerRepository customerRepository;
    private AccountsRepository accountsRepository;
    private TransactionsRepository transactionsRepository;

    @Autowired
    public TransactionsController(CustomerRepository customerRepository,
                                  AccountsRepository accountsRepository,
                                  TransactionsRepository transactionsRepository) {
        this.customerRepository = customerRepository;
        this.accountsRepository = accountsRepository;
        this.transactionsRepository = transactionsRepository;
    }

    @RequestMapping(value = "transactions/")
    public  String showTransactions(ModelMap model,
                                    @RequestParam(value = "accountNumber") Long accountNumber,
                                    @RequestParam (value = "balance") Double balance){
        try{
            List<Transactions> transactions = new ArrayList<Transactions>();
            transactionsRepository.findByAccountNumber(accountNumber).forEach(t -> transactions.add(t));
            if (!transactions.isEmpty()){
                System.out.println("transactions11: " +transactions.get(0).getTransactionDate());
                model.addAttribute("transactions",transactions);
                return "transactions";
            }
            else
                return "error(exception, 'No transactions found for this account.')";
        } catch (Exception e) {
            System.out.println("in catch block. ");
            throw new ApplicationException("Error getting transactions for this account. We are sorry for the inconvenience.\n" +
                    "Following exception occured.\n" + e);
        }
    }
  /* public  String showTransactions(Model model,
                                    @RequestParam(value = "accountNumber") Long accountNumber,
                                    @RequestParam (value = "balance") Double balance){
      try{
            List<Transactions> transactions = transactionsRepository.findByAccountNumber(accountNumber);
           if (!transactions.isEmpty()){
                System.out.println("transactions11: " +transactions.get(0).getTransactionDate());
               for (Transactions transaction: transactions) {
                   transaction.setTransactionDate((LocalDateTime) transaction.getTransactionDate());
               }
               System.out.println("transactions22: " +transactions.get(0).getTransactionDate());
                model.addAttribute("transactions",transactions);
                return "transactions";
            }
            else
                return "error(exception, 'No transactions found for this account.')";
        } catch (Exception e) {
          System.out.println("in catch block. ");
          throw new ApplicationException("Error getting transactions for this account. We are sorry for the inconvenience.\n" +
                  "Following exception occured.\n" + e);
      }
    }*/


}
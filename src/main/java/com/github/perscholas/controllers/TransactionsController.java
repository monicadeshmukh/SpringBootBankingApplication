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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
   public  String showTransactions(Model model,
                                    @RequestParam(value = "accountNumber") Long accountNumber,
                                    @RequestParam (value = "balance") Double balance){
       try{
            System.out.println("accountNumber: " + accountNumber);
            List<Transactions> transactions = transactionsRepository.findByAccount_number(accountNumber);
           System.out.println("transactionId: " + transactions.get(0).getTransactionId());
            //List<Customer> customer = customerRepository.findByAccountNumber(accountNumber);
            if (!transactions.isEmpty()){
                model.addAttribute("transaction",transactions);
                return "transactions";
            }
            else
                return "error(exception, 'No transactions found for this account.')";
        } catch (Exception e) {
              throw new ApplicationException("Error getting transactions for this account. We are sorry for the inconveniece.");
          }
    }
}
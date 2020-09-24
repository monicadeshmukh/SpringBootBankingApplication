package com.github.perscholas.controllers;


import com.github.perscholas.exception.ApplicationException;
import com.github.perscholas.models.Accounts;
import com.github.perscholas.models.Customer;
import com.github.perscholas.repositories.AccountsRepository;
import com.github.perscholas.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class AccountController {
    private CustomerRepository customerRepository;
    private AccountsRepository accountsRepository;

    @Autowired
    public AccountController(CustomerRepository customerRepository, AccountsRepository accountsRepository) {
        this.customerRepository = customerRepository;
        this.accountsRepository = accountsRepository;
    }

    @GetMapping("account/")
    String getView(Model model) {
        //TODO
        //populate account id and account balance fields and return view.

        return "account";   //the return statement string should match the name of the .jsp file
    }

    @PostMapping("billpay/")
    String show(ModelMap model, @RequestParam(value = "accountNumber") Long accountNumber, @RequestParam (value = "balance") String balance) {
        model.addAttribute("accountNumber", accountNumber);
        model.addAttribute("balance", balance);
        List<Customer> customer = customerRepository.findByNotAccountNumber(accountNumber);
        System.out.println("Account controller: customer: " + customer);
        model.addAttribute("payees", customer);
        return "/billpay";
    }
}
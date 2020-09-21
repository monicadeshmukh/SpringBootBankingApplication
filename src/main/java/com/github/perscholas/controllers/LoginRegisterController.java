package com.github.perscholas.controllers;

import com.github.perscholas.exception.ApplicationException;
import com.github.perscholas.models.Accounts;
import com.github.perscholas.models.Customer;
import com.github.perscholas.repositories.AccountsRepository;
import com.github.perscholas.repositories.CustomerRepository;
import com.github.perscholas.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/")
public class LoginRegisterController {

    private CustomerRepository customerRepository;
    private AccountsRepository accountsRepository;

    @Autowired
    public LoginRegisterController(CustomerRepository customerRepository, AccountsRepository accountsRepository) {
        this.customerRepository = customerRepository;
        this.accountsRepository = accountsRepository;
    }
    @GetMapping("loginRegister/")
    String getView(Model model) {
        return "loginRegister";   //the return statement string should match the name of the .jsp file
    }

    @GetMapping("Account/")
    public Customer show(String userName, String password) {
        return customerRepository.findByUserNameAndPassword(userName, password).get();
    }


    @PostMapping("loginRegister/")
    public String registerCustomer(@RequestParam Map<String, String> customerMap) {
        try {
            Customer customer = new Customer();
            customer.setUsername(customerMap.get("username"));
            customer.setPassword(customerMap.get("password"));
            customer.setFirstName(customerMap.get("firstname"));
            customer.setLastName(customerMap.get("lastname"));
            customer.setAddress1(customerMap.get("address1"));
            customer.setAddress2(customerMap.get("address2"));
            customer.setCity(customerMap.get("city"));
            customer.setState(customerMap.get("state"));
            customer.setZipcode(Integer.valueOf(customerMap.get("zipcode")));
            customer.setEmail(customerMap.get("email"));
            customer.setPhone(customerMap.get("phone"));
            customer.setAccount(null);

            //We will be creating a new account for the new customer for the purpose of this case study
            //we will prepopulate the account with a balance of 1000$.
            Customer newCustomer = customerRepository.save(customer);
            Accounts account = new Accounts();
            account.setBalance(1000D);
            account.setCustomer(newCustomer);
            accountsRepository.save(account);
            customer.setAccount(account);
            return "loginRegister";
        }catch(Exception e){
            throw new ApplicationException("Error occured.");
        }

    }
}
package com.github.perscholas.services;

import com.github.perscholas.models.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.github.perscholas.repositories.CustomerRepository;
import com.github.perscholas.repositories.AccountsRepository;
import com.github.perscholas.models.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;
    private AccountsRepository accountsRepository;

    /*@Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }*/
    @Autowired
    public CustomerService(CustomerRepository customerRepository, AccountsRepository accountsRepository) {
        this.customerRepository = customerRepository;
        this.accountsRepository = accountsRepository;
    }

    public Iterable<Customer> index() {
        return customerRepository.findAll();
    }

    public Customer show(Long id) {
        return customerRepository.findById(id).get();
    }

    /*public Customer create(Customer Customer) {
        return repository.save(Customer);
    }*/

    public Customer create(Customer customer) {
        //We will be creating a new account for the new customer for the purpose of this case study
        //we will prepopulate the account with a balance of 1000$.
        Customer newCustomer = customerRepository.save(customer);
        Accounts account = new Accounts();
        account.setBalance(1000D);
        account.setCustomer(newCustomer);
        accountsRepository.save(account);
        customer.setAccount(account);
        return newCustomer;
    }


    public Customer update(Long id, Customer newCustomerData) {
        Customer originalCustomer = customerRepository.findById(id).get();
        //originalCustomer.setName(newCustomerData.getName());
        return customerRepository.save(originalCustomer);
    }

    public Boolean delete(Long id) {
        customerRepository.deleteById(id);
        return true;
    }
}

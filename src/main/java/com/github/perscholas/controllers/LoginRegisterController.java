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
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    @RequestMapping(value = "account", method = RequestMethod.GET)
    public  String show(Model model, @RequestParam (value = "username") String username, @RequestParam (value = "password") String password){
    //public  String show(@PathVariable String username, @PathVariable String password){
        try{
            List<Customer> customer = customerRepository.findByUserNameAndPassword(username, password);
            Optional<Accounts> account = accountsRepository.findById(customer.get(0).getAccountNumber());
            if (!customer.isEmpty()) {
                model.addAttribute("accountNumber", account.get().getAccountNumber());
                model.addAttribute("balance", account.get().getBalance());
                return "account";
            }
            else
                throw new ApplicationException("Invalid username and/or password. Please retry.");
        }catch (Exception e){
                throw new ApplicationException("Invalid username and/or password. Please retry.");
        }
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

            //create dummy payee accounts
            createPayees();

            return "loginRegister";
        }catch(Exception e){
            throw new ApplicationException("Error occured.");
        }

    }

    //create dummy customers as payees for demonstration purpose
    void createPayees(){
        //create dummy electric company
        Customer electricCompany = new Customer();
        electricCompany.setUsername("electriccompany");
        electricCompany.setPassword("electriccompany");
        electricCompany.setFirstName("Dominion Energy");
        electricCompany.setLastName("Dominion");
        electricCompany.setPhone("18001112222");
        electricCompany.setEmail("dominionenergy@gmail.com");
        electricCompany.setAddress1("111 dominion lane");
        electricCompany.setCity("Richmond");
        electricCompany.setState("VA");
        electricCompany.setZipcode(23055);
        electricCompany.setAccount(null);
        Customer electricCompanyPayee = customerRepository.save(electricCompany);

        Accounts electricCompanyAccount = new Accounts();
        electricCompanyAccount.setBalance(1000D);
        electricCompanyAccount.setCustomer(electricCompanyPayee);
        accountsRepository.save(electricCompanyAccount);

        electricCompanyPayee.setAccount(electricCompanyAccount);

        //create dummy water company
        Customer waterCompany = new Customer();
        waterCompany.setUsername("watercompany");
        waterCompany.setPassword("watercompany");
        waterCompany.setFirstName("Richmond Water Works");
        waterCompany.setLastName("Richmond Water Works");
        waterCompany.setPhone("18003334444");
        waterCompany.setEmail("richmondwaterworks@gmail.com");
        waterCompany.setAddress1("111 water lane");
        waterCompany.setCity("Richmond");
        waterCompany.setState("VA");
        waterCompany.setZipcode(23055);
        waterCompany.setAccount(null);
        Customer waterCompanyPayee = customerRepository.save(waterCompany);

        Accounts waterCompanyAccount = new Accounts();
        waterCompanyAccount.setBalance(1000D);
        waterCompanyAccount.setCustomer(waterCompanyPayee);
        accountsRepository.save(waterCompanyAccount);

        waterCompanyPayee.setAccount(waterCompanyAccount);
    }
}
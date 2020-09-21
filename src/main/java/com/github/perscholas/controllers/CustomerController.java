package com.github.perscholas.controllers;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.github.perscholas.services.CustomerService;
import com.github.perscholas.models.Customer;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping(value = "/Customer")
public class CustomerController {
    private CustomerService service;

    @Autowired
    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<Iterable<Customer>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> show(@PathVariable Long id) {
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }
    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
    public ModelAndView newUser(@RequestParam Map<String, String > customerMap) {
    //public ModelAndView newUser(ModelMap customerMap) {
        ModelAndView modelView = new ModelAndView("/newUser/");
        modelView.addAllObjects(customerMap);
        //mv.addAllObjects("customerMap", customer as map );
        //modelView.setViewName("Register");
        return modelView;
    }
    @PostMapping("/")
    public ResponseEntity<Customer> create(@RequestParam Map<String, String> customerMap) {
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
        customer.setPhone("phone");
        customer.setAccount(null);

        return new ResponseEntity<>(service.create(customer), HttpStatus.CREATED);
    }
    //@PostMapping("/")
    /*@RequestMapping(value = "/", method = RequestMethod.POST,
            consumes = "application/x-www-form-urlencoded")*/
   // public ResponseEntity<Customer> create(@RequestBody Customer Customer) {
    //    return new ResponseEntity<>(service.create(Customer), HttpStatus.CREATED);
    //}

    @PostMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable Long id, @RequestBody Customer Customer) {
        return new ResponseEntity<>(service.update(id, Customer), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}

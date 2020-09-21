//package com.github.perscholas;
package com.github.perscholas.controllers;


import com.github.perscholas.models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RegisterController {
    @GetMapping("register/")
    //@RequestMapping("register/")
    String getView(Model model) {
        return "register";   //the return statement string should match the name of the .jsp file
    }
}
package com.github.perscholas.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AccountController {
    @GetMapping("account/")
    String getView(Model model) {
        //TODO
        //populate account id and account balance fields and return view.

        return "account";   //the return statement string should match the name of the .jsp file
    }
}

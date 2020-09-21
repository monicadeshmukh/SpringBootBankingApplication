
//package com.github.perscholas;
package com.github.perscholas.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class welcomeController {
    @GetMapping("welcome1/")
    String getView(Model model) {
        model.addAttribute("message", "Hello there, This message has been injected from the controller method");
        return "welcome";   //the return statement string should match the name of the .jsp file
    }
}

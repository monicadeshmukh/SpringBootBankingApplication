//package com.github.perscholas;
package com.github.perscholas.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloWorldController {
    @GetMapping("helloworld/")
    String getView(Model model) {
        model.addAttribute("msg", "Hello there, This message has been injected from the controller method");
        return "helloworld";
    }
}
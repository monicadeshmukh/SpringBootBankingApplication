//package com.github.perscholas;
package com.github.perscholas.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AboutController {
    @GetMapping("about/")
    String getView(Model model) {
        return "about";   //the return statement string should match the name of the .jsp file
    }
}
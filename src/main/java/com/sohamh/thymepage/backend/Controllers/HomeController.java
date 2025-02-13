package com.sohamh.thymepage.backend.Controllers;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;




@Controller
public class HomeController {

    @GetMapping("/")
    public String home(@RequestParam(name="ShowDetails", required = false) boolean ShowDetails, Model model) {
        model.addAttribute("List", Arrays.asList("Line 1 of list", "Line 2 of list", "Line 3 of list"));
        model.addAttribute("ShowDetails", ShowDetails);
        return "index";
    }
    
}

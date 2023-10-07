package com.company.ThymeleafDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping
    String getPeople(Model model){
        model.addAttribute("people", Arrays.asList(
                new Person("John", 20),
                new Person("Garry", 33),
                new Person("David", 15)
        ));
        return "people";
    }

}

package com.example.manageemployee.controller;

import com.example.manageemployee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/myHome")
    public String homeS(Model model) {
        model.addAttribute("employee", employeeService.getAll());
        return "home";
    }
}

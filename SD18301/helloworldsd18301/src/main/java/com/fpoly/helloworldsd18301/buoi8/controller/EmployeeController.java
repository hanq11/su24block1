package com.fpoly.helloworldsd18301.buoi8.controller;

import com.fpoly.helloworldsd18301.buoi8.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @RequestMapping("/get-list")
    public String getList(Model model) {
        model.addAttribute("list", service.getList());
        return "employee/table";
    }

}

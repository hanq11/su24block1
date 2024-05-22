package com.poly.helloworldsd18313.buoi8.controller;

import com.poly.helloworldsd18313.buoi8.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/company2")
public class Company2Controller {
    @Autowired
    Company company;

    @ResponseBody
    @GetMapping("/get-name")
    public String getName() {
        return company.getName();
    }
}

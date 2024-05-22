package com.poly.helloworldsd18313.buoi8.controller;

import com.poly.helloworldsd18313.buoi8.entity.AnotherCompany;
import com.poly.helloworldsd18313.buoi8.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    Company company;

    @Autowired
    AnotherCompany anotherCompany;

    @ResponseBody
    @GetMapping("/get-name")
    public String getName() {
        return company.getName();
    }

    @ResponseBody
    @GetMapping("/edit-name")
    public String editName() {
        company.setName("hehe");
        return "OK";
    }

    @ResponseBody
    @GetMapping("/get-name2")
    public String getName2() {
        return anotherCompany.getName();
    }
}

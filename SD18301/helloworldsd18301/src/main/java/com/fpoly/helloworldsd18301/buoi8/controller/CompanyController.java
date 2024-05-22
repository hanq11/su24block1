package com.fpoly.helloworldsd18301.buoi8.controller;

import com.fpoly.helloworldsd18301.buoi8.entity.AnotherCompany;
import com.fpoly.helloworldsd18301.buoi8.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
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
    @RequestMapping("/get-name")
    public String getName() {
        return company.getName();
    }

    @ResponseBody
    @RequestMapping("/edit-name")
    public String editName() {
        company.setName("FPT33333333");
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/get-name-2")
    public String getName2() {
        return anotherCompany.getName();
    }
}

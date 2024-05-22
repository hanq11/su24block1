package com.fpoly.helloworldsof302101.buoi8.controller;

import com.fpoly.helloworldsof302101.buoi8.entity.AnotherCompany;
import com.fpoly.helloworldsof302101.buoi8.entity.Company;
import jakarta.servlet.http.HttpServletRequest;
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
    @RequestMapping("/get-company")
    public String getCompany() {
        return company.getName();
    }

    @ResponseBody
    @RequestMapping("/edit-company")
    public String editCompany() {
        company.setName("FPT22222222");
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/get-another-company")
    public String getAnotherCompany() {
        return anotherCompany.getName();
    }

}

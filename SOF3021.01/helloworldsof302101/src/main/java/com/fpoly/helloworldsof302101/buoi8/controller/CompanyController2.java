package com.fpoly.helloworldsof302101.buoi8.controller;

import com.fpoly.helloworldsof302101.buoi8.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/company2")
public class CompanyController2 {
    @Autowired
    Company company;

    @ResponseBody
    @RequestMapping("/get-company")
    public String getCompany() {
        return company.getName();
    }
}

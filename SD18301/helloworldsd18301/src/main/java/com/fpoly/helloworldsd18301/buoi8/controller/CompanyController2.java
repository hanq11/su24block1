package com.fpoly.helloworldsd18301.buoi8.controller;

import com.fpoly.helloworldsd18301.buoi8.entity.Company;
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
    @RequestMapping("/get-name")
    public String getName() {
        return company.getName();
    }
}

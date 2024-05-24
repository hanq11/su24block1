package com.fpoly.helloworldsof302101.shop.controller;

import com.fpoly.helloworldsof302101.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop/category")
public class CategoryController {
    @Autowired
    CategoryService service;

    @GetMapping("/list")
    public String showList(Model model) {

        model.addAttribute("list", service.getList());
        return "shop/category";
    }
}

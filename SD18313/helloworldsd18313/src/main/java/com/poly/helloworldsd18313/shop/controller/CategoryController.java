package com.poly.helloworldsd18313.shop.controller;

import com.poly.helloworldsd18313.shop.entity.Category;
import com.poly.helloworldsd18313.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/shop/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/list")
    public String showList(Model model
            , @RequestParam(name = "p", defaultValue = "0") int p) {
        model.addAttribute("page", categoryService.getAllCategory(p));
        return "shop/category";
    }

    @PostMapping("/add")
    public String addCategory(Category category) {
        categoryService.addCategory(category);
        return "redirect:/shop/category/list";
    }

    @GetMapping("/delete")
    public String deleteCategory(@RequestParam("id") String id) {
        categoryService.deleteCategoryById(id);
        return "redirect:/shop/category/list";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable("id") String id, Model model) {
        model.addAttribute("category", categoryService.getCategoryById(id));
        return "shop/category-detail";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") String id, Model model) {
        model.addAttribute("category", categoryService.getCategoryById(id));
        return "shop/category-update";
    }

    @PostMapping("/update")
    public String updateCategory(Category category) {
        categoryService.updateCategory(category);
        return "redirect:/shop/category/list";
    }
}

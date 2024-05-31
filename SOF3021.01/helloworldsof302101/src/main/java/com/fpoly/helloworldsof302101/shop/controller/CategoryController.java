package com.fpoly.helloworldsof302101.shop.controller;

import com.fpoly.helloworldsof302101.shop.entity.Category;
import com.fpoly.helloworldsof302101.shop.repository.CategoryRepository;
import com.fpoly.helloworldsof302101.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/shop/category")
public class CategoryController {
    @Autowired
    CategoryService service;

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(name = "p", defaultValue = "0") int p) {
        model.addAttribute("page", service.getList(p));
        return "shop/category";
    }

    @PostMapping("/add")
    public String createCategory(Category category) {
        service.addCategory(category);
        return "redirect:/shop/category/list";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable("id") String id, Model model) {
        model.addAttribute("category", service.findCategory(id));
        return "shop/category-detail";
    }

    @GetMapping("/delete")
    public String deleteCategory(@RequestParam("id") String id) {
        service.deleteCategory(id);
        return "redirect:/shop/category/list";
    }

    @GetMapping("/update/{id}")
    public String showUpdate(@PathVariable("id") String id, Model model) {
        model.addAttribute("category", service.findCategory(id));
        return "shop/category-update";
    }

    @PostMapping("/update")
    public String updateCategory(Category category) {
        service.updateCategory(category);
        return "redirect:/shop/category/list";
    }

    @ResponseBody
    @GetMapping("/findByName")
    public Category findCategoryByName(@RequestParam("name") String name) {
        return categoryRepository.findCategoryByName(name);
    }

    @ResponseBody
    @GetMapping("/findByNameJPQL")
    public Category findByNameJPQL(@RequestParam("name") String name) {
        return categoryRepository.findCategoryJPQL(name);
    }

    @ResponseBody
    @GetMapping("/findByNameSQL")
    public Category findByNameSQL(@RequestParam("name") String name) {
        return categoryRepository.findCategorySQL(name);
    }
}

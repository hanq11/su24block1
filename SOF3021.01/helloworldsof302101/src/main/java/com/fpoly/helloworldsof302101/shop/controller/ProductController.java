package com.fpoly.helloworldsof302101.shop.controller;

import com.fpoly.helloworldsof302101.shop.entity.Category;
import com.fpoly.helloworldsof302101.shop.entity.Product;
import com.fpoly.helloworldsof302101.shop.repository.ProductRepository;
import com.fpoly.helloworldsof302101.shop.service.CategoryService;
import com.fpoly.helloworldsof302101.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/shop/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/list")
    public String getListProduct(Model model) {
        model.addAttribute("list", productService.getList());
        return "shop/product/list-and-add";
    }

    @PostMapping("/add")
    public String addProduct(Product product) {
        productService.addProduct(product);
        return "redirect:/shop/product/list";
    }

    @ModelAttribute("listCategory")
    List<Category> getCategoryList() {
        return categoryService.getAllNonePaging();
    }

    @GetMapping("/update/{id}")
    public String showUpdate(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("product", productRepository.findById(id).get());
        return "shop/product/update";
    }

    @PostMapping("/update")
    public String updateProduct(Product product) {
        productRepository.save(product);
        return "redirect:/shop/product/list";
    }

    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("id") Integer id) {
        productRepository.deleteById(id);
        return "redirect:/shop/product/list";
    }
}

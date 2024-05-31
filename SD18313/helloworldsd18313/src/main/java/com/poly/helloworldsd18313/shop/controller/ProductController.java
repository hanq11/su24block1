package com.poly.helloworldsd18313.shop.controller;

import com.poly.helloworldsd18313.shop.entity.Category;
import com.poly.helloworldsd18313.shop.entity.Product;
import com.poly.helloworldsd18313.shop.service.CategoryService;
import com.poly.helloworldsd18313.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/shop/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/list")
    public String getListProduct(Model model) {
        model.addAttribute("list", productService.getAllProduct());
        return "shop/product/list-and-add";
    }

    @PostMapping("/add")
    public String addProduct(Product product) {
        productService.addProduct(product);
        return "redirect:/shop/product/list";
    }

    @ModelAttribute("listCategory")
    List<Category> getAllCategory() {
        return categoryService.getAllCategoryNonPaging();
    }
}

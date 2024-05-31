package com.fpoly.helloworldsof302101.shop.service;

import com.fpoly.helloworldsof302101.shop.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getList();

    public void addProduct(Product product);
}

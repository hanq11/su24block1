package com.fpoly.helloworldsd18301.shop.service;

import com.fpoly.helloworldsd18301.shop.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();

    public void addProduct(Product product);
}

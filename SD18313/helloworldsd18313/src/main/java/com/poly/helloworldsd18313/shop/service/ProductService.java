package com.poly.helloworldsd18313.shop.service;

import com.poly.helloworldsd18313.shop.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();

    public void addProduct(Product product);
}

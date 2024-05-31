package com.fpoly.helloworldsof302101.shop.service.impl;

import com.fpoly.helloworldsof302101.shop.entity.Product;
import com.fpoly.helloworldsof302101.shop.repository.ProductRepository;
import com.fpoly.helloworldsof302101.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getList() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }
}

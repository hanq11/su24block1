package com.fpoly.helloworldsof302101.shop.service.impl;

import com.fpoly.helloworldsof302101.shop.entity.Category;
import com.fpoly.helloworldsof302101.shop.repository.CategoryRepository;
import com.fpoly.helloworldsof302101.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getList() {
        return categoryRepository.findAll();
    }
}

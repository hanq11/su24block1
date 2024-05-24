package com.fpoly.helloworldsd18301.shop.service.impl;

import com.fpoly.helloworldsd18301.shop.entity.Category;
import com.fpoly.helloworldsd18301.shop.repository.CategoryRepository;
import com.fpoly.helloworldsd18301.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }
}

package com.poly.helloworldsd18313.shop.service.impl;

import com.poly.helloworldsd18313.shop.entity.Category;
import com.poly.helloworldsd18313.shop.repository.CategoryRepository;
import com.poly.helloworldsd18313.shop.service.CategoryService;
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

package com.poly.helloworldsd18313.shop.service.impl;

import com.poly.helloworldsd18313.shop.entity.Category;
import com.poly.helloworldsd18313.shop.repository.CategoryRepository;
import com.poly.helloworldsd18313.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    private static final int PAGE_SIZE = 3;

    @Override
    public Page<Category> getAllCategory(int p) {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(p, PAGE_SIZE, sort);
        return categoryRepository.findAll(pageable);
    }

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategoryById(String id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category getCategoryById(String id) {
        return categoryRepository.findById(id).get();
    }
}

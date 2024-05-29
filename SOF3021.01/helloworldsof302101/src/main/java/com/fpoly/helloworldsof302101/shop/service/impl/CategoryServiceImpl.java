package com.fpoly.helloworldsof302101.shop.service.impl;

import com.fpoly.helloworldsof302101.shop.entity.Category;
import com.fpoly.helloworldsof302101.shop.repository.CategoryRepository;
import com.fpoly.helloworldsof302101.shop.service.CategoryService;
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
    public Page<Category> getList(int p) {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(p, PAGE_SIZE, sort);
        return categoryRepository.findAll(pageable);
    }

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category findCategory(String id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(String id) {
        categoryRepository.deleteById(id);
    }


}

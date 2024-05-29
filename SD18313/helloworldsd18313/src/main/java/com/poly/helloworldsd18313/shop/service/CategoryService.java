package com.poly.helloworldsd18313.shop.service;

import com.poly.helloworldsd18313.shop.entity.Category;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {
    public Page<Category> getAllCategory(int p);

    public void addCategory(Category category);

    public void updateCategory(Category category);

    public void deleteCategoryById(String id);

    public Category getCategoryById(String id);
}

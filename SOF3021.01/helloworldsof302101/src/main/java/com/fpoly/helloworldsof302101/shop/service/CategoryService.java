package com.fpoly.helloworldsof302101.shop.service;

import com.fpoly.helloworldsof302101.shop.entity.Category;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {
    public Page<Category> getList(int p);

    public void addCategory(Category category);

    public Category findCategory(String id);

    public void updateCategory(Category category);

    public void deleteCategory(String id);

    public List<Category> getAllNonePaging();
}

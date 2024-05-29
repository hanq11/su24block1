package com.fpoly.helloworldsd18301.shop.service;

import com.fpoly.helloworldsd18301.shop.entity.Category;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {
    public Page<Category> getAllCategory(int p);

    public void addCategory(Category category);

    public void updateCategory(Category category);

    public Category getDetail(String id);

    public void deleteCategory(String id);
}

package com.fpoly.helloworldsd18301.shop.repository;

import com.fpoly.helloworldsd18301.shop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
}

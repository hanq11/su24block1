package com.fpoly.helloworldsof302101.shop.repository;

import com.fpoly.helloworldsof302101.shop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

}

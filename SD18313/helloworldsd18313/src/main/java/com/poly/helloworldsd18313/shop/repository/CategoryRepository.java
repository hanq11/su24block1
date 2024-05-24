package com.poly.helloworldsd18313.shop.repository;

import com.poly.helloworldsd18313.shop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

}

package com.poly.helloworldsd18313.shop.repository;

import com.poly.helloworldsd18313.shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}

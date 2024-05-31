package com.fpoly.helloworldsof302101.shop.repository;

import com.fpoly.helloworldsof302101.shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

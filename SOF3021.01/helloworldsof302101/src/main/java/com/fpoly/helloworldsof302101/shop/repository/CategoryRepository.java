package com.fpoly.helloworldsof302101.shop.repository;

import com.fpoly.helloworldsof302101.shop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
    public Category findCategoryByName(String name);

    // JPQL
    @Query("SELECT c FROM Category c WHERE c.name = :name")
    public Category findCategoryJPQL(@Param("name") String name);

    // SQL
    @Query(value = "SELECT * FROM Categories c WHERE c.name = :name", nativeQuery = true)
    public Category findCategorySQL(@Param("name") String name);
}

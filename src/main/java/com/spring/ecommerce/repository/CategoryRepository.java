package com.spring.ecommerce.repository;

import com.spring.ecommerce.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}

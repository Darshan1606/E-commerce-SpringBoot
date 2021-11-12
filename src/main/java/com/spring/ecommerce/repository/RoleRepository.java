package com.spring.ecommerce.repository;

import com.spring.ecommerce.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}

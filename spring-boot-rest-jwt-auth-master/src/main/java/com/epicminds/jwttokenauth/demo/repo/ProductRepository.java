package com.epicminds.jwttokenauth.demo.repo;

import com.epicminds.jwttokenauth.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

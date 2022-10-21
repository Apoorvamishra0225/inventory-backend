package com.inventory.productmanagementsss.repository;

import com.inventory.productmanagementsss.controller.ProductController;
import com.inventory.productmanagementsss.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}

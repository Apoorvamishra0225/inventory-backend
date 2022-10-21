package com.inventory.productmanagementsss.repository;

import com.inventory.productmanagementsss.entity.AuthenticationToken;
import com.inventory.productmanagementsss.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer> {

    AuthenticationToken findByUser(User user);
}

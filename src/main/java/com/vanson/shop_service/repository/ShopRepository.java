package com.vanson.shop_service.repository;

import com.vanson.shop_service.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShopRepository extends JpaRepository<Shop, Long> {
    Optional<Shop> findByEmail(String email);
}
package com.vanson.shop_service.contronller;

import com.vanson.shop_service.entity.Shop;
import com.vanson.shop_service.repository.ShopRepository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/shops")
public class ShopController {
    private final ShopRepository shopRepository;

    public ShopController(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    @GetMapping("/my-shop")
    public Shop getMyShop(@RequestParam String email) {
        return shopRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Shop not found"));
    }
}
package com.example.shopapi.controllers

import com.example.shopapi.domain.Product
import org.springframework.web.bind.annotation.*
import repositories.ShopRepository


@RestController
class ShopController(private val shopRepository: ShopRepository) {


    @GetMapping("/api/products")
    @ResponseBody
    fun allProducts(): List<Product?>? {
        return shopRepository.findAll()

    }
    @PostMapping("/songs")
    fun addShop(@RequestBody product: Product): Product? {
        return shopRepository.save(product)
    }
}



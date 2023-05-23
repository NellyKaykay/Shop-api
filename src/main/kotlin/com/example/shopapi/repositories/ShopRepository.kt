package com.example.shopapi.repositories

import com.example.shopapi.domain.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ShopRepository: JpaRepository<Product, Long>

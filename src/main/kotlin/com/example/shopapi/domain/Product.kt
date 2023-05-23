package com.example.shopapi.domain

import jakarta.persistence.*

@Entity
@Table(name = "products")

data class Product(
    var name: String,
    var brand: String,
    var hasDiscount: String,
    var price: Double,
    var link: String

    ) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}
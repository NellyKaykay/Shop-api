package com.example.shopapi.repositories

import com.example.shopapi.domain.Product
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component
import repositories.ShopRepository

@Component
class
DataLoader(private val shopRepository: ShopRepository) {
    @PostConstruct
    fun load() {
        val shop = listOf(
            Product("Camiseta estampada", "Levi's", "20%", 14.40, "https://img01.ztat.net/article/spp-media-p1/8d33b25d4a1b3a718e588ed512a54bfd/0fd7e0ed52b54c62997ee253694d9547.jpg?imwidth=1800"),
            Product("Camiseta estampada", "Adidas", "30%", 16.15, "https:https://img01.ztat.net/article/spp-media-p1/65c616d4c5de437c84860e575410c49a/ad607c74435c493694646aea80c82dc5.jpg?imwidth=1800\n"),
            Product("Camiseta basica", "Anna Field", "15%", 11.09, "https:https://img01.ztat.net/article/spp-media-p1/65c616d4c5de437c84860e575410c49a/ad607c74435c493694646aea80c82dc5.jpg?imwidth=1800\n"),


        )


        shopRepository.saveAll(shop)
        println("Cargamos datos de prueba cuando arrancamos el servidor: $/api/songs")
    }

}
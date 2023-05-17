package com.example.shopapi

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.ActiveProfiles
import repositories.ShopRepository

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class ShopApiApplicationTests {
    @Autowired
    private lateinit var api:TestRestTemplate
    @Autowired
    private lateinit var shopRepository: ShopRepository

    @BeforeEach
    fun setUp(){
        shopRepository
    }

    @Test
    fun contextLoads() {
    }

}

package com.example.shopapi

import com.example.shopapi.repositories.ShopRepository
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.ActiveProfiles


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class ShopApiApplicationTests {

    @get:Autowired
    private var api:TestRestTemplate
        get() = Companion._api
        set(value) {
            Companion._api = value
        }

    @Autowired
    private lateinit var shopRepository: ShopRepository

    @BeforeEach
    fun setUp(){
        shopRepository
    }

    @Test
    fun contextLoads() {
    }

    companion object {
        private lateinit var _api: TestRestTemplate
    }

}

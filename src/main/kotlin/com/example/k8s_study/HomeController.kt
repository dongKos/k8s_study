package com.example.k8s_study

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @GetMapping("/hello")
    fun hello(): String = "world!"

    @GetMapping("/v2/hello")
    fun helloV2(): String = "v2 world!"
}
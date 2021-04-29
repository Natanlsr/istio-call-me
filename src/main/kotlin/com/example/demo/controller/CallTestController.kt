package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/call/test"])
class CallTestController {

    @GetMapping
    fun testApi() = "Hello, you call me"
}
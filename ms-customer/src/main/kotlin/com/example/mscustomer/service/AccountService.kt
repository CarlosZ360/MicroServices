package com.example.mscustomer.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name="ms-account")
interface AccountService {
    @GetMapping("/account/test")
    fun test(): String

    @GetMapping("/account/list")
    fun list (): List<String>
}
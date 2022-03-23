package com.ahold.triggers.trigger1

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/trigger1")
class Trigger1Controller {

    @GetMapping()
    fun getCanceledOrders(
        @RequestParam("trigger")
        trigger1Value: String
    ) = Trigger1(trigger1Value)
}

data class Trigger1(
    val value:String
)
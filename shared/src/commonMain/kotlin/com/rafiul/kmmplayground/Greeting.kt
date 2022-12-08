package com.rafiul.kmmplayground

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
    fun nameShow(): String {
        return "${platform.myName}"
    }
}
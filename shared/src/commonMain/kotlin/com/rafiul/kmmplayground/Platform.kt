package com.rafiul.kmmplayground

interface Platform {
    val name: String
    val myName: String
}

expect fun getPlatform(): Platform
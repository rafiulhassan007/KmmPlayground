package com.rafiul.kmmplayground

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
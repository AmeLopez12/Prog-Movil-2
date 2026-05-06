package com.example.miprimermulti

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
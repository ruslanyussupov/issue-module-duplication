package com.github.ruslanyussupov.utils

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
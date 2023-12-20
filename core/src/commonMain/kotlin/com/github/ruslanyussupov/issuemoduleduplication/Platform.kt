package com.github.ruslanyussupov.issuemoduleduplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
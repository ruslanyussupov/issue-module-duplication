package com.github.ruslanyussupov.utils

import platform.UIKit.UIDevice
import com.github.ruslanyussupov.issuemoduleduplication.Greeting as CoreGreeting

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion + CoreGreeting().greet()
}

actual fun getPlatform(): Platform = IOSPlatform()

package com.rafiul.kmmplayground

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
    override val myName: String = "Md. Rafiul Hassan"
}

actual fun getPlatform(): Platform = IOSPlatform()
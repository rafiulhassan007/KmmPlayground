package com.rafiul.kmmplayground

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
    override val myName: String = "Md. Rafiul Hassan"
}

actual fun getPlatform(): Platform = AndroidPlatform()
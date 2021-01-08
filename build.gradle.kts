buildscript {
    repositories {
        google()
        jcenter()
    }
}

plugins {
    id("com.android.application") version "4.0.2" apply false
    kotlin("android") version "1.4.20" apply false
    kotlin("plugin.serialization") version "1.4.20" apply false
    id("net.mbonnin.one.eight") version "0.2"
}

subprojects {
    repositories {
        google()
        jcenter()
    }
}

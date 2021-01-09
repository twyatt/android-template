plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("plugin.serialization")
}

kotlin {
    sourceSets {
        val main by getting {
            dependencies {
                implementation(kotlinx("serialization-json"))
                implementation(kotlinx("coroutines-core"))
                implementation(material())
                implementation(androidx("appcompat"))
                implementation(androidx("constraintlayout"))
                implementation(androidx("recyclerview"))
                implementation(androidx("lifecycle-viewmodel-ktx"))
                implementation(androidx("lifecycle-livedata-ktx"))
                implementation(androidx("activity-ktx"))
            }
        }
    }
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(21)
    }
}

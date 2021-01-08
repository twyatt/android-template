object kotlinx {
    fun serialization(
        format: String,
        version: String = "1.0.1"
    ) = "org.jetbrains.kotlinx:kotlinx-serialization-$format:$version"
}

fun material(
    version: String = "1.1.0"
) = "com.google.android.material:material:$version"

object androidx {

    fun activity(
        artifact: String,
        version: String = "1.1.0"
    ) = "androidx.activity:$artifact:$version"

    fun appcompat(
        version: String = "1.1.0"
    ) = "androidx.appcompat:appcompat:$version"

    fun constraintlayout(
        version: String = "2.0.4"
    ) = "androidx.constraintlayout:constraintlayout:$version"

    fun lifecycle(
        module: String,
        version: String = "2.2.0"
    ) = "androidx.lifecycle:lifecycle-$module:$version"

    fun recyclerview(
        version: String = "1.1.0"
    ) = "androidx.recyclerview:recyclerview:$version"
}

fun kotlinx(
    artifact: String,
    version: String? = null
): String {
    val v = version ?: when (val module = artifact.substringBefore("-")) {
        "serialization" -> "1.0.1"
        "coroutines" -> "1.4.2"
        else -> error("Missing version for kotlinx.$module")
    }
    return "org.jetbrains.kotlinx:kotlinx-$artifact:$v"
}

fun androidx(
    artifact: String,
    version: String? = null
): String {
    val module = artifact.substringBefore("-")
    val v = version ?: when (module) {
        "constraintlayout" -> "2.0.4"
        "lifecycle" -> "2.2.0"
        else -> "1.1.0"
    }
    return "androidx.$module:$artifact:$v"
}

fun material(
    version: String = "1.1.0"
) = "com.google.android.material:material:$version"

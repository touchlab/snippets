package com.example.android.kotlin.style

class MyResult()

object StyleGuideSourceFiles {
    // [START android_style_guide_naming_basic]
    // MyClass.kt
    class MyClass {}
    // [END android_style_guide_naming_basic]


    // [START android_style_guide_naming_extending]
    // Bar.kt
    class Bar {}

    fun Runnable.toBar(): Bar = // [START_EXCLUDE]
        Bar()
    // [END_EXCLUDE]
    // [END android_style_guide_naming_extending]


    // [START android_style_guide_naming_map]
    // Map.kt
    fun <T, O> Set<T>.map(func: (T) -> O): List<O> = // [START_EXCLUDE]
        emptyList()

    // [END_EXCLUDE]
    fun <T, O> List<T>.map(func: (T) -> O): List<O> = // [START_EXCLUDE]
        emptyList()
    // [END_EXCLUDE]
    // [END android_style_guide_naming_map]

    // [START android_style_guide_naming_extensions]
    // extensions.kt
    fun MyClass.process() = // [START_EXCLUDE]
        Unit

    // [END_EXCLUDE]
    fun MyResult.print() = // [START_EXCLUDE]
        print("")
    // [END_EXCLUDE]
    // [START android_style_guide_naming_extensions]
}

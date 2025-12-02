package com.example.android.styling.formatting

import kotlin.annotation.AnnotationTarget.*
import kotlin.annotation.AnnotationRetention.*

// [START formatting_specific_construct_enum_single]
private class ConstructsEnum {
    enum class Answer { YES, NO, MAYBE }
}
// [END formatting_specific_construct_enum_single]

// [START formatting_specific_construct_enum]
private class ConstructsEnumSeparate {
    enum class Answer {
        YES,
        NO,

        MAYBE {
            override fun toString() = """¯\_(ツ)_/¯"""
        }
    }
}
// [END formatting_specific_construct_enum]

// [START formatting_specific_construct_annotations]
@Retention(SOURCE)
@Target(FUNCTION, PROPERTY_SETTER, FIELD)
annotation class Global
// [END formatting_specific_construct_annotations]

private class Test2 {

    // [START formatting_specific_construct_annotations_single]
    @JvmField @Volatile
    var disposable: Disposable? = null
    // [END formatting_specific_construct_annotations_single]

}

private class Test4 {
    // [START formatting_specific_construct_annotations_field]
    @field:[JvmStatic Volatile]
    var disposable: Disposable? = null
    // [END formatting_specific_construct_annotations_field]

}

class Disposable
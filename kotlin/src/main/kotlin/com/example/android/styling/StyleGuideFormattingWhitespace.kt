package com.example.android.styling


fun styleGuideFormattingWhitespaceWrong(list: List<String>, ints: List<Int>, it: Int) {
    // [START android_style_guide_formatting_whitespace_for_wrong]
    // WRONG!
    for (i in 0..1) {
    }
    // [END android_style_guide_formatting_whitespace_for_wrong]

    if (true) {
        // [START android_style_guide_formatting_whitespace_else_wrong]
        // WRONG!
    } else {
    }
    // [END android_style_guide_formatting_whitespace_else_wrong]

    // [START android_style_guide_formatting_whitespace_curly_wrong]
    // WRONG!
    if (list.isEmpty()) {
    }
    // [END android_style_guide_formatting_whitespace_curly_wrong]

    // [START android_style_guide_formatting_whitespace_binary_wrong]
    // WRONG!
    val two = 1 + 1
    // [END android_style_guide_formatting_whitespace_binary_wrong]

    // [START android_style_guide_formatting_whitespace_operator_wrong]
    // WRONG!
    ints.map { value -> value.toString() }
    // [END android_style_guide_formatting_whitespace_operator_wrong]

    // [START android_style_guide_formatting_whitespace_colons_wrong]
    // WRONG!
    val toString = Any::toString
    // [END android_style_guide_formatting_whitespace_colons_wrong]

    // [START android_style_guide_formatting_whitespace_dot_wrong]
    // WRONG
    it . toString()
    // [END android_style_guide_formatting_whitespace_dot_wrong]

    // [START android_style_guide_formatting_whitespace_range_wrong]
    // WRONG
    for (i in 1 .. 4) {
        print(i)
    }
    // [END android_style_guide_formatting_whitespace_range_wrong]

    // [START android_style_guide_formatting_whitespace_colon_class_wrong]
    // WRONG!
    class Foo: Runnable
    // [END android_style_guide_formatting_whitespace_colon_class_wrong]
    {
        override fun run() {
            TODO("Not yet implemented")
        }
    }

    // [START android_style_guide_formatting_whitespace_colon_generic_wrong]
    // WRONG
    fun <T: Comparable> max(a: T, b: T)
    // [END android_style_guide_formatting_whitespace_colon_generic_wrong]
    {}

    // [START android_style_guide_formatting_whitespace_colon_generic_where_wrong]
    // WRONG
    fun <T> max(a: T, b: T) where T: Comparable<T>
    // [END android_style_guide_formatting_whitespace_colon_generic_where_wrong]
    {}

    // [START android_style_guide_formatting_whitespace_comma_val_wrong]
    // WRONG!
    val oneAndTwo = listOf(1,2)
    // [END android_style_guide_formatting_whitespace_comma_val_wrong]
}

fun styleGuideFormattingWhitespaceOkay(list: List<String>, ints: List<Int>, it: Int) {
    // [START android_style_guide_formatting_whitespace_for_okay]
    // Okay
    for (i in 0..1) {
    }
    // [END android_style_guide_formatting_whitespace_for_okay]

    if (true) {
        // [START android_style_guide_formatting_whitespace_else_okay]
        // Okay
    } else {
    }
    // [END android_style_guide_formatting_whitespace_else_okay]

    // [START android_style_guide_formatting_whitespace_curly_okay]
    // Okay
    if (list.isEmpty()) {
    }
    // [END android_style_guide_formatting_whitespace_curly_okay]

    // [START android_style_guide_formatting_whitespace_colons_okay]
    // Okay
    val toString = Any::toString
    // [END android_style_guide_formatting_whitespace_colons_okay]

    // [START android_style_guide_formatting_whitespace_binary_okay]
    // Okay
    val two = 1 + 1
    // [END android_style_guide_formatting_whitespace_binary_okay]

    // [START android_style_guide_formatting_whitespace_operator_okay]
    // Okay
    ints.map { value -> value.toString() }
    // [END android_style_guide_formatting_whitespace_operator_okay]

    // [START android_style_guide_formatting_whitespace_dot_okay]
    // Okay
    it.toString()
    // [END android_style_guide_formatting_whitespace_dot_okay]

    // [START android_style_guide_formatting_whitespace_range_okay]
    // Okay
    for (i in 1..4) {
        print(i)
    }
    // [END android_style_guide_formatting_whitespace_range_okay]

    // [START android_style_guide_formatting_whitespace_colon_class_okay]
    // Okay
    class Foo : Runnable
    // [END android_style_guide_formatting_whitespace_colon_class_okay]
    {
        override fun run() {
            TODO("Not yet implemented")
        }
    }

    // [START android_style_guide_formatting_whitespace_colon_generic_okay]
    // Okay
    fun <T : Comparable> max(a: T, b: T)
    // [END android_style_guide_formatting_whitespace_colon_generic_okay]
    {}

    // [START android_style_guide_formatting_whitespace_colon_generic_where_okay]
    // Okay
    fun <T> max(a: T, b: T) where T : Comparable<T>
    // [END android_style_guide_formatting_whitespace_colon_generic_where_okay]
    {}

    // [START android_style_guide_formatting_whitespace_comma_val_okay]
    // Okay
    val oneAndTwo = listOf(1, 2)
    // [END android_style_guide_formatting_whitespace_comma_val_okay]

}

object StyleGuideFormattingWhitespaceWrong {
    // [START android_style_guide_formatting_comma_class_wrong]
    // WRONG!
    class Foo :Runnable
    // [END android_style_guide_formatting_comma_class_wrong]
    {
        override fun run() {
            TODO("Not yet implemented")
        }
    }

    // [START android_style_guide_formatting_double_slash_wrong]
    // WRONG!
    var debugging = false//disabled by default
    // [END android_style_guide_formatting_double_slash_wrong]
}

object StyleGuideFormattingWhitespaceOkay {
    // [START android_style_guide_formatting_comma_class_okay]
    // Okay
    class Foo : Runnable
    // [END android_style_guide_formatting_comma_class_okay]
    {
        override fun run() {
            TODO("Not yet implemented")
        }
    }

    // [START android_style_guide_formatting_double_slash_okay]
    // Okay
    var debugging = false // disabled by default
    // [END android_style_guide_formatting_double_slash_okay]
}
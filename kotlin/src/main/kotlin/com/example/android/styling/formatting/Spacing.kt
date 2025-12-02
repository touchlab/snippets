/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.styling.formatting

private fun horizontalIf() {

    // [START formatting_whitespace_if_wrong]
    // WRONG!
    for(i in 0..1) {
    }
    // [END formatting_whitespace_if_wrong]

    // [START formatting_whitespace_if_okay]
    // Okay
    for (i in 0..1) {
    }
    // [END formatting_whitespace_if_okay]
}

private fun horizontalElse() {

    if (true) {
    // [START formatting_whitespace_else_wrong]
    // WRONG!
    }else {
    }
    // [END formatting_whitespace_else_wrong]

    if (true) {
    // [START formatting_whitespace_else_okay]
    // Okay
    } else {
    }
    // [END formatting_whitespace_else_okay]

}

private fun horizontalCurlyBraces(list: List<String>) {

    // [START formatting_whitespace_before_curly_wrong]
    // WRONG!
    if (list.isEmpty()){
    }
    // [END formatting_whitespace_before_curly_wrong]

    // [START formatting_whitespace_before_curly_okay]
    // Okay
    if (list.isEmpty()) {
    }
    // [END formatting_whitespace_before_curly_okay]
}

private fun horizontalBinaryOperatorWrong() {
    // [START formatting_whitespace_binary_operator_wrong]
    // WRONG!
    val two = 1+1
    // [END formatting_whitespace_binary_operator_wrong]
}

private fun horizontalBinaryOperatorRight() {
    // [START formatting_whitespace_binary_operator_okay]
    // Okay
    val two = 1 + 1
    // [END formatting_whitespace_binary_operator_okay]
}


private fun horizontalOperatorLike(ints: List<Int>) {

    // [START formatting_whitespace_operator_wrong]
    // WRONG!
    ints.map { value->value.toString() }
    // [END formatting_whitespace_operator_wrong]

    // [START formatting_whitespace_operator_wrong]
    // Okay
    ints.map { value -> value.toString() }
    // [END formatting_whitespace_operator_wrong]
}

private fun horizontalColonsWrong() {

    // [START formatting_whitespace_colons_wrong]
    // WRONG!
    val toString = Any :: toString
    // [END formatting_whitespace_colons_wrong]
}

private fun horizontalColonsRight() {
    // [START formatting_whitespace_colons_okay]
    // Okay
    val toString = Any::toString
    // [END formatting_whitespace_colons_okay]
}

private fun horizontalDotSeparator(it: Int) {
    // [START formatting_whitespace_dot_separator_wrong]
    // WRONG
    it . toString()
    // [END formatting_whitespace_dot_separator_wrong]

    // [START formatting_whitespace_dot_separator_okay]
    // Okay
    it.toString()
    // [END formatting_whitespace_dot_separator_okay]
}

private fun horizontalRangeOperator() {

    // [START formatting_whitespace_range_operator_wrong]
    // WRONG
    for (i in 1 .. 4) {
        print(i)
    }
    // [END formatting_whitespace_range_operator_wrong]

    // [START formatting_whitespace_range_operator_okay]
    // Okay
    for (i in 1..4) {
        print(i)
    }
    // [END formatting_whitespace_range_operator_okay]
}

private fun horizontalColonClassWrong() {

    // [START formatting_whitespace_colon_class_wrong]
    // WRONG!
    class Foo: Runnable
    // [END formatting_whitespace_colon_class_wrong]
    {
        override fun run() {
            TODO("Not yet implemented")
        }
    }
}

private fun horizontalColonClassRight() {

    // [START formatting_whitespace_colon_class_okay]
    // Okay
    class Foo : Runnable
    // [END formatting_whitespace_colon_class_okay]
    {
        override fun run() {
            TODO("Not yet implemented")
        }
    }
}

private fun horizontalColonGenericWrong() {
    // [START formatting_whitespace_colon_generic_wrong]
    // WRONG
    fun <T: Comparable<T>> max(a: T, b: T)
    // [END formatting_whitespace_colon_generic_wrong]
    {}
}

private fun horizontalColonGenericRight() {
    // [START formatting_whitespace_colon_generic_okay]
    // Okay
    fun <T : Comparable<T>> max(a: T, b: T)
    // [END formatting_whitespace_colon_generic_okay]
    {}
}

private fun horizontalColonGenericReturnWrong() {
    // [START formatting_whitespace_generic_return_wrong]
    // WRONG
    fun <T> max(a: T, b: T) where T: Comparable<T>
    // [END formatting_whitespace_generic_return_wrong]
    {}
}

private fun horizontalColonGenericReturnRight() {
    // [START formatting_whitespace_generic_return_okay]
    // Okay
    fun <T> max(a: T, b: T) where T : Comparable<T>
    // [END formatting_whitespace_generic_return_okay]
    {}
}

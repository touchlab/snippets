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

private fun expressionsSingleLine(string: String) {
    // [START formatting_expressions_single_line]
    val value = if (string.isEmpty()) 0 else 1  // Okay
    // [END formatting_expressions_single_line]
}

private fun expressionsDoubleLineWrong(string: String) {
    // [START formatting_expressions_double_line_wrong]
    val value = if (string.isEmpty())  // WRONG!
        0
    else
        1
    // [END formatting_expressions_double_line_wrong]

}

private fun expressionsDoubleLineRight(string: String) {
    // [START formatting_expressions_double_line_right]
    val value = if (string.isEmpty()) { // Okay
        0
    } else {
        1
    }
    // [END formatting_expressions_double_line_right]
}
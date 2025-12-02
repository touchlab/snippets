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

private const val DEFAULT_VALUE: String = ""
private fun braces(string: String, value: Int, otherParametersHere: String) {

    // [START formatting_braces__not_required]
    if (string.isEmpty()) return

    val result =
        if (string.isEmpty()) DEFAULT_VALUE else string

    when (value) {
        0 -> return
        // [START_EXCLUDE]
        else -> print("")
        // [END_EXCLUDE]
    }
    // [END formatting_braces__not_required]

    // [START formatting_braces__required]
    if (string.isEmpty())
        return  // WRONG!

    if (string.isEmpty()) {
        return  // Okay
    }

    if (string.isEmpty()) return  // WRONG
    else doLotsOfProcessingOn(string, otherParametersHere)

    if (string.isEmpty()) {
        return  // Okay
    } else {
        doLotsOfProcessingOn(string, otherParametersHere)
    }
    // [END formatting_braces__required]

}

private fun doLotsOfProcessingOn(string: String, otherParametersHere: String) {

}

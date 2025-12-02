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

import java.io.File
import java.nio.charset.Charset

private class EncodingRegistry {

    fun getDefaultCharsetForPropertiesFiles(file: File):Charset? = null

    companion object {
        fun getInstance(): EncodingRegistry = EncodingRegistry()
    }
}

private class Example(private val file: File) {

    // [START formatting_braces_properties]
    private val defaultCharset: Charset? =
        EncodingRegistry.getInstance().getDefaultCharsetForPropertiesFiles(file)
    // [END formatting_braces_properties]

    // [START formatting_braces_properties_set]
    var directory: File? = null
        set(value) {
            // …
        }
    // [END formatting_braces_properties_set]

    // [START formatting_braces_properties_get]
    val defaultExtension: String get() = "kt"
    // [END formatting_braces_properties_get]

}
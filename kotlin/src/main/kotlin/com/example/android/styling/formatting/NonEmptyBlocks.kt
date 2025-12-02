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

import java.lang.Exception

private class ProblemException : Exception()
private fun condition(): Boolean = true
private fun otherCondition(): Boolean = true
private fun foo() {}
private fun something() {}
private fun recover() {}
private fun somethingElse() {}
private fun lastThing() {}

private open class MyClass {
    open fun foo() {}
}

private fun firstExample(): Runnable {

    // [START braces_not_required]
    return Runnable {
        while (condition()) {
            foo()
        }
    }
    // [START_EXCLUDE]

}
private fun secondExample(): MyClass {
    // [END_EXCLUDE]

    return object : MyClass() {
        override fun foo() {
            if (condition()) {
                try {
                    something()
                } catch (e: ProblemException) {
                    recover()
                }
            } else if (otherCondition()) {
                somethingElse()
            } else {
                lastThing()
            }
        }
    }
    // [END braces_not_required]
}
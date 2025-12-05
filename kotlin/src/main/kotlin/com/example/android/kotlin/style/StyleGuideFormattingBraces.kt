package com.example.android.kotlin.style

import java.io.File
import java.nio.charset.Charset

private const val DEFAULT_VALUE = ""

private fun styleGuideFormattingBracesSingleLine(string: String, value: Int) {

    // [START android_style_guide_formatting_braces_single_line]
    if (string.isEmpty()) return

    val result =
        if (string.isEmpty()) DEFAULT_VALUE else string

    when (value) {
        0 -> return
        // [START_EXCLUDE]
        else -> return
        // [END_EXCLUDE]
    }
    // [END android_style_guide_formatting_braces_single_line]
}


private fun styleGuideFormattingBracesMultiLine(string: String, otherParametersHere: Int) {

    // [START android_style_guide_formatting_braces_multi_line]
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
    // [END android_style_guide_formatting_braces_multi_line]
}
private fun doLotsOfProcessingOn(string: String, otherParametersHere: Int) {}

private object StyleGuideFormattingBracesNonEmptyBlocks {

    open class MyClass { open fun foo() {} }

    private fun styleGuideFormattingBracesNonEmptyBlocksRunnable(): Runnable {
        // [START android_style_guide_formatting_braces_non_empty]
        return Runnable {
            while (condition()) {
                foo()
            }
        }
        // [START_EXCLUDE silent]
    }

    private fun styleGuideFormattingBracesNonEmptyBlocksMyClass(): MyClass {
        // [END_EXCLUDE silent]

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
        // [END android_style_guide_formatting_braces_non_empty]
    }

    class ProblemException : Exception()
    private fun condition(): Boolean = false
    private fun foo() {}
    private fun something() {}
    private fun recover() {}
    private fun otherCondition(): Boolean = true
    private fun somethingElse() {}
    private fun lastThing() {}
}

private fun doSomething(){}
private fun styleGuideFormattingBracesEmptyBlocks(){
    // [START android_style_guide_formatting_braces_empty_wrong]
    try {
        doSomething()
    } catch (e: Exception) {} // WRONG!
    // [END android_style_guide_formatting_braces_empty_wrong]

    // [START android_style_guide_formatting_braces_empty_okay]
    try {
        doSomething()
    } catch (e: Exception) {
    } // Okay
    // [END android_style_guide_formatting_braces_empty_okay]
}

private fun styleGuideFormattingBracesExpressionsSingle(string: String) {
    // [START android_style_guide_formatting_braces_expressions_single]
    val value = if (string.isEmpty()) 0 else 1  // Okay
    // [END android_style_guide_formatting_braces_expressions_single]
}

private fun styleGuideFormattingBracesExpressionsMultiWrong(string: String) {
    // [START android_style_guide_formatting_braces_expressions_multi_wrong]
    val value = if (string.isEmpty())  // WRONG!
        0
    else
        1
    // [END android_style_guide_formatting_braces_expressions_multi_wrong]
}

private fun styleGuideFormattingBracesExpressionsMultiOkay(string: String) {
    // [START android_style_guide_formatting_braces_expressions_multi_okay]
    val value = if (string.isEmpty()) { // Okay
        0
    } else {
        1
    }
    // [END android_style_guide_formatting_braces_expressions_multi_okay]
}

private object StyleGuideFormattingBracesFunctions {

    // [START android_style_guide_formatting_braces_functions]
    fun <T> Iterable<T>.joinToString(
        separator: CharSequence = ", ",
        prefix: CharSequence = "",
        postfix: CharSequence = ""
    ): String {
        // [START_EXCLUDE]
        return ""
        // [END_EXCLUDE]
    }
    // [END android_style_guide_formatting_braces_functions]

    private object ExpressionFunctionMulti {
        // [START android_style_guide_formatting_braces_expression_functions_multi]
        override fun toString(): String {
            return "Hey"
        }
        // [END android_style_guide_formatting_braces_expression_functions_multi]
    }

    private object ExpressionFunctionSingle {
        // [START android_style_guide_formatting_braces_expression_functions_single]
        override fun toString(): String = "Hey"
        // [END android_style_guide_formatting_braces_expression_functions_single]
    }
}

private class StyleGuideFormattingBracesProperties(file: File) {
    private class EncodingRegistry {
        fun getDefaultCharsetForPropertiesFiles(file: File): Charset? = null
        companion object {
            fun getInstance(): EncodingRegistry = EncodingRegistry()
        }
    }

    // [START android_style_guide_formatting_braces_properties_single]
    private val defaultCharset: Charset? =
        EncodingRegistry.getInstance().getDefaultCharsetForPropertiesFiles(file)
    // [END android_style_guide_formatting_braces_properties_single]

    // [START android_style_guide_formatting_braces_properties_set]
    var directory: File? = null
        set(value) {
            // [START_EXCLUDE]
            print("")
            // [END_EXCLUDE]
        }
    // [END android_style_guide_formatting_braces_properties_set]

    // [START android_style_guide_formatting_braces_properties_read_only]
    val defaultExtension: String get() = "kt"
    // [END android_style_guide_formatting_braces_properties_read_only]
}

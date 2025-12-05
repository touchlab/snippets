package com.example.android.styling

import com.example.android.kotlin.style.Disposable
import org.junit.Test

class StyleGuideFormattingTest {

    // [START android_style_guide_formatting_special_constructs_annotations_test]
    @Volatile
    var disposable: Disposable? = null

    @Test
    fun selectAll() {
        // [START_EXCLUDE]
        print("")
        // [END_EXCLUDE]
    }
    // [END android_style_guide_formatting_special_constructs_annotations_test]

    // [START android_style_guide_formatting_naming_function_test]
    @Test fun pop_emptyStack() {
        // [START_EXCLUDE]
        print("")
        // [END_EXCLUDE]
    }
    // [END android_style_guide_formatting_naming_function_test]

    // [START android_style_guide_formatting_naming_spaces_test_wrong]
    // WRONG!
    fun `test every possible case`() {}
    // [END android_style_guide_formatting_naming_spaces_test_wrong]

    // [START android_style_guide_formatting_naming_spaces_test_okay]
    // OK
    fun testEveryPossibleCase() {}
    // [END android_style_guide_formatting_naming_spaces_test_okay]
}
package com.example.android.styling

import androidx.compose.runtime.Composable
import java.util.logging.Logger

// [START android_style_guide_formatting_naming_composable]
@Composable
fun NameTag(name: String) {
    // [START_EXCLUDE]
    print("")
    // [END_EXCLUDE]
}
// [END android_style_guide_formatting_naming_composable]

object ConstantNames {

    object Joiner {
        fun on(char: Char){}
    }

    class MyClass
    private val mutableInstance = ""
    private val mutableInstance2 = ""

    // [START android_style_guide_formatting_naming_constants]
    const val NUMBER = 5
    val NAMES = listOf("Alice", "Bob")
    val AGES = mapOf("Alice" to 35, "Bob" to 32)
    val COMMA_JOINER = Joiner.on(',') // Joiner is immutable
    val EMPTY_ARRAY = emptyArray<String>()
    // [END android_style_guide_formatting_naming_constants]

    // [START android_style_guide_formatting_naming_non_constants]
    val variable = "var"
    val nonConstScalar = "non-const"
    val mutableCollection: MutableSet<String> = HashSet()
    val mutableElements = listOf(mutableInstance)
    val mutableValues = mapOf("Alice" to mutableInstance, "Bob" to mutableInstance2)
    val logger = Logger.getLogger(MyClass::class.java.name)
    val nonEmptyArray = arrayOf("these", "can", "change")
    // [END android_style_guide_formatting_naming_non_constants]


    // [START android_style_guide_formatting_naming_backing]
    private var _table: Map<String, Int>? = null

    val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap()
            }
            return _table ?: throw AssertionError()
        }
    // [END android_style_guide_formatting_naming_backing]
}


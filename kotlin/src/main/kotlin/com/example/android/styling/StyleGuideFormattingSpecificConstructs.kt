package com.example.android.styling

import android.graphics.drawable.Icon
import kotlin.annotation.AnnotationRetention.*
import kotlin.annotation.AnnotationTarget.*


private object SpecificConstructsEnum {
    // [START android_style_guide_formatting_special_constructs_enum]
    enum class Answer { YES, NO, MAYBE }
    // [END android_style_guide_formatting_special_constructs_enum]
}


private class SpecificConstructsEnumSeparate {
    // [START android_style_guide_formatting_special_constructs_enum_separate]
    enum class Answer {
        YES,
        NO,

        MAYBE {
            override fun toString() = """¯\_(ツ)_/¯"""
        }
    }
    // [END android_style_guide_formatting_special_constructs_enum_separate]
}




// [START android_style_guide_formatting_special_constructs_annotations_construct]
@Retention(SOURCE)
@Target(FUNCTION, PROPERTY_SETTER, FIELD)
annotation class Global
// [END android_style_guide_formatting_special_constructs_annotations_construct]

private class SpecificConstructsAnnotations {
    // [START android_style_guide_formatting_special_constructs_annotations_var]
    @JvmField @Volatile
    var disposable: Disposable? = null
    // [END android_style_guide_formatting_special_constructs_annotations_var]
}

private class SpecificConstructsAnnotationSingle {
    // [START android_style_guide_formatting_special_constructs_annotations_single]
    @field:[JvmStatic Volatile]
    var disposable: Disposable? = null
    // [END android_style_guide_formatting_special_constructs_annotations_single]

}

private object ImplicitReturnPropertyBefore {
    // [START android_style_guide_formatting_special_constructs_implicit_string]
    override fun toString(): String = "Hey"
    // [END android_style_guide_formatting_special_constructs_implicit_string]

    // [START android_style_guide_formatting_special_constructs_implicit_icon]
    private val ICON: Icon = IconLoader.getIcon("/icons/kotlin.png")
    // [END android_style_guide_formatting_special_constructs_implicit_icon]

}

private object ImplicitReturnPropertyAfter {
    // [START android_style_guide_formatting_special_constructs_implicit_string_after]
    // becomes
    override fun toString() = "Hey"
    // [END android_style_guide_formatting_special_constructs_implicit_string_after]

    // [START android_style_guide_formatting_special_constructs_implicit_icon_after]
    // becomes
    private val ICON = IconLoader.getIcon("/icons/kotlin.png")
    // [END android_style_guide_formatting_special_constructs_implicit_icon_after]
}

class IconLoader {
    fun getIcon(location: String): Icon = TODO()
}
class Disposable
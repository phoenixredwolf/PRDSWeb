package com.phoenixredwolf.web.util

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Theme
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

object Constants {
    const val SECTION_WIDTH = 1920
    const val FONT_FAMILY = "Roboto"
    const val LOREMTEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    const val LINKEDIN = "https://www.linkedin.com/company/phoenixredwolf"
    const val FACEBOOK = "https://www.facebook.com/PhoenixRedwolfDigitalSolutions"
}

object Res{
    object Image {
        const val logo = "PRDSLogo.svg"
        const val icon = "PRDSIcon.svg"
        const val collaboration = "collaboration-600x340.jpg"
        const val corporate = "corporate-600x434.jpg"
        const val empower = "empower-600x394.jpg"
        const val solution = "solutions-600x360.jpg"
        const val success = "success-600x344.jpg"
    }
}

@Composable
fun Name(string: String) {
    Span(
        attrs = Modifier.color(Theme.Tertiary.rgb).fontWeight(FontWeight.SemiBold).toAttrs()
    ){
        Text(string)
    }
}
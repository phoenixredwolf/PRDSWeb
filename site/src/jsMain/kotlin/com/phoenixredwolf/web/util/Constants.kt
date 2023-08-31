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
        const val logo = "/images/PRDSLogo.svg"
        const val logo2 = "/images/PRDSLogo2.svg"
        const val icon = "/images/PRDSIcon.svg"
        const val collaboration = "/images/collaboration-600x340.jpg"
        const val corporate = "/images/corporate-600x434.jpg"
        const val empower = "/images/empower-600x394.jpg"
        const val solution = "/images/solutions-600x360.jpg"
        const val success = "/images/success-600x344.jpg"
        const val cloud = "/images/cloudbase2.jpg"
        const val webdev = "/images/webdev.png"
        const val softdev = "/images/softdev.jpg"
        const val netAdmin = "/images/networkAdmin.jpg"
        const val tag1 = "/images/tagline1.svg"
        const val tag2 = "/images/tagline2.svg"
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
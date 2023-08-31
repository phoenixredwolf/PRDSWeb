package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.styles.IndexPageButtonStyle
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button

@Composable
fun NavButton(text:String, path: String) {
    Button(
        attrs = IndexPageButtonStyle.toModifier()
            .borderRadius(r = 5.px)
            .color(Theme.OnSecondary.rgb)
            .toAttrs()
    ) {
        Link(
            modifier = Modifier
                .color(Theme.OnSecondary.rgb)
                .fontWeight(FontWeight.SemiBold)
                .fontSize(FontSize.Large)
                .textDecorationLine(TextDecorationLine.None),
            text = text,
            path = path
        )
    }
}
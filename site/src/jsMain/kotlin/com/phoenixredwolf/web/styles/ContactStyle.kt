package com.phoenixredwolf.web.styles

import com.phoenixredwolf.web.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.focus
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val InputStyle by ComponentStyle {
    base {
        Modifier
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = Theme.LightGray.rgb
            )
            .boxShadow(0.px, 0.px, 0.px, 0.px, null)
            .backgroundColor(Theme.Surface.rgb)
            .transition(CSSTransition(property = "border", duration = 200.ms))
    }
    focus {
        Modifier
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = Theme.Primary.rgb
            )
    }
    hover {
        Modifier
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = Theme.Primary.rgb
            )
            .boxShadow(0.px, 0.px, 0.px, 0.px, null)
            .backgroundColor(Theme.Surface.rgb)
    }
}

val MainButtonStyle by ComponentStyle {
    base {
        Modifier
            .width(100.px)
            .height(40.px)
            .border(width = 0.px)
            .borderRadius(r = 5.px)
            .backgroundColor(Theme.Primary.rgb)
            .color(Colors.White)
            .cursor(Cursor.Pointer)
            .transition(CSSTransition(property = "width", duration = 200.ms))
    }
    hover {
        Modifier
            .width(120.px)
    }
}
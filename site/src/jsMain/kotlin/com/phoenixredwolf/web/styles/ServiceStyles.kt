package com.phoenixredwolf.web.styles

import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val ServicesStyle by ComponentStyle {
    base {
        Modifier
            .fontSize(18.px)
            .transition(CSSTransition(property = "fontSize", duration = 2000.ms))
    }
    hover {
        Modifier
            .fontSize(25.px)
    }
}
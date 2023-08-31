package com.phoenixredwolf.web.styles

import com.phoenixredwolf.web.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.anyLink
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*

val SocialLinkStyle by ComponentStyle {
    base {
        Modifier
            .color(Theme.Gray.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    hover {
        Modifier.color(Theme.Primary.rgb)
    }
}

@OptIn(ExperimentalComposeWebApi::class)
val LogoStyle by ComponentStyle {
    base {
        Modifier
            .transform { rotate(0.deg) }
            .transition(CSSTransition(property = "transform", duration = 200.ms))
    }
    hover {
        Modifier
            .transform { rotate(-10.deg) }
    }
}

val NavigationItemStyle by ComponentStyle {
    base {
        Modifier
            .color(Theme.OnPrimary.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(Theme.Primary.rgb)
    }
    hover {
        Modifier.color(Theme.Secondary.rgb)
    }
}

val FooterItemStyle by ComponentStyle {
    base {
        Modifier
            .color(Theme.OnPrimary.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(Theme.OnPrimary.rgb)
    }
    hover {
        Modifier.color(Theme.OnSecondary.rgb)
    }
}

val SectionMenuStyle by ComponentStyle {
    base {
        Modifier
            .color(Theme.OnSecondaryContainer.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(Theme.OnSecondaryContainer.rgb)
    }
    hover {
        Modifier.color(Theme.Error.rgb)
    }
}

val IndexPageButtonStyle by ComponentStyle {
    base {
        Modifier
            .width(50.percent)
            .height(40.px)
            .backgroundColor(Theme.Secondary.rgb)
            .transition(
                CSSTransition(property = "width", duration = 200.ms),
                CSSTransition(property = "backgroundColor", duration = 200.ms),
                CSSTransition(property = "height", duration = 200.ms)
            )
    }
    hover {
        Modifier
            .width(60.percent)
            .height(45.px)
            .backgroundColor(Theme.Primary.rgb)
    }
}

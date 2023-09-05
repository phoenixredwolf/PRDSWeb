package com.phoenixredwolf.web.styles

import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.theme.*
import com.phoenixredwolf.web.util.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
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
        Modifier.color(primaryLight)
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


val FooterItemStyle by ComponentStyle {
    base {
        Modifier
            .color(onPrimaryLight)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(onPrimaryLight)
    }
    hover {
        Modifier.color(onSecondaryLight)
    }
}

val SectionMenuStyle by ComponentStyle {
    base {
        Modifier
            .color(onSecondaryContainerLight)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(onSecondaryContainerLight)
    }
    hover {
        Modifier.color(errorLight)
    }
}

val IndexPageButtonStyle by ComponentStyle {
    base {
        Modifier
            .width(50.percent)
            .height(40.px)
            .backgroundColor(primaryContainerDark)
            .textDecorationLine(TextDecorationLine.None)
            .color(onPrimaryContainerDark)
            .fontSize(FontSize.Large)
            .fontWeight(FontWeight.SemiBold)
            .transition(
                CSSTransition(property = "width", duration = 200.ms),
                CSSTransition(property = "backgroundColor", duration = 200.ms),
                CSSTransition(property = "height", duration = 200.ms)
            )
    }
    anyLink{
        Modifier
            .color(onPrimaryContainerDark)
            .transition(
                CSSTransition(property = "backgroundColor", duration = 200.ms),
                CSSTransition(property = "color", duration = 200.ms)
            )
    }
    hover {
        Modifier
            .width(60.percent)
            .height(45.px)
            .textDecorationLine(TextDecorationLine.None)
            .backgroundColor(secondaryContainerDark)
            .color(onSecondaryContainerDark)
    }
}

val DropDownStyle by ComponentStyle {
    base {
        Modifier
            .visibility(Visibility.Hidden)
            .transition(
                CSSTransition(property = "visibility", duration = 200.ms)
            )
    }
    hover {
        Modifier.visibility(Visibility.Visible)
    }
}

val BackgroundLogoStyle by ComponentStyle {
    base {
        Modifier
            .styleModifier { backgroundImage(Res.Image.icon) }
//            .opacity(0.5)
    }
}

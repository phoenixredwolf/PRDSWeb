package com.phoenixredwolf.web.styles

import com.phoenixredwolf.web.theme.headerBackground
import com.phoenixredwolf.web.theme.onPrimaryContainerLight
import com.phoenixredwolf.web.theme.surfaceLight
import com.phoenixredwolf.web.theme.tertiaryContainerDark
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.JustifyContent
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.*
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*

val NavHeaderStyle by ComponentStyle.base(extraModifiers = { SmoothColorStyle.toModifier() }) {
    Modifier
        .fillMaxWidth()
        .backgroundImage(headerBackground)
}

val NavigationItemStyle by ComponentStyle {
    base {
        Modifier
            .color(onPrimaryContainerLight)
            .textDecorationLine(TextDecorationLine.None)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(onPrimaryContainerLight)
    }
    hover {
        Modifier.color(tertiaryContainerDark)
            .textDecorationLine(TextDecorationLine.None)
    }
}

@OptIn(ExperimentalComposeWebApi::class)
val NavStyle by ComponentStyle {
    base {
        Modifier
            .fillMaxWidth()
            .display(DisplayStyle.Flex)
            .fontWeight(FontWeight.SemiBold)
            .fontSize(FontSize.Large)
            .justifyContent(JustifyContent.SpaceBetween)
    }
    cssRule(" .nav-bar") {
        Modifier
            .display(DisplayStyle.Flex)
    }
    cssRule(" .nav-bar .nav-bar_item") {
        Modifier
            .listStyle(ListStyleType.None)
            .borderRadius(r = 10.px)
            .padding(leftRight =  20.px)
    }
    cssRule(" .nav-bar .nav-bar_item .dropdown") {
        Modifier
            .position(Position.Absolute)
            .display(DisplayStyle.None)
            .top(100.percent)
            .right(0.px)
            .overflowY(Overflow.Hidden)
    }
    cssRule(" .nav-bar .dropdown:after") {
        Modifier
            .content("")
            .position(Position.Absolute)
            .right(9.px)
            .top(8.px)
            .cursor(Cursor.Pointer)
            .transform { rotate((-45).deg) }
            .borderLeft(2.px, LineStyle.Solid, Colors.Black)
            .borderBottom(2.px, LineStyle.Solid, Colors.Black)
            .transition(CSSTransition("all", 0.2.s, TransitionTimingFunction.EaseIn))
            .size(7.px)
    }
    cssRule(" .nav-bar .dropdown:hover:after") {
        Modifier
            .transform { rotate(135.deg) }
    }
    cssRule(" .nav-bar .dropdown .services") {
        Modifier
            .position(Position.Absolute)
            .right(0.px)
            .width(Width.MaxContent)
            .backgroundColor(surfaceLight)
            .padding(5.px)
            .borderRadius(10.px)
            .height(0.px)
            .overflow(Overflow.Hidden)
            .visibility(Visibility.Hidden)
            .transition(CSSTransition("all", 0.2.s, TransitionTimingFunction.EaseIn))
    }
    cssRule(" .nav-bar .dropdown:hover .services") {
        Modifier
            .height(Height.MinContent)
            .margin(top = 65.px)
            .visibility(Visibility.Visible)
            .overflow(Overflow.Hidden)
    }
    cssRule(" .services .drop-item") {
        Modifier
            .top(100.percent)
            .margin(bottom = 10.px)
    }
}

val Dropdowncardstyle by ComponentStyle {
    base {
        Modifier
            .backgroundColor(surfaceLight)
            .border(0.px)
            .margin(topBottom = 5.px)
            .borderRadius(10.px)
            .height(Height.MinContent)
            .padding(10.px)
            .fillMaxWidth()
            .transition(
                CSSTransition(property = "backgroundColor", duration = 500.ms),
                CSSTransition(property = "boxShadow", duration = 500.ms)
            )
    }
    hover {
        Modifier
            .boxShadow(3.px, 3.px, color = Colors.DarkGray)
    }
}

val GridStyle by ComponentStyle {
    base {
        Modifier
            .display(DisplayStyle.Grid)
            .gridTemplateRows {
                size(48.px)
                size(0.fr)
            }
            .transition(CSSTransition("all", 300.ms))
    }
    cssRule("bottom") {
        Modifier
            .visibility(Visibility.Hidden)
    }
    cssRule(":has(.top:hover)") {
        Modifier
            .gridTemplateRows {
                size(48.px)
                size(1.fr)
            }
            .visibility(Visibility.Visible)
    }
}

val NavButtonVariant by NavStyle.addVariant {
    base { Modifier.padding(0.px).borderRadius(50.percent) }
}
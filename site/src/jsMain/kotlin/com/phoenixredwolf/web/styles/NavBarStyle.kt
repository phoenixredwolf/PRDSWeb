package com.phoenixredwolf.web.styles

import com.phoenixredwolf.web.models.Theme
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.JustifyContent
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*

@OptIn(ExperimentalComposeWebApi::class)
val NavStyle by ComponentStyle {
    base {
        Modifier
            .fillMaxWidth()
            .display(DisplayStyle.Flex)
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
    cssRule(" .nav-bar .dropdown") {
        Modifier
            .position(Position.Relative)
    }
    cssRule(" .nav-bar .dropdown:after") {
        Modifier
            .content("")
            .position(Position.Absolute)
            .right(10.px)
            .top(5.px)
            .cursor(Cursor.Pointer)
            .transform { rotate((-45).deg) }
            .borderLeft(2.px, LineStyle.Solid, Colors.Black)
            .borderBottom(2.px, LineStyle.Solid, Colors.Black)
            .transition(CSSTransition("all", 0.2.s, TransitionTimingFunction.EaseInOut))
            .size(7.px)
    }
    cssRule(" .nav-bar .dropdown:hover:after") {
        Modifier
            .transform { rotate(135.deg) }
    }
    cssRule(" .nav-bar .dropdown .services") {
        Modifier
            .position(Position.Absolute)
            .transform {
//                translateX()
//                translateY()
                translate3d((-500).px,5.px,(-5).px)
            }
            .zIndex(-0.1)
            .width(Width.MaxContent)
            .backgroundColor(Colors.White)
            .padding(20.px)
            .borderRadius(10.px)
            .height(0.px)
            .overflow(Overflow.Hidden)
            .visibility(Visibility.Hidden)
            .transition(CSSTransition("all", 0.2.s, TransitionTimingFunction.EaseInOut))
    }
    cssRule(" .nav-bar .dropdown:hover .services") {
        Modifier
            .height(Height.MinContent)
            .margin(top = 70.px)
            .visibility(Visibility.Visible)
    }
//    cssRule(" .nav-bar .dropdown .services .drop-item") {
//        Modifier
//            .listStyle(ListStyleType.None)
//            .margin(bottom = 10.px)
//    }
    cssRule(" .nav-bar .nav-bar_item a") {
        Modifier
            .position(Position.Relative)
            .display(DisplayStyle.Block)
            .textDecorationLine(TextDecorationLine.None)
            .padding(bottom = 5.px)
    }
    cssRule(" .nav-bar .nav-bar_item a:after") {
        Modifier
            .content("")
            .position(Position.Absolute)
            .width(0.percent)
            .height(2.px)
            .bottom(0.px)
            .left(0.px)
            .transition(CSSTransition("all", 0.1.s, TransitionTimingFunction.EaseInOut))
    }
//    cssRule(" .nav-bar .nav-bar_item a:hover:after") {
//        Modifier
//            .fillMaxWidth()
//    }
}

val Dropdowncardstyle by ComponentStyle {
    base {
        Modifier
            .backgroundColor(Colors.White)
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
            .backgroundColor(Theme.LightGray.rgb)
            .boxShadow(offsetX = 2.px, offsetY = 2.px, color = Theme.Gray.rgb)
    }
}

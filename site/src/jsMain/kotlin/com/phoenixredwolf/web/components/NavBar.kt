package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.styles.NavStyle
import com.phoenixredwolf.web.styles.NavigationItemStyle
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun NavBar() {
    Row(
        modifier = NavStyle.toModifier()
//            .backgroundImage(
//                linearGradient(LinearGradient.Direction.ToBottomRight, Colors.White, Theme.Primary.rgb)
//            )
            .padding(topBottom = 10.px),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(90.percent),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Ul(
                attrs = NavStyle.toModifier()
                    .classNames("nav-bar")
                    .borderRadius(r = 20.px)
                    .fillMaxWidth(40.percent)
                    .toAttrs()
            ) {
                Li(
                    attrs = NavStyle.toModifier()
                        .attrsModifier {
                            attr("class", "nav-bar nav-bar_item")
                        }
                        .toAttrs()
                ){
                    Link(
                        path = "/",
                        text = "Home",
                        modifier = NavigationItemStyle.toModifier()
                    )
                }
                Li(
                    attrs = NavStyle.toModifier()
                        .attrsModifier {
                            attr("class", "nav-bar nav-bar_item")
                        }
                        .toAttrs()
                ){
                    Link(
                        path = "/about",
                        text = "About",
                        modifier = NavigationItemStyle.toModifier()
                    )
                }
                Li(
                    attrs = NavStyle.toModifier()
                        .attrsModifier {
                            attr("class", "nav-bar nav-bar_item dropdown")
                        }
                        .toAttrs()
                ) {
                    A(
                        attrs = NavStyle.toModifier()
                            .toAttrs()
                    ) {
                        Text("Services")
                    }
                    Ul(
                        attrs = NavStyle.toModifier()
                            .attrsModifier {
                                attr("class", "services")
                            }
                            .width(Width.MaxContent)
                            .toAttrs()
                    ) {
                        Li(
                            attrs = NavStyle.toModifier()
                                .classNames("drop-item")
                                .width(Width.FitContent)
                                .toAttrs()
                        ){
                            Link(
                                path = "/services/web",
                                text = "Web Development",
                                modifier = NavigationItemStyle.toModifier()
                            )
                        }
                        Li(
                            attrs = NavStyle.toModifier()
                                .classNames("drop-item")
                                .toAttrs()
                        ){
                            Link(
                                path = "/services/software",
                                text = "Software Development",
                                modifier = NavigationItemStyle.toModifier()
                            )
                        }
                    }
                }
                Li(
                    attrs = NavStyle.toModifier()
                        .attrsModifier {
                            attr("class", "nav-bar nav-bar_item")
                        }
                        .borderRadius(r = 20.px)
                        .padding(right = 20.px)
                        .toAttrs()
                ){
                    Link(
                        path = "/contact",
                        text = "Contact Us",
                        modifier = NavigationItemStyle.toModifier()
                    )
                }
            }
        }
    }
}

@Composable
fun NavBar2() {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth(90.percent),
//        horizontalArrangement = Arrangement.End,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
        Ul(
            attrs = NavStyle.toModifier()
                .classNames("nav-bar")
                .borderRadius(r = 20.px)
                .fillMaxWidth(40.percent)
                .toAttrs()
        ) {
            Li(
                attrs = NavStyle.toModifier()
                    .attrsModifier {
                        attr("class", "nav-bar nav-bar_item")
                    }
                    .toAttrs()
            ) {
                Link(
                    path = "/",
                    text = "Home",
                    modifier = NavigationItemStyle.toModifier()
                )
            }
            Li(
                attrs = NavStyle.toModifier()
                    .attrsModifier {
                        attr("class", "nav-bar nav-bar_item")
                    }
                    .toAttrs()
            ) {
                Link(
                    path = "/about",
                    text = "About",
                    modifier = NavigationItemStyle.toModifier()
                )
            }
            Li(
                attrs = NavStyle.toModifier()
                    .attrsModifier {
                        attr("class", "nav-bar nav-bar_item dropdown")
                    }
                    .toAttrs()
            ) {
                A(
                    attrs = NavStyle.toModifier()
                        .toAttrs()
                ) {
                    Text("Services")
                }
                Div(
                    attrs = NavStyle.toModifier()
                        .attrsModifier {
                            attr("class", "services")
                        }
                        .width(Width.MaxContent)
                        .toAttrs()
                ) {
                    Div(
                        attrs = NavStyle.toModifier()
                            .classNames("drop-item")
                            .width(Width.FitContent)
                            .toAttrs()
                    ) {
                        ServicesDropdown()
                    }
                }
            }
            Li(
                attrs = NavStyle.toModifier()
                    .attrsModifier {
                        attr("class", "nav-bar nav-bar_item")
                    }
                    .borderRadius(r = 20.px)
                    .padding(right = 20.px)
                    .toAttrs()
            ) {
                Link(
                    path = "/contact",
                    text = "Contact Us",
                    modifier = NavigationItemStyle.toModifier()
                )
            }
        }
//    }
}
package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.styles.GridStyle
import com.phoenixredwolf.web.styles.NavStyle
import com.phoenixredwolf.web.styles.NavigationItemStyle
import com.varabyte.kobweb.compose.css.Cursor
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
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*


@Composable
fun NavBar() {
    Row(
        modifier = NavStyle.toModifier()
            .classNames("nav-bar")
            .borderRadius(r = 20.px)
            .width(Width.FitContent)
    ) {
        Div(
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
        Div(
            attrs = NavStyle.toModifier()
                .attrsModifier {
                    attr("class", "nav-bar nav-bar_item dropdown")
                }
                .toAttrs()
        ) {
            A(
                attrs = NavigationItemStyle.toModifier()
                    .cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Text("Services")
            }
            Div(
                attrs = NavStyle.toModifier()
                    .attrsModifier {
                        attr("class", "services")
                    }
                    .toAttrs()
            ) {
                Div(
                    attrs = Modifier
                        .attrsModifier {
                            attr("class", "drop-item")
                        }
                        .width(Width.FitContent)
                        .toAttrs()
                ) {
                    ServicesDropdown()
                }
            }
        }
        Div(
            attrs = NavStyle.toModifier()
                .attrsModifier {
                    attr("class", "nav-bar nav-bar_item dropdown")
                }
                .toAttrs()
        ) {
            A(
                attrs = NavigationItemStyle.toModifier()
                    .cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Text("Consulting")
            }
            Div(
                attrs = NavStyle.toModifier()
                    .attrsModifier {
                        attr("class", "services")
                    }
                    .toAttrs()
            ) {
                Div(
                    attrs = Modifier
                        .attrsModifier {
                            attr("class", "drop-item")
                        }
                        .width(Width.FitContent)
                        .toAttrs()
                ) {
                    ConsultDropdown()
                }
            }
        }
        Div(
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
        Div(
            attrs = NavStyle.toModifier()
                .attrsModifier {
                    attr("class", "nav-bar nav-bar_item")
                }
                .borderRadius(r = 20.px)
                .padding(leftRight = 20.px)
                .toAttrs()
        ) {
            Link(
                path = "/contact",
                text = "Contact Us",
                modifier = NavigationItemStyle.toModifier()
            )
        }
    }
}

@Composable
fun NavBar2() {
    Row(
        modifier = GridStyle.toModifier().classNames("grid"),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = GridStyle.toModifier().classNames("top")
        ) { Text("Services") }
        Row(
            modifier = GridStyle.toModifier().classNames("bottom")
        ) {
            Select {
                Option(
                    value = "Services",
                    content = { Text("Services") }
                )
                Option(
                    value = "Services",
                    content = { Text("Services") }
                )
            }
        }
    }
}



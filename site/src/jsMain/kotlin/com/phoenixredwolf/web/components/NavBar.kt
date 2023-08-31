package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.styles.NavigationItemStyle
import com.phoenixredwolf.web.util.Res
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun NavBar() {
    Row(
        modifier = NavigationItemStyle.toModifier()
            .classNames("headerBackground")
            .color(Theme.Primary.rgb)
            .fillMaxWidth()
            .padding(top = 50.px),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Nav(
            attrs = Modifier
                .fillMaxWidth(90.percent)
                .attrsModifier {
                    attr("class", "navbar navbar-expand-lg navbar-light")
                }

                .toAttrs()
        ) {
            Row(
                modifier = Modifier
                    .classNames("container-fluid")
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Link(
                    modifier = Modifier
                        .classNames("navbar-brand"),
                    path = "/",
                    content = {
                        Image(
                            src = Res.Image.logo
                        )
                    }
                )
                Div(
                    attrs = Modifier
                        .id("navbarSupportedContent")
                        .attrsModifier {
                            attr("class", "collapse navbar-collapse")
                        }
                        .fillMaxWidth()
                        .toAttrs()
                ) {
                    Ul(
                        attrs = Modifier
                            .attrsModifier {
                                attr("class", "nav nav-fill")
                            }
                            .toAttrs()
                    ){
                        Li(
                            attrs = Modifier
                                .classNames("nav-item")
                                .toAttrs()
                        ) {
                            Link(
                                path = "/about",
                                modifier = Modifier
                                    .attrsModifier {
                                        attr("class", "nav-link")
                                    },
                                text = "Who we are"
                            )
                        }
                        Li(
                            attrs = Modifier
                                .attrsModifier {
                                    attr("class", "nav-item dropdown")
                                }
                                .toAttrs()
                        ) {
                            A(
                                attrs = Modifier
                                    .id("navbarDropdown")
                                    .role("button")
                                    .attrsModifier {
                                        attr("class", "nav-link dropdown-toggle")
                                        attr("data-bs-toggle", "dropdown")
                                        attr("aria-expanded", "false")
                                    }
                                    .toAttrs()
                            ) {
                                Text("Services")
                            }
                            Ul(
                                attrs = Modifier
                                    .classNames("dropdown-menu")
                                    .attrsModifier {
                                        attr("aria-labelledby", "navbarDropdown")
                                    }
                                    .toAttrs()
                            ) {
                                Li {
                                    Link(
                                        path = "/services/web",
                                        text = "Web Development"
                                    )
                                }
                                Li {
                                    Link(
                                        path = "/services/software",
                                        text = "Software Development"
                                    )
                                }
                                Li {
                                    Link(
                                        path = "/services",
                                        text = "Other Services"
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
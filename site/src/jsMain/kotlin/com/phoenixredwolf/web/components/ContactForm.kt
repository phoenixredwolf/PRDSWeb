package com.phoenixredwolf.web.components

import androidx.compose.runtime.*
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.styles.InputStyle
import com.phoenixredwolf.web.styles.MainButtonStyle
import com.phoenixredwolf.web.util.phoneMask
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.VerticalAlign
import com.varabyte.kobweb.compose.css.verticalAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun ContactForm(breakpoint: Breakpoint) {
    val options = listOf("Phone", "Email")
    var expanded by remember { mutableStateOf(false) }
    var selectedOptionText by remember { mutableStateOf(options[1]) }
    phoneMask()
    Form(
        action = "https://formspree.io/f/mdorgnrv",
        attrs = Modifier
            .borderRadius(r=8.px)
            .backgroundColor(Theme.LightGray.rgb)
            .margin(20.px)
            .attrsModifier {
                attr("method", "post")
            }
            .toAttrs()
    ) {
        Column(
            modifier = Modifier
                .margin(20.px)
        ) {
            Label(
                attrs = Modifier
                    .classNames("form-label")
                    .toAttrs(),
                forId = "inputName"
            ) {
                Text("Name ")
                Span(
                    attrs = Modifier
                        .color(Theme.Error.rgb)
                        .styleModifier {
                            verticalAlign(VerticalAlign.Top)
                        }
                        .fontSize(FontSize.XXSmall)
                        .toAttrs()
                ){
                    Text("* required")
                }
            }
            Input(
                type = InputType.Text,
                attrs = InputStyle.toModifier()
                    .id("inputName")
                    .classNames("form-control")
                    .margin(10.px)
                    .width(
                        if (breakpoint >= Breakpoint.MD) 500.px else 250.px
                    )
                    .attrsModifier {
                        attr("placeholder", "Full Name")
                        attr("required", "true")
                        attr("name", "Name")
                    }
                    .toAttrs()
            )
            Label(
                attrs = Modifier
                    .classNames("form-label")
                    .toAttrs(),
                forId = "inputEmail"
            ) {
                Text("Email")
            }
            Input(
                type = InputType.Email,
                attrs = InputStyle.toModifier()
                    .id("inputEmail")
                    .classNames("form-control")
                    .margin(10.px)
                    .width(
                        if (breakpoint >= Breakpoint.MD) 500.px else 250.px
                    )
                    .attrsModifier {
                        attr("placeholder", "Email Address")
                        attr("required", "true")
                        attr("name", "Email")
                    }
                    .toAttrs()
            )
            Label(
                attrs = Modifier
                    .classNames("form-label")
                    .toAttrs(),
                forId = "inputPhone"
            ) {
                Text("Phone")
            }
            Input(
                type = InputType.Tel,
                attrs = InputStyle.toModifier()
                    .id("inputPhone")
                    .classNames("form-control")
                    .margin(10.px)
                    .width(
                        if (breakpoint >= Breakpoint.MD) 500.px else 250.px
                    )
                    .onKeyDown {
                        phoneMask()
                    }
                    .attrsModifier {
                        attr("placeholder", "(###) ###-####")
                        attr("required", "true")
                        attr("name", "Phone")
                    }
                    .toAttrs(),
            )
            Label(
                attrs = Modifier
                    .classNames("form-label")
                    .toAttrs(),
                forId = "inputMessage"
            ) {
                Text("Message")
            }
            TextArea(
                attrs = InputStyle.toModifier()
                    .id("inputMessage")
                    .classNames("form-control")
                    .margin(10.px)
                    .height(150.px)
                    .width(
                        if (breakpoint >= Breakpoint.MD) 500.px else 250.px
                    )
                    .attrsModifier {
                        attr("placeholder", "Your Message")
                        attr("required", "true")
                        attr("name", "Message")
                    }
                    .toAttrs()
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    attrs = MainButtonStyle.toModifier()
                        .attrsModifier {
                            attr("type", "submit")
                        }
                        .toAttrs()
                ) {
                    Text("Submit")
                }
                Button(
                    attrs = MainButtonStyle.toModifier()
                        .attrsModifier {
                            attr("type", "reset")
                        }
                        .toAttrs()
                ) {
                    Text("Reset")
                }

            }
        }
    }

}



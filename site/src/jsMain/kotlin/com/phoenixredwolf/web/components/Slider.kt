package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Theme
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Slider(width: CSSNumeric) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 30.px),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Div(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "carousel slide carousel-fade")
                    attr("data-bs-ride", "carousel")
                }
                .width(width)
                .toAttrs()
        ) {
            Div(
                attrs = Modifier
                    .classNames("carousel-inner")
                    .boxShadow(3.px, 3.px, color = Colors.DarkGray)
                    .borderRadius(r = 20.px)
                    .toAttrs()
            ) {
                 Div(
                     attrs = Modifier
                         .attrsModifier {
                             attr("class", "carousel-item active")
                         }
                         .toAttrs()
                 ) {
                     Div(
                         attrs = Modifier
                             .attrsModifier {
                                 attr("class", "d-block w-100")
                             }
                             .toAttrs()
                     ) {
                         Div(
                             attrs = Modifier
                                 .classNames("card")
                                 .height(200.px)
                                 .borderRadius(r = 20.px)
                                 .toAttrs()
                         ) {
                             Div(
                                 attrs = Modifier
                                     .attrsModifier {
                                         attr("class", "card-header")
                                     }
                                     .backgroundColor(Theme.Primary.rgb)
                                     .borderRadius(topLeft = 20.px, topRight = 20.px)
                                     .toAttrs()
                             ) {
                                 H5(
                                     attrs = Modifier
                                         .classNames("card-title")
                                         .textAlign(TextAlign.Center)
                                         .color(Theme.OnPrimary.rgb)
                                         .toAttrs()
                                 ) {
                                     Text("Consult")
                                 }
                             }
                             Div(
                                 attrs = Modifier
                                     .attrsModifier {
                                         attr("class", "card-body bg-body")
                                     }
                                     .borderRadius(r = 20.px)
                                     .toAttrs()
                             ) {
                                 P(
                                     attrs = Modifier
                                         .classNames("card-text")
                                         .toAttrs()
                                 ) {
                                     Text("Start with an initial consultation to determine what the needs of the business are.")
                                 }
                             }
                         }
                     }
                 }
                 Div(
                     attrs = Modifier
                         .attrsModifier {
                             attr("class", "carousel-item")
                         }
                         .toAttrs()
                 ) {
                     Div(
                         attrs = Modifier
                             .attrsModifier {
                                 attr("class", "d-block w-100")
                             }
                             .toAttrs()
                     ) {
                         Div(
                             attrs = Modifier
                                 .classNames("card")
                                 .borderRadius(r = 20.px)
                                 .height(200.px)
                                 .toAttrs()
                         ) {
                             Div(
                                 attrs = Modifier
                                     .attrsModifier {
                                         attr("class", "card-header")
                                     }
                                     .backgroundColor(Theme.Primary.rgb)
                                     .borderRadius(topLeft = 20.px, topRight = 20.px)
                                     .toAttrs()
                             ) {
                                 H5(
                                     attrs = Modifier
                                         .classNames("card-title")
                                         .textAlign(TextAlign.Center)
                                         .color(Theme.OnPrimary.rgb)
                                         .toAttrs()
                                 ) {
                                     Text("Implement")
                                 }
                             }
                             Div(
                                 attrs = Modifier
                                     .attrsModifier {
                                         attr("class", "card-body bg-body")
                                     }
                                     .borderRadius(r = 20.px)
                                     .toAttrs()
                             ) {
                                 P(
                                     attrs = Modifier
                                         .classNames("card-text")
                                         .toAttrs()
                                 ) {
                                     Text("Build a roadmap, create, and implement the solutions.")
                                 }
                             }
                         }
                     }
                 }
                 Div(
                     attrs = Modifier
                         .attrsModifier {
                             attr("class", "carousel-item")
                         }
                         .toAttrs()
                 ) {
                     Div(
                         attrs = Modifier
                             .attrsModifier {
                                 attr("class", "d-block w-100")
                             }
                             .toAttrs()
                     ) {
                         Div(
                             attrs = Modifier
                                 .classNames("card")
                                 .borderRadius(r = 20.px)
                                 .height(200.px)
                                 .toAttrs()
                         ) {
                             Div(
                                 attrs = Modifier
                                     .attrsModifier {
                                         attr("class", "card-header")
                                     }
                                     .backgroundColor(Theme.Primary.rgb)
                                     .borderRadius(topLeft = 20.px, topRight = 20.px)
                                     .toAttrs()
                             ) {
                                 H5(
                                     attrs = Modifier
                                         .classNames("card-title")
                                         .color(Theme.OnPrimary.rgb)
                                         .textAlign(TextAlign.Center)
                                         .toAttrs()
                                 ) {
                                     Text("Support")
                                 }
                             }
                             Div(
                                 attrs = Modifier
                                     .attrsModifier {
                                         attr("class", "card-body bg-body")
                                     }
                                     .borderRadius(r = 20.px)
                                     .toAttrs()
                             ) {
                                 P(
                                     attrs = Modifier
                                         .classNames("card-text")
                                         .toAttrs()
                                 ) {
                                     Text("Train all members of your business on the new systems. Provide additional support as needed.")
                                 }
                             }
                         }
                     }
                 }
            }
        }
    }
}
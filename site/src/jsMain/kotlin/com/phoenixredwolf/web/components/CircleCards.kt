package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.styles.*
import com.phoenixredwolf.web.theme.secondaryLight
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.functions.url
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.dom.*

@Composable
fun CircleCard(headline: String, body: String, image: String) {
    Div(
        attrs = CardStyle.toModifier()
            .classNames("card", "transition")
            .toAttrs()
    ) {
        H2(
            attrs = H2Style.toModifier()
                .classNames("transition")
                .toAttrs()
        ) { Text(headline) }
        P(
            attrs = PStyle.toModifier()
                .toAttrs()
        ) {
            Text(body)
        }
        Div(
            attrs = CtaContainerStyle.toModifier()
                .classNames("cta-container", "transition")
                .toAttrs()
        ) {
            A(
                attrs = CtaStyle.toModifier()
                    .attrsModifier { attr("href", "https://calendly.com/admin-fjs/30min") }
                    .toAttrs()
            ) {
                Text("Schedule a Call")
            }
        }
        Div(
            attrs = Card_circleStyle.toModifier()
                .classNames("card_circle", "transition")
                .background(
                    secondaryLight,
                    CSSBackground(
                        image = BackgroundImage.of(url(image)),
                        repeat = BackgroundRepeat.NoRepeat,
                        size = BackgroundSize.Cover,
                        position = BackgroundPosition.of(CSSPosition.Bottom)
                    )
                )
                .toAttrs()
        )
    }

}
package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.util.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun SectionTitle(
    modifier: Modifier = Modifier,
    section: Section,
    alignment: Alignment.Horizontal = Alignment.CenterHorizontally
) {
    Column(
        modifier = modifier,
        horizontalAlignment = alignment
    ) {
        if (section.title != "About") {
            Title(section.title, alignment)
        }
        Subtitle(section.subtitle, alignment)
        Box(
            modifier = Modifier
                .height(2.px)
                .width(80.px)
                .backgroundColor(Theme.Primary.rgb)
                .borderRadius(r = 50.px)
        )

    }
}

@Composable
private fun Title(
    title: String,
    alignment: Alignment.Horizontal
) {
    P(
        attrs = Modifier
            .fillMaxWidth()
            .margin(topBottom = 0.px)
            .textAlign(
                if (alignment == Alignment.CenterHorizontally) TextAlign.Center else TextAlign.Start
            )
            .fontFamily(FONT_FAMILY)
            .fontSize(25.px)
            .fontWeight(FontWeight.Normal)
            .color(Theme.Primary.rgb)
            .toAttrs()
    ) {
        Text(title)
    }
}

@Composable
private fun Subtitle(
    subtitle: String,
    alignment: Alignment.Horizontal
) {
    P(
        attrs = Modifier
            .fillMaxWidth()
            .margin(top = 0.px, bottom = 10.px)
            .textAlign(
                if (alignment == Alignment.CenterHorizontally) TextAlign.Center else TextAlign.Start
            )
            .fontFamily(FONT_FAMILY)
            .fontSize(40.px)
            .fontWeight(FontWeight.SemiBold)
            .color(Theme.Secondary.rgb)
            .toAttrs()
    ) {
        Text(subtitle)
    }}
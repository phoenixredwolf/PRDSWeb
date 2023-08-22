package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.models.Theme
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun SectionTitle(
    breakpoint: Breakpoint,
    modifier: Modifier = Modifier,
    section: Section,
    alignment: Alignment.Horizontal = Alignment.CenterHorizontally
) {
    Column(
        modifier = modifier,
        horizontalAlignment = alignment
    ) {
        if (section.title != "About" && section.title != "Home") {
            Title(section.title, alignment, breakpoint)
        }
        Subtitle(section.subtitle, alignment, breakpoint)
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
    alignment: Alignment.Horizontal,
    breakpoint: Breakpoint
) {
    P(
        attrs = Modifier
            .fillMaxWidth()
            .margin(topBottom = 0.px)
            .textAlign(
                if (alignment == Alignment.CenterHorizontally) TextAlign.Center else TextAlign.Start
            )
            .fontSize(if (breakpoint <= Breakpoint.SM) 10.px else 25.px)
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
    alignment: Alignment.Horizontal,
    breakpoint: Breakpoint
) {
    P(
        attrs = Modifier
            .fillMaxWidth()
            .margin(top = 0.px, bottom = 10.px)
            .textAlign(
                if (alignment == Alignment.CenterHorizontally) TextAlign.Center else TextAlign.Start
            )
            .fontSize(if (breakpoint <= Breakpoint.SM) 15.px else 40.px)
            .fontWeight(FontWeight.SemiBold)
            .color(Theme.Secondary.rgb)
            .toAttrs()
    ) {
        Text(subtitle)
    }}
package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.styles.LogoStyle
import com.phoenixredwolf.web.util.Res
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaCopyright
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Footer(breakpoint: Breakpoint) {
    Row(
        modifier = Modifier
            .fillMaxWidth(if(breakpoint > Breakpoint.MD) 80.percent else 90.percent)
            .margin(topBottom = 50.px),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    )  {
        FooterImage()
        P(
            attrs = Modifier
                .textAlign(TextAlign.Center)
                .fontSize(if (breakpoint >= Breakpoint.LG) 15.px else 8.px)
                .toAttrs()
        ) {
            Text("This page created with Kobweb")
        }
        P(
            attrs = Modifier
                .textAlign(TextAlign.Center)
                .fontSize(if (breakpoint >= Breakpoint.LG) 15.px else 10.px)
                .toAttrs()
        ) {
            FaCopyright()
            Text("   2023")
        }
    }
}

@Composable
private fun FooterImage() {
    Column(
        modifier = Modifier.fillMaxSize(25.percent),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            src = Res.Image.icon,
            desc = "PhoenixRedwolf Digital Services Icon",
            modifier = LogoStyle.toModifier().fillMaxWidth(80.percent)
        )
    }
}
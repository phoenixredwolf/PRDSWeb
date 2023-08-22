package com.phoenixredwolf.web.sections.about

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Innovate(breakpoint: Breakpoint) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 30.px)
            .backgroundColor(Colors.WhiteSmoke),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        P(
            attrs = Modifier
                .textAlign(TextAlign.Center)
                .fillMaxWidth(
                    if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent)
                .fontSize(if(breakpoint >= Breakpoint.LG) 45.px else 25.px)
                .fontWeight(FontWeight.SemiBold)
                .color(Theme.OnSecondaryContainer.rgb)
                .toAttrs()
        ) {
            Text("Innovative Solutions for Your Success")
        }
        SimpleGrid(modifier = Modifier.fillMaxWidth(
            if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            InnovateImage()
            InnovateText(breakpoint)
        }
    }
}

@Composable
private fun InnovateText(breakpoint: Breakpoint) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(topBottom = 10.px)
    ) {
        P(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(TextAlign.Start)
                .margin(left = 20.px)
                .fontSize(if (breakpoint >= Breakpoint.LG) 25.px else 15.px)
                .toAttrs()
        ) {
            Text(
                "Our team of skilled professionals is dedicated to understanding your unique needs and " +
                        "challenges.By leveraging cutting-edge technologies and industry best practices, we tailor our " +
                        "services to offer bespoke solutions that optimize efficiency, enhance productivity, and foster " +
                        "growth. You can trust us to deliver on time and within budget while maintaining the highest " +
                        "standards of quality and security."
            )
        }
    }
}

@Composable
private fun InnovateImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            src = Res.Image.solution,
            desc = "Solution Image",
            modifier = Modifier.fillMaxWidth(80.percent)
        )
    }
}

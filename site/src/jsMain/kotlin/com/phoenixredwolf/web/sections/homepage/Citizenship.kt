package com.phoenixredwolf.web.sections.homepage

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
fun Citizenship(breakpoint: Breakpoint) {
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
            Text("Responsible Corporate Citizenship")
        }
        SimpleGrid(modifier = Modifier.fillMaxWidth(
            if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            CitizenshipImage()
            CitizenshipText(breakpoint)
        }
    }
}

@Composable
private fun CitizenshipText(breakpoint: Breakpoint) {
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
                "As a responsible corporate citizen, we are committed to minimizing our environmental impact " +
                        "and supporting sustainable business practices. We strive to make a positive difference in " +
                        "the communities we serve, promoting inclusivity and diversity in all aspects of our operations."
            )
        }
    }
}

@Composable
private fun CitizenshipImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            src = Res.Image.corporate,
            desc = "Corporate Citizenship Image",
            modifier = Modifier.fillMaxWidth(80.percent)
        )
    }
}

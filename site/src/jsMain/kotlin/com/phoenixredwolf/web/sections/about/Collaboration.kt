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
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun Collaborate(breakpoint: Breakpoint) {
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
                .fontSize(if(breakpoint >= Breakpoint.LG) 40.px else 25.px)
                .fontWeight(FontWeight.SemiBold)
                .color(Theme.OnTertiaryContainer.rgb)
                .toAttrs()
        ) {
            Text ("Collaboration and Continuous Learning")
        }
        SimpleGrid(modifier = Modifier.fillMaxWidth(
            if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            CollaborateText(breakpoint)
            CollaborateImage()
        }
    }
}

@Composable
private fun CollaborateText(breakpoint: Breakpoint) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(topBottom = 10.px)
    ) {
        P(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(TextAlign.End)
                .margin(left = 20.px)
                .fontSize(if (breakpoint >= Breakpoint.LG) 20.px else 15.px)
                .toAttrs()
        ) {
            Text("At ")
            Span(
                attrs = Modifier
                    .color(Theme.OnTertiaryContainer.rgb)
                    .fontWeight(FontWeight.SemiBold)
                    .toAttrs()
            ){
                Text("PhoenixRedwolf")
            }
            Text(", we foster a culture of collaboration and continuous learning. We stay at the forefront of " +
                    "the rapidly evolving digital landscape to provide you with the most up-to-date and effective " +
                    "strategies for success. Our transparent and customer-centric approach ensures open " +
                    "communication and complete client satisfaction at every stage of the engagement.")
        }
    }
}

@Composable
private fun CollaborateImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            src = Res.Image.collaboration,
            desc = "Collaboration Image",
            modifier = Modifier.fillMaxWidth(80.percent)
        )
    }
}

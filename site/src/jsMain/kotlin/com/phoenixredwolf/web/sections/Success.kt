package com.phoenixredwolf.web.sections

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
fun Success(breakpoint: Breakpoint) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(topBottom = 10.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        P(
            attrs = Modifier
                .textAlign(TextAlign.Center)
                .fillMaxWidth(
                    if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent)
                .fontSize(if(breakpoint >= Breakpoint.LG) 45.px else 25.px)
                .fontWeight(FontWeight.SemiBold)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text("Your Partner for Success")
        }
        SimpleGrid(modifier = Modifier.fillMaxWidth(
            if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            SuccessImage()
            SuccessText(breakpoint)
        }
    }
}

@Composable
private fun SuccessText(breakpoint: Breakpoint) {
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
                "With integrity and passion, we forge enduring partnerships with our clients, seeking to become " +
                        "an extension of your teams. Together, we embrace challenges, conquer complexities, and " +
                        "transform possibilities into realities. At PhoenixRedwolf Digital Services, we are the " +
                        "catalyst for your digital journey, igniting the power of technology to drive lasting and " +
                        "meaningful success for your business."
            )
        }
    }
}

@Composable
private fun SuccessImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            src = Res.Image.success,
            desc = "Success Image",
            modifier = Modifier.fillMaxWidth(80.percent)
        )
    }
}

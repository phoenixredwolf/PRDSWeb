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
fun Empower(breakpoint: Breakpoint) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.px,bottom = 30.px)
            .margin(top = 100.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        P(
            attrs = Modifier
                .textAlign(TextAlign.Center)
                .fillMaxWidth(
                    if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent)
                .fontSize(if(breakpoint >= Breakpoint.LG) 45.px else 25.px)
                .fontWeight(FontWeight.SemiBold)
                .color(Theme.OnPrimaryContainer.rgb)
                .toAttrs()
        ) {
            Text ("Empower Your Digital Success")
        }
        SimpleGrid(modifier = Modifier.fillMaxWidth(
            if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            EmpowerText(breakpoint)
            EmpowerImage()
        }
    }
}

@Composable
private fun EmpowerText(breakpoint: Breakpoint) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(topBottom = 10.px)
    ) {
        P(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(TextAlign.End)
                .margin(left = 20.px)
                .fontSize(if (breakpoint >= Breakpoint.LG) 25.px else 15.px)
                .toAttrs()
        ) {
            Text("At ")
            Span(
                attrs = Modifier
                    .color(Theme.OnPrimaryContainer.rgb)
                    .fontWeight(FontWeight.SemiBold)
                    .toAttrs()
            ){
                Text("PhoenixRedwolf Digital Services")
            }
            Text(", we believe in the transformative power of technology. Our mission is to empower businesses " +
                    "and organizations to thrive in the digital age by delivering exceptional technical consulting, " +
                    "web development and administration, cloud migration, and network installation and " +
                    "administration services.")
        }
    }
}

@Composable
private fun EmpowerImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            src = Res.Image.empower,
            desc = "Empowerment Image",
            modifier = Modifier.fillMaxWidth(80.percent)
        )
    }
}

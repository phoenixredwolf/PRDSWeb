package com.phoenixredwolf.web.sections.services.network

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Theme
import com.varabyte.kobweb.compose.css.AlignContent
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaNetworkWired
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun NetworkService(breakpoint: Breakpoint) {
    Button(
        attrs = Modifier
            .attrsModifier {
                attr("class", "collapsible d-flex flex-row")
            }
            .backgroundColor(Theme.PrimaryContainer.rgb)
            .padding(10.px)
            .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Medium else FontSize.Large)
            .toAttrs()
    ) {
        NetworkLeft(breakpoint)
        if (breakpoint >= Breakpoint.MD) {
            NetworkRight()
        }
    }
    Div(
        attrs = Modifier
            .attrsModifier {
                attr("class", "content d-flex mb-3")
            }
            .backgroundColor(Theme.SecondaryContainer.rgb)
            .color(Theme.OnSecondaryContainer.rgb)
            .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Small else FontSize.Medium)
            .width(100.percent)
            .textAlign(TextAlign.Center)
            .toAttrs()
    ) {
        NetworkSectionMenu(breakpoint)
    }
}

@Composable
private fun NetworkLeft(breakpoint: Breakpoint) {
    Div(
        attrs = Modifier
            .classNames("p-2")
            .fillMaxHeight()
            .width(80.px)
            .padding(topBottom = 10.px)
            .alignContent(AlignContent.Center)
            .toAttrs()
    ) {
        FaNetworkWired(
            size = if(breakpoint >= Breakpoint.MD ) IconSize.XXL else IconSize.LG,
            modifier = Modifier
                .color(Theme.OnSurface.rgb)
        )
    }
    Div(
        attrs = Modifier
            .attrsModifier {
                attr("class", "flex-fill align-items-center")
            }
            .fillMaxHeight()
            .fontSize(FontSize.Large)
            .fontWeight(FontWeight.Bold)
            .padding(top = 10.px)
            .toAttrs()
    ){
        Text("Network")
    }
}

@Composable
private fun NetworkRight() {
    Div(
        attrs = Modifier
            .attrsModifier {
                attr("class", "p-2 align-items-center")
            }
            .textAlign(TextAlign.End)
            .padding(top = 10.px)
            .fontSize(FontSize.Small)
            .color(Theme.OnSecondaryContainer.rgb)
            .toAttrs()
    ){
        Text("Connecting Possibilities, One Node at a Time")
    }
}
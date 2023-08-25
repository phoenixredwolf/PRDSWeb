package com.phoenixredwolf.web.sections.services.web

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaCode
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun WebService(breakpoint: Breakpoint) {
    Button(
        attrs = Modifier
            .attrsModifier {
                attr("class", "collapsible d-flex flex-row")
            }
            .fontSize(if (breakpoint < Breakpoint.MD) 12.px else 20.px)
            .toAttrs()
    ) {
        Div(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "p-2")
                }
                .width(80.px)
                .toAttrs()
        ) {
            FaCode(
                size = if(breakpoint >= Breakpoint.MD ) IconSize.XXL else IconSize.LG,
                modifier = Modifier.padding(right = 10.px)
            )
        }
        Div(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "flex-fill align-items-center")
                }
                .fillMaxHeight()
                .padding(top = 10.px)
                .toAttrs()
        ){
            Text("Web")
        }

    }
    Div(
        attrs = Modifier
            .attrsModifier {
                attr("class", "content d-flex mb-3")
            }
            .fontSize(if (breakpoint < Breakpoint.MD) 12.px else 20.px)
            .width(100.percent)
            .textAlign(TextAlign.Center)
            .toAttrs()
    ) {
        Div(
            attrs = Modifier
                .classNames("flex-fill")
                .padding(8.px)
                .width(100.percent)
                .toAttrs()
        ) {
            Text("Development")
        }
        Div(
            attrs = Modifier
                .classNames("flex-fill")
                .width(100.percent)
                .toAttrs()
        ) {
            Text("Hosting")
        }
    }
}
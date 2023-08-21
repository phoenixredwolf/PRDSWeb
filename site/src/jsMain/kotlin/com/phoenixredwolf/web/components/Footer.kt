package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.styles.NavigationItemStyle
import com.phoenixredwolf.web.util.Constants.FONT_FAMILY
import com.phoenixredwolf.web.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.dom.ref
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaCopyright
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import kotlinx.browser.document
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun FooterContent(breakpoint: Breakpoint) {
    Box(
        modifier = Modifier
            .classNames("footer")
            .fillMaxSize()
            .backgroundColor(Colors.Black),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(if(breakpoint > Breakpoint.MD) 80.percent else 90.percent)
                .fillMaxHeight()
                .margin(topBottom = 50.px)
                .padding(topBottom = 50.px),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        )  {
            Image(
                src = Res.Image.logo,
                modifier = Modifier.width(200.px)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                FooterMenu()
            }
            SocialBar(true)
            P(
                attrs = Modifier
                    .padding(top = 10.px)
                    .textAlign(TextAlign.Center)
                    .fontSize(if (breakpoint >= Breakpoint.LG) 15.px else 8.px)
                    .color(Colors.White)
                    .toAttrs()
            ) {
                Text("This page created with Kobweb")
            }
            P(
                attrs = Modifier
                    .textAlign(TextAlign.Center)
                    .fontSize(if (breakpoint >= Breakpoint.LG) 15.px else 10.px)
                    .color(Colors.White)
                    .toAttrs()
            ) {
                FaCopyright(

                )
                Text("   2023")
            }
        }
        Box (
            ref = ref {
                val script = document.createElement("script")
                script.asDynamic().src = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
                it.appendChild(script)
            }
        )

    }
}

@Composable
fun FooterMenu() {
    Section.values().forEach { section ->  
        Link(
            modifier = NavigationItemStyle.toModifier()
                .fontFamily(FONT_FAMILY)
                .padding(right = 20.px)
                .fontSize(12.px)
                .fontWeight(FontWeight.Normal)
                .textDecorationLine(TextDecorationLine.None),
            path = section.path,
            text = section.title
        )
    }
}

package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.styles.FooterItemStyle
import com.phoenixredwolf.web.theme.footerBackground
import com.phoenixredwolf.web.util.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.dom.ref
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
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
import kotlin.js.Date

@Composable
fun FooterContent(breakpoint: Breakpoint) {

    Box(
        modifier = Modifier
            .classNames("footer")
            .fillMaxSize()
            .backgroundImage(footerBackground),
        contentAlignment = Alignment.Center
    ) {
        if (breakpoint >= Breakpoint.MD){
            FooterHorizontal(breakpoint)
        } else {
            FooterVertical(breakpoint)
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
fun FooterHorizontal(breakpoint: Breakpoint) {
    Column(
        modifier = Modifier
            .fillMaxWidth(80.percent)
            .padding(topBottom = 25.px)
            .margin(topBottom = 25.px)
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ){
            SocialBar(true)
            Link(
                modifier = Modifier
                    .padding(top = 10.px)
                    .textAlign(TextAlign.Center)
                    .fontSize(FontSize.Small)
                    .color(Theme.OnPrimaryContainer.rgb),
                path = Section.Privacy.path
            ) {
                Text("Privacy Policy")
            }
            P(
                attrs = Modifier
                    .textAlign(TextAlign.Center)
                    .fontSize(FontSize.Small)
                    .color(Theme.OnPrimaryContainer.rgb)
                    .padding(top = 25.px)
                    .toAttrs()
            ) {
                FaCopyright(
                    modifier = Modifier.padding(right = 10.px)
                )
                Text("${Date().getFullYear()} All Rights Reserved")
            }
            FooterMenu(breakpoint)
        }
    }
}

@Composable
fun FooterVertical(breakpoint: Breakpoint) {
    Column(
        modifier = Modifier
            .fillMaxWidth(90.percent)
            .fillMaxHeight()
            .padding(topBottom = 25.px)
            .margin(topBottom = 25.px),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SocialBar(true)
        FooterMenu(breakpoint, true)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Link(
                modifier = Modifier
                    .padding(top = 10.px)
                    .textAlign(TextAlign.Center)
                    .fontSize(FontSize.XSmall)
                    .color(Theme.OnPrimaryContainer.rgb),
                path = Section.Privacy.path
            ) {
                Text("Privacy Policy")
            }
            P(
                attrs = Modifier
                    .alignContent(AlignContent.Center)
                    .textAlign(TextAlign.Center)
                    .fontSize(FontSize.XSmall)
                    .color(Theme.OnPrimaryContainer.rgb)
                    .padding(top = 30.px)
                    .toAttrs()
            ) {
                FaCopyright(
                    modifier = Modifier.padding(right = 10.px, bottom = 0.px)
                )
                Text("${Date().getFullYear()} All Rights Reserved")
            }
        }
    }
}

@Composable
fun FooterMenu(breakpoint: Breakpoint, vert: Boolean = false) {
    Row(
//        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = if(vert) Arrangement.Center else Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Section.values().take(5).forEach { section ->
            Link(
                modifier = FooterItemStyle.toModifier()
                    .padding(right = 20.px)
                    .fontSize(if (breakpoint >= Breakpoint.MD) FontSize.Large else FontSize.Medium)
                    .fontWeight(FontWeight.Normal)
                    .textDecorationLine(TextDecorationLine.None),
                path = section.path,
                text = section.title
            )
        }
    }
}

@Composable
fun FooterLogo() {
    Image(
        src = Res.Image.logo,
        modifier = Modifier.width(300.px)
    )
}


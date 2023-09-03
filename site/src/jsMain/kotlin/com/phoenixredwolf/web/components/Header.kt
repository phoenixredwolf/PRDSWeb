package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.styles.LogoStyle
import com.phoenixredwolf.web.styles.NavStyle
import com.phoenixredwolf.web.util.Res
import com.varabyte.kobweb.compose.css.AlignContent
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.FaPhone
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun Header(
    breakpoint: Breakpoint,
    onMenuClicked: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .zIndex(1)
            .attrsModifier {
                attr("class", "navbar navbar-expand-lg navbar-light headerBackground")
            }
            .backgroundColor(Theme.Surface.rgb)
            .position(Position.Fixed),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(90.percent),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom
            ) {
                Contact(breakpoint)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(90.percent)
                    .margin(topBottom = 25.px),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                LeftSide(breakpoint, onMenuClicked)
                if (breakpoint > Breakpoint.MD) {
                    RightSide()
                }
            }
        }
    }
}

@Composable
private fun LeftSide(
    breakpoint: Breakpoint,
    onMenuClicked: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (breakpoint <= Breakpoint.MD) {
            FaBars(
                modifier = Modifier
                    .margin(right = 25.px)
                    .onClick { onMenuClicked() },
                size = IconSize.XL
            )
        }
        Image(
            modifier = LogoStyle.toModifier(),
            src = Res.Image.logo,
            desc = "Logo Image"
        )

    }
}

@Composable
fun RightSide() {
    Row(
        modifier = NavStyle.toModifier()
            .fillMaxWidth()
            .borderRadius(r = 50.px)
            .backgroundColor(Theme.LightGray.rgb)
            .padding(all = 10.px)
            .margin(left = 40.px),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
//        Section.values().take(4).forEach { section ->
//            Link(
//                modifier = NavigationItemStyle.toModifier()
//                    .padding(right = 30.px)
//                    .fontSize(18.px)
//                    .fontWeight(FontWeight.SemiBold)
//                    .textDecorationLine(TextDecorationLine.None),
//                path = section.path,
//                text = section.title
//            )
//        }
        NavBar2()
    }
}

@Composable
private fun Contact(breakpoint: Breakpoint){
    Div(
        attrs = Modifier
            .fillMaxWidth()
            .textAlign(TextAlign.End)
            .padding(top = 10.px)
            .alignContent(AlignContent.Baseline)
            .toAttrs()
    ) {
        FaPhone(
            modifier = Modifier
                .padding(top = 10.px, right = 10.px)
                .color(Theme.Secondary.rgb),
            size = IconSize.LG
        )
        Text("(856) 347-0392 or ")
        Link(
            modifier = Modifier.padding(left = 5.px),
            path = "https://calendly.com/admin-fjs/30min",
            text = "Schedule a call"
        )
    }
}
package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.styles.LogoStyle
import com.phoenixredwolf.web.styles.NavigationItemStyle
import com.phoenixredwolf.web.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun Header(
    breakpoint: Breakpoint,
    onMenuClicked: () -> Unit
) {

        Row(
            modifier = Modifier
                .fillMaxWidth(if(breakpoint > Breakpoint.MD) 80.percent else 90.percent)
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

@Composable
fun LeftSide(
    breakpoint: Breakpoint,
    onMenuClicked: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (breakpoint <= Breakpoint.MD) {
            FaBars(
                modifier = Modifier
                    .margin(right = 15.px)
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
        modifier = Modifier
            .fillMaxWidth()
            .borderRadius(r = 50.px)
            .backgroundColor(Theme.LightGray.rgb)
            .padding(all = 10.px)
            .margin(left = 40.px),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                src = Res.Image.icon,
                desc = "PhoenixRedwolf Digital Services Icon",
                modifier = LogoStyle.toModifier().height(40.px)
            )
        }
        Row(
            horizontalArrangement = Arrangement.End
        ) {
            Section.values().take(4).forEach { section ->
                Link(
                    modifier = NavigationItemStyle.toModifier()
                        .padding(right = 30.px)
                        .fontSize(18.px)
                        .fontWeight(FontWeight.SemiBold)
                        .textDecorationLine(TextDecorationLine.None),
                    path = section.path,
                    text = section.title
                )
            }
        }
    }
}
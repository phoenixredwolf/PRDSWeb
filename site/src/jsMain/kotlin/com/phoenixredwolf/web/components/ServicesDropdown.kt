package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.styles.Dropdowncardstyle
import com.phoenixredwolf.web.styles.NavStyle
import com.phoenixredwolf.web.styles.NavigationItemStyle
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun ServicesDropdown() {
    Row(
        modifier = NavStyle.toModifier()
            .classNames("drop-item")
            .margin(10.px)
            .padding(10.px)
            .width(Width.FitContent),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            modifier = Modifier
                .margin(leftRight = 5.px)
        ) {
            Row(
                modifier = Dropdowncardstyle.toModifier(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaServer(
                    modifier = Modifier.padding(right = 20.px),
                    size = IconSize.LG
                )
                Link(
                    path = "/services/itservices",
                    text = "Managed IT Services",
                    modifier = NavigationItemStyle.toModifier()
                        .textDecorationLine(TextDecorationLine.None)
                )
            }
            Row(
                modifier = Dropdowncardstyle.toModifier(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaCircleQuestion(
                    modifier = Modifier.padding(right = 20.px),
                    size = IconSize.LG
                )
                Link(
                    path = "/services/itsupport",
                    text = "IT Support",
                    modifier = NavigationItemStyle.toModifier()
                        .textDecorationLine(TextDecorationLine.None)
                )
            }
            Row(
                modifier = Dropdowncardstyle.toModifier(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaCloud(
                    modifier = Modifier.padding(right = 20.px),
                    size = IconSize.LG
                )
                Link(
                    path = "/services/cloud",
                    text = "Cloud Services",
                    modifier = NavigationItemStyle.toModifier()
                        .textDecorationLine(TextDecorationLine.None)
                )
            }
            Row(
                modifier = Dropdowncardstyle.toModifier(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaNetworkWired(
                    modifier = Modifier.padding(right = 20.px),
                    size = IconSize.LG
                )
                Link(
                    path = "/services/Network",
                    text = "Wired & Wireless Networks",
                    modifier = NavigationItemStyle.toModifier()
                        .textDecorationLine(TextDecorationLine.None)
                )
            }
        }
        Column(
            modifier = Modifier
                .margin(leftRight = 5.px)

        ) {
            Row(
                modifier = Dropdowncardstyle.toModifier(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaCode(
                    modifier = Modifier.padding(right = 20.px),
                    size = IconSize.LG
                )
                Link(
                    path = "/services/webdev",
                    text = "Web Development",
                    modifier = NavigationItemStyle.toModifier()
                        .textDecorationLine(TextDecorationLine.None)
                )
            }
            Row(
                modifier = Dropdowncardstyle.toModifier(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaComputer(
                    modifier = Modifier.padding(right = 20.px),
                    size = IconSize.LG
                )
                Link(
                    path = "/services/software",
                    text = "Software Development",
                    modifier = NavigationItemStyle.toModifier()
                        .textDecorationLine(TextDecorationLine.None)
                )
            }
            Row(
                modifier = Dropdowncardstyle.toModifier(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaCreditCard(
                    modifier = Modifier.padding(right = 20.px),
                    size = IconSize.LG
                )
                Link(
                    path = "",
                    text = "Point of Sale Systems (Coming Soon)",
                    modifier = NavigationItemStyle.toModifier()
                        .textDecorationLine(TextDecorationLine.None)
                )
            }
            Row(
                modifier = Dropdowncardstyle.toModifier(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaShareFromSquare(
                    modifier = Modifier.padding(right = 20.px),
                    size = IconSize.LG
                )
                Link(
                    path = "/services/social",
                    text = "Social Media",
                    modifier = NavigationItemStyle.toModifier()
                        .textDecorationLine(TextDecorationLine.None)
                )
            }
        }
    }
}
package com.phoenixredwolf.web.sections.services

import androidx.compose.runtime.*
import com.phoenixredwolf.web.components.BackToTopButton
import com.phoenixredwolf.web.components.FooterContent
import com.phoenixredwolf.web.components.Header
import com.phoenixredwolf.web.components.OverflowMenu
import com.phoenixredwolf.web.sections.about.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.dom.Footer

@Page("/services/")
@Composable
fun Networks(){
    var menuOpened by remember { mutableStateOf(false) }
    val title = "About Us - Your Trusted Partner in Digital Solutions | Phoenixredwolf Digital Services"
    val description = "Discover the story behind PhoenixRedwolf Digital Services – a leading provider of web development, software solutions, and digital services. Learn about our mission, expertise, and commitment to transforming ideas into powerful realities."

    LaunchedEffect(title, description) {
        document.title = title
        document.querySelector("""meta[name="description"]""")!!.setAttribute("content", description)
    }

    Box {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .backgroundColor(Colors.WhiteSmoke),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            val breakpoint = rememberBreakpoint()
            Row(
                modifier = Modifier
                    .position(Position.Fixed )
                    .backgroundColor(Colors.WhiteSmoke)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Header(breakpoint, onMenuClicked = { menuOpened = true })
            }

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Empower(breakpoint)
                Innovate(breakpoint)
                Collaborate(breakpoint)
                Citizenship(breakpoint)
                Success(breakpoint)
            }
            Footer(
                attrs = Modifier
                    .fillMaxWidth()
                    .toAttrs(),
                content = { FooterContent(breakpoint) }
            )
        }
        BackToTopButton()
        if (menuOpened) {
            OverflowMenu( onMenuClosed = { menuOpened = false} )
        }
    }
}
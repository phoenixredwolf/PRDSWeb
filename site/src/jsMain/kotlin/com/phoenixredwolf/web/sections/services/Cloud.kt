package com.phoenixredwolf.web.sections.services

import androidx.compose.runtime.*
import com.phoenixredwolf.web.components.*
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.util.Constants.CONSULT
import com.phoenixredwolf.web.util.Constants.IMPLEMENT
import com.phoenixredwolf.web.util.Constants.SUPPORT
import com.phoenixredwolf.web.util.Res
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Footer

@Page("/services/cloud")
@Composable
fun Cloud() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        var menuOpened by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .backgroundColor(Theme.LightGray.rgb),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            val breakpoint = rememberBreakpoint()
            Header(breakpoint, onMenuClicked = { menuOpened = true})
            Row(
                modifier = Modifier.fillMaxSize(90.percent).margin(topBottom = 250.px).padding(50.px),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    CircleCard("Initial Consultation", CONSULT, Res.Image.collaboration)

                }
                Column {
                    CircleCard("Implement Solutions", IMPLEMENT, Res.Image.webdev)

                }
                Column {
                    CircleCard("Train & Support", SUPPORT, Res.Image.empower)

                }

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
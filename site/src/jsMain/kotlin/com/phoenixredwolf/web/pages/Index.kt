package com.phoenixredwolf.web.pages

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.components.BackToTopButton
import com.phoenixredwolf.web.components.FooterContent
import com.phoenixredwolf.web.components.Header
import com.phoenixredwolf.web.sections.homepage.*
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
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.dom.Footer

@Page
@Composable
fun HomePage() {
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
                Header(breakpoint)
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

    }
}

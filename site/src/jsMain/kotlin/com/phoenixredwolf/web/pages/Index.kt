package com.phoenixredwolf.web.pages

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.components.Footer
import com.phoenixredwolf.web.components.Header
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint

@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier.fillMaxSize().backgroundColor(Theme.PrimaryContainer.rgb),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        val breakpoint = rememberBreakpoint()
        Header(breakpoint)

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
        Footer(breakpoint)
    }
}

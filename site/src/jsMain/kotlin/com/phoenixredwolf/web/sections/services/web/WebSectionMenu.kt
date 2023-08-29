package com.phoenixredwolf.web.sections.services.web

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.WebSections
import com.phoenixredwolf.web.styles.SectionMenuStyle
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun WebSectionMenu(breakpoint: Breakpoint) {
    if (breakpoint >= Breakpoint.MD) {
        Row(
            modifier = Modifier
                .height(36.px)
                .padding(10.px)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            WebMenu(breakpoint)
        }
    } else {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(bottom = 10.px)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            WebMenu(breakpoint)
        }
    }
}

@Composable
private fun WebMenu(breakpoint: Breakpoint) {
    WebSections.values().forEach { section ->
        Link(
            modifier = SectionMenuStyle.toModifier()
                .padding(10.px)
                .fontSize(if (breakpoint >= Breakpoint.MD) FontSize.Medium else FontSize.Small)
                .fontWeight(FontWeight.SemiBold)
                .textDecorationLine(TextDecorationLine.None),
            path = section.path,
            text = section.title
        )
    }
}
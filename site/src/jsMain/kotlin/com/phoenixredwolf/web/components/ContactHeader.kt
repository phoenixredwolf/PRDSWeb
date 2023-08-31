package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Theme
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaPhone
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Composable
fun ContactHeader(breakpoint: Breakpoint) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .position(Position.Fixed)
            .zIndex(1)
            .pointerEvents(PointerEvents.None),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.End
    ) {
        Row (
            modifier = Modifier
                .position(Position.Fixed)
                .margin(
                    top = if(breakpoint <= Breakpoint.SM) 10.px else 25.px,
                    right = if(breakpoint <= Breakpoint.SM) 25.px else 60.px
                )
                .cursor(Cursor.Pointer)
                .pointerEvents(PointerEvents.Auto)
                .fillMaxWidth()
                .textAlign(TextAlign.End),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Top
        ){
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
}
package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.styles.NavigationItemStyle
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ContactOrSched(breakpoint: Breakpoint,text:String) {
    P(
        attrs = Modifier
            .fillMaxWidth()
            .textAlign(TextAlign.Center)
            .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Medium else FontSize.XLarge)
            .toAttrs()
    ) {
        Link(
            modifier = NavigationItemStyle.toModifier()
                .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Large else FontSize.XXLarge)
                .fontWeight(FontWeight.SemiBold)
                .textDecorationLine(TextDecorationLine.None),
            path = Section.Contact.path,
            text = Section.Contact.title
        )
        Text(" or ")
        Link(
            modifier = NavigationItemStyle.toModifier()
                .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Large else FontSize.XXLarge)
                .fontWeight(FontWeight.SemiBold)
                .textDecorationLine(TextDecorationLine.None),
            path = "https://calendly.com/admin-fjs/30min",
            text = "Schedule a call"
        )
        Br()
        Text(text)
    }

}
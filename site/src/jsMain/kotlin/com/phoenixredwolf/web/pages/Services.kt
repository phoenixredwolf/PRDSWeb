package com.phoenixredwolf.web.pages

import androidx.compose.runtime.*
import com.phoenixredwolf.web.components.*
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.util.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.icons.fa.FaToolbox
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun Services() {
    val breakpoint = rememberBreakpoint()
    var menuOpened by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Header(breakpoint, onMenuClicked = { menuOpened = true})

        SectionTitle(section = Section.Services, breakpoint = breakpoint)
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(if(breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            P(
                attrs = Modifier
                    .margin(top = 20.px)
                    .textAlign(TextAlign.Center)
                    .color(Theme.Primary.rgb)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.SemiBold)
                    .fontSize(FontSize.XXLarge)
                    .toAttrs()
            ) {
                FaToolbox(
                    modifier = Modifier.padding(right = 25.px).color(Theme.Secondary.rgb),
                    size = IconSize.LG
                )
                Text("Under Construction")
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

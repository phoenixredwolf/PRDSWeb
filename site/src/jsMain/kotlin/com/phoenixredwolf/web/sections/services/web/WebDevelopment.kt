package com.phoenixredwolf.web.sections.services.web

import androidx.compose.runtime.*
import com.phoenixredwolf.web.components.Header
import com.phoenixredwolf.web.components.SectionTitle
import com.phoenixredwolf.web.models.SubSection
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Page("/services/webdev")
@Composable
fun WebDevelopment() {
    val title = "Expert Web Development Services for Digital Excellence | Web and Software Development Services"
    val description = "Transform your online presence with our professional web development services. PhoenixRedwolf " +
            "Digital Services crafts responsive, user-friendly websites that drive results. Explore our offerings today."

    LaunchedEffect(title, description) {
        document.title = title
        document.querySelector("""meta[name="description"]""")!!.setAttribute("content", description)
    }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        var menuOpened by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .backgroundColor(Colors.WhiteSmoke),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            val breakpoint = rememberBreakpoint()
            Header(breakpoint, onMenuClicked = { menuOpened = true })

            SectionTitle(section = SubSection.WebDev.toSection(), breakpoint = breakpoint)

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 20.px)
                    .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
            }
        }
    }
}
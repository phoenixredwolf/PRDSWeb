package com.phoenixredwolf.web.sections.services.software

import androidx.compose.runtime.*
import com.phoenixredwolf.web.components.*
import com.phoenixredwolf.web.models.Section
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Footer

@Page("/services/software")
@Composable
fun SoftwareDevelopment() {
    val title = "Expert Desktop and Mobile Software Development Services | PhoenixRedwolf Digital Services"
    val description = "Transform your ideas into reality with our top-notch desktop and mobile software development " +
            "services. Our skilled team at PhoenixRedwolf Digital Services crafts tailored solutions that empower " +
            "your business in the digital realm. From intuitive desktop applications to cutting-edge mobile apps, " +
            "we bring innovation to every platform, ensuring seamless user experiences and technological excellence. " +
            "Explore our software development expertise today."

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

            SectionTitle(section = Section.Software, breakpoint = breakpoint)

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 20.px)
                    .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
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
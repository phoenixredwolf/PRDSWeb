package com.phoenixredwolf.web.pages

import androidx.compose.runtime.*
import com.phoenixredwolf.web.components.*
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.sections.privacy.*
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

@Page
@Composable
fun Privacy() {

    val title = "Privacy Policy - Your Privacy Matters to Us | PhoenixRedwolf Digital Services"
    val description = "Learn how PhoenixRedwolf Digital Services values your privacy and safeguards your personal information. Explore our privacy policy to understand how we collect, use, and protect your data in compliance with regulations."

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
            Header(breakpoint, onMenuClicked = { menuOpened = true})

            SectionTitle(section = Section.Privacy, breakpoint = breakpoint)

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 20.px)
                    .fillMaxWidth(if(breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                PrivacyContenct()
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

@Composable
fun PrivacyContenct() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        PrivacyIntro()
        InfoCollection()
        InfoUse()
        InfoDisclose()
        InfoSecurity()
        Acceptance()
    }
}

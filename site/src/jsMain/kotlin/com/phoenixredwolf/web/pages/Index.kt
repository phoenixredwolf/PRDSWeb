package com.phoenixredwolf.web.pages

import androidx.compose.runtime.*
import com.phoenixredwolf.web.components.*
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.sections.services.CloudService
import com.phoenixredwolf.web.sections.services.DatabaseService
import com.phoenixredwolf.web.sections.services.NetworkService
import com.phoenixredwolf.web.sections.services.SoftwareService
import com.phoenixredwolf.web.sections.services.web.WebService
import com.phoenixredwolf.web.styles.NavigationItemStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {

    val title = "Your Partner in Digital Solutions | Web and Software Development Services"
    val description = "We offer expert web and software development, hosting, and administration services. Transform your ideas into reality with our cutting-edge solutions."

    LaunchedEffect(title, description) {
        document.title = title
        document.querySelector("""meta[name="description"]""")!!.setAttribute("content", description)
    }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        var menuOpened by remember { mutableStateOf(false)}
        Column(
            modifier = Modifier
                .fillMaxSize()
                .backgroundColor(Colors.WhiteSmoke),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            val breakpoint = rememberBreakpoint()
            Header(breakpoint, onMenuClicked = { menuOpened = true})

            SectionTitle(section = Section.Home, breakpoint = breakpoint)

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 20.px)
                    .fillMaxWidth(if(breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                WebService(breakpoint)
                CloudService(breakpoint)
                NetworkService(breakpoint)
                SoftwareService(breakpoint)
                DatabaseService(breakpoint)
                Div(
                    attrs = Modifier
                        .color(Theme.Primary.rgb)
                        .fillMaxWidth()
                        .toAttrs()
                ) {
                    P(
                        attrs = Modifier
                            .fillMaxWidth()
                            .textAlign(TextAlign.Center)
                            .fontSize(if (breakpoint < Breakpoint.MD) 12.px else 20.px)
                            .toAttrs()
                    ){
                        Text("Unleashing Digital Potential, Powering Your Success.")
                    }
                    P(
                        attrs = Modifier
                            .fillMaxWidth()
                            .textAlign(TextAlign.Center)
                            .fontSize(if (breakpoint < Breakpoint.MD) 12.px else 20.px)
                            .toAttrs()
                    ) {
                        Link(
                            modifier = NavigationItemStyle.toModifier()
                                .fontSize(18.px)
                                .fontWeight(FontWeight.SemiBold)
                                .textDecorationLine(TextDecorationLine.None),
                            path = Section.Contact.path,
                            text = Section.Contact.title
                        )
                        Text(" for more information!")
                    }
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
    Box {

    }
}

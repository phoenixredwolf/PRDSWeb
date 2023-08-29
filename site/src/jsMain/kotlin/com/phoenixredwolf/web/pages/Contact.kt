package com.phoenixredwolf.web.pages

import androidx.compose.runtime.*
import com.phoenixredwolf.web.components.*
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.models.Theme
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.icons.fa.FaEnvelope
import com.varabyte.kobweb.silk.components.icons.fa.FaPhone
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun Contact() {
    var menuOpened by remember { mutableStateOf(false) }
    val breakpoint = rememberBreakpoint()

    val title = "Get in Touch - Contact Phoenixredwolf Digital Services for Digital Solutions"
    val description = "Reach out to Phoenixredwolf Digital Services for tailored digital services including web and software development, hosting, and more. Contact us today to discuss your project and turn your vision into reality."

    LaunchedEffect(title, description) {
        document.title = title
        document.querySelector("""meta[name="description"]""")!!.setAttribute("content", description)
    }

    Column(
        modifier = Modifier
            .backgroundColor(Colors.WhiteSmoke)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Header(breakpoint, onMenuClicked = { menuOpened = true})
        SectionTitle(section = Section.Contact, breakpoint = breakpoint)
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(if(breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ContactContent()
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

@Composable
private fun ContactContent() {
    val breakpoint = rememberBreakpoint()

    Column(
        modifier = Modifier.fillMaxWidth(
            if (breakpoint >= Breakpoint.MD) 100.percent else 90.percent
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ContactForm(breakpoint)
        H3(
            attrs = Modifier
                .padding(10.px)
                .toAttrs()
        ) {
            Text("OR")
        }
        P(
            attrs = Modifier
                .fillMaxWidth(
                    if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent
                )
                .textAlign(TextAlign.Center)
                .alignContent(AlignContent.Center)
                .toAttrs()
        ) {
            PhoneContact(breakpoint)
            EmailContact(breakpoint)
        }
    }
}

@Composable
fun PhoneContact(breakpoint: Breakpoint) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.px)
            .fontSize(if(breakpoint<=Breakpoint.SM) FontSize.Medium else FontSize.XXLarge)
            .fontWeight(FontWeight.SemiBold)
            .color(Theme.Primary.rgb),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        FaPhone(
            size = if (breakpoint <= Breakpoint.SM) IconSize.SM else IconSize.LG,
            modifier = Modifier.padding(right = 25.px).color(Theme.Secondary.rgb)
        )
        Text("(856) 347-0392")
    }

}
@Composable
fun EmailContact(breakpoint: Breakpoint) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.px)
            .fontSize(if(breakpoint<=Breakpoint.SM) FontSize.Medium else FontSize.XXLarge)
            .fontWeight(FontWeight.SemiBold)
            .color(Theme.Primary.rgb),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        FaEnvelope(
            size = if (breakpoint <= Breakpoint.SM) IconSize.SM else IconSize.LG,
            modifier = Modifier.padding(right = 25.px).color(Theme.Secondary.rgb)
        )
        Text("contact@phoenixredwolf.com")
    }

}

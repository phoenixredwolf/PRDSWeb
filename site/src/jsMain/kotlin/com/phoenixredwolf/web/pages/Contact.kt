package com.phoenixredwolf.web.pages

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.components.ContactForm
import com.phoenixredwolf.web.components.FooterContent
import com.phoenixredwolf.web.components.Header
import com.phoenixredwolf.web.components.SectionTitle
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.util.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.icons.fa.FaEnvelope
import com.varabyte.kobweb.silk.components.icons.fa.FaPhone
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
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
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Header(breakpoint)
        SectionTitle(section = Section.Contact)
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(if(breakpoint >= Breakpoint.MD) 80.percent else 90.percent)
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
            PhoneContact()
            EmailContact()
        }
    }
}

@Composable
fun PhoneContact() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.px)
            .fontFamily(FONT_FAMILY)
            .fontSize(FontSize.XXLarge)
            .fontWeight(FontWeight.SemiBold)
            .color(Theme.Primary.rgb),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        FaPhone(
            size = IconSize.LG,
            modifier = Modifier.padding(right = 25.px).color(Theme.Secondary.rgb)
        )
        Text("(856) 347-0392")
    }

}
@Composable
fun EmailContact() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.px)
            .fontFamily(FONT_FAMILY)
            .fontSize(FontSize.XXLarge)
            .fontWeight(FontWeight.SemiBold)
            .color(Theme.Primary.rgb),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        FaEnvelope(
            size = IconSize.LG,
            modifier = Modifier.padding(right = 25.px).color(Theme.Secondary.rgb)
        )
        Text("contact@phoenixredwolf.com")
    }

}

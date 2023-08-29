package com.phoenixredwolf.web.pages

import androidx.compose.runtime.*
import com.phoenixredwolf.web.components.*
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.sections.services.cloud.CloudService
import com.phoenixredwolf.web.sections.services.database.DatabaseService
import com.phoenixredwolf.web.sections.services.software.SoftwareService
import com.phoenixredwolf.web.sections.services.web.WebService
import com.phoenixredwolf.web.styles.NavigationItemStyle
import com.phoenixredwolf.web.util.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

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

            Column(
                modifier = Modifier
                    .padding(topBottom = 20.px)
                    .fillMaxWidth(if(breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    src = if (breakpoint <= Breakpoint.SM) Res.Image.tag2 else Res.Image.tag1,
                    modifier = Modifier
                        .width(if(breakpoint >= Breakpoint.MD) 80.percent else 90.percent)
                        .padding(topBottom = 10.px)
                )
                P(
                    attrs = Modifier
                        .padding(bottom = 10.px)
                        .fillMaxWidth()
                        .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Medium else FontSize.Large)
                        .textAlign(TextAlign.Justify)
                        .toAttrs()
                ) {
                    Text("Welcome to ")
                    Span(
                        attrs = Modifier
                            .color(Theme.Secondary.rgb)
                            .fontStyle(FontStyle.Italic)
                            .toAttrs()
                    ) {
                        Text("PhoenixRedwolf Digital Services")
                    }
                    Text("– Your One-Stop Destination for Unleashing " +
                            "Digital Potential. Our expertise spans the dynamic realm of technology, offering a " +
                            "comprehensive suite of solutions to propel your business forward. From the intricate " +
                            "world of software development to harnessing the power of business cloud services, " +
                            "optimizing databases, crafting captivating web solutions, and seamlessly networking " +
                            "systems, we are your trusted partners in realizing digital success. At ")
                    Span(
                        attrs = Modifier
                            .color(Theme.Secondary.rgb)
                            .fontStyle(FontStyle.Italic)
                            .toAttrs()
                    ) {
                        Text("PhoenixRedwolf ")
                    }
                    Text(
                            "we fuse innovation, skill, and passion to transform ideas into reality, ensuring your " +
                            "journey through the digital landscape is marked by excellence and advancement. Explore " +
                            "our diverse range of services and let's embark on a journey of limitless possibilities " +
                            "together.")
                }
                Image(
                    src = Res.Image.icon
                )
            }

            SectionTitle(section = Section.Home, breakpoint = breakpoint)

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 20.px)
                    .fillMaxWidth(if(breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SoftwareService(breakpoint)
                DatabaseService(breakpoint)
                WebService(breakpoint)
                CloudService(breakpoint)
//                NetworkService(breakpoint)
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
                            .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Medium else FontSize.XLarge)
                            .color(Theme.Secondary.rgb)
                            .toAttrs()
                    ){
                        Text("Unleashing Digital Excellence: Your Path to Success!")
                    }
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
}

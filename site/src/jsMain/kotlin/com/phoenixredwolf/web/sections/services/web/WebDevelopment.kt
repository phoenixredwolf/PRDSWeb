package com.phoenixredwolf.web.sections.services.web

import androidx.compose.runtime.*
import com.phoenixredwolf.web.components.*
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.models.WebSections
import com.phoenixredwolf.web.util.Res
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.TextAlign
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
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Page("/services/web")
@Composable
fun WebDevelopment() {
    val title = "Leading Web Development Services for a Strong Online Presence | PhoenixRedwolf Digital Services"
    val description = "Unleash the power of your brand online with our comprehensive web development services. " +
            "PhoenixRedwolf Digital Services offers expert solutions, from concept to execution, that create " +
            "visually captivating and functionally robust websites. Elevate user engagement, boost SEO performance, " +
            "and achieve your business goals with our tailored web development expertise. Explore how we can " +
            "transform your digital presence today."

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

            SectionTitle(section = Section.WebDev, breakpoint = breakpoint)

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 20.px)
                    .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .padding(bottom = 10.px)
                        .fillMaxWidth()
                        .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Medium else FontSize.Large)
                        .textAlign(TextAlign.Justify)
                        .toAttrs()
                ) {
                    Text("At PhoenixRedwolf Digital Services, we understand the pivotal role that a " +
                            "well-crafted website plays in the digital success of modern businesses. Our " +
                            "comprehensive Web Development Services encompass everything you need to establish a " +
                            "strong online presence and engage with your target audience effectively. From " +
                            "conceptualization to execution, we take pride in delivering websites that are not just " +
                            "visually stunning but also highly functional and user-centric.")
                }
                ContactOrSched(breakpoint,"to get started!")
                Image(src = Res.Image.webdev)
                P(
                    attrs = Modifier
                        .id(WebSections.WEBDEV.id)
                        .padding(bottom = 10.px)
                        .fillMaxWidth()
                        .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Medium else FontSize.Large)
                        .textAlign(TextAlign.Justify)
                        .toAttrs()
                ){
                    H4(
                        attrs = Modifier
                            .color(Theme.Secondary.rgb)
                            .textAlign(TextAlign.Center)
                            .toAttrs()
                    ) {
                        Text("Comprehensive Web Development Solutions:")
                        Br()
                        Text("From Ground-Up Creation to Seamless Updates")
                    }
                    Text("At PhoenixRedwolf Digital Services, we take pride in offering a full " +
                            "spectrum of web development solutions that cater to businesses at every " +
                            "stage of their digital evolution. Whether you're starting from scratch " +
                            "with a brand-new concept or seeking to breathe new life into your existing " +
                            "online presence, our expertise spans the entire spectrum. Our dedicated team " +
                            "of developers excels in crafting websites from the ground up, carefully curating " +
                            "each element to align with your unique brand identity and objectives. " +
                            "Additionally, we understand that the digital landscape is ever-evolving, " +
                            "and your website requires regular updates to remain relevant and functional. " +
                            "Our services extend to seamless updates and enhancements for existing websites, " +
                            "ensuring that your online platform consistently meets the demands of modern users. " +
                            "With a commitment to innovation, user experience, and technical excellence, we " +
                            "are your partner in achieving digital success, no matter where you are on your " +
                            "online journey.")
                }
                ContactOrSched(breakpoint,"to get started!")
                P(
                    attrs = Modifier
                        .id(WebSections.HOSTING.id)
                        .padding(bottom = 10.px)
                        .fillMaxWidth()
                        .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Medium else FontSize.Large)
                        .textAlign(TextAlign.Justify)
                        .toAttrs()
                ) {
                    H4(
                        attrs = Modifier
                            .color(Theme.Secondary.rgb)
                            .textAlign(TextAlign.Center)
                            .toAttrs()
                    ) {
                        Text("Complete Your Digital Package with Our Web Hosting Services")
                    }
                    Text(
                        "In addition to our exceptional web development offerings, PhoenixRedwolf " +
                                "Digital Services proudly extends its expertise to encompass seamless web " +
                                "hosting solutions. We understand that a well-developed website deserves reliable " +
                                "and high-performing hosting to ensure optimal user experiences. Our web hosting " +
                                "services provide the foundation for your digital presence, offering fast loading " +
                                "times, robust security measures, and continuous support. With a range of hosting " +
                                "options tailored to your specific needs, we guarantee that your website will " +
                                "have a stable and secure online home, allowing you to focus on what truly " +
                                "matters – growing your business and engaging your audience. Partner with us " +
                                "for comprehensive web solutions that cover every aspect of your online journey."
                    )
                }
                ContactOrSched(breakpoint,"to get started!")
                P(
                    attrs = Modifier
                        .id(WebSections.ADMIN.id)
                        .padding(bottom = 10.px)
                        .fillMaxWidth()
                        .fontSize(if (breakpoint < Breakpoint.MD) FontSize.Medium else FontSize.Large)
                        .textAlign(TextAlign.Justify)
                        .toAttrs()
                ) {
                    H4(
                        attrs = Modifier
                            .color(Theme.Secondary.rgb)
                            .textAlign(TextAlign.Center)
                            .toAttrs()
                    ) {
                        Text("Elevate Your Online Operations with Our Website Administration Services")
                    }
                    Text(
                        "At PhoenixRedwolf Digital Services, we recognize that managing a website involves " +
                                "more than just its initial development. Our comprehensive suite of services " +
                                "includes expert website administration to ensure your digital presence remains " +
                                "at its peak performance. Our experienced administrators take care of the technical " +
                                "intricacies, security updates, content management, and overall health of your " +
                                "website, allowing you to focus on your core business objectives. From routine " +
                                "maintenance to troubleshooting unexpected issues, we've got you covered. With our " +
                                "website administration services, you can rest assured that your website operates " +
                                "seamlessly, delivers an exceptional user experience, and stays ahead of potential " +
                                "challenges. Partner with us to optimize your online platform for success while " +
                                "enjoying the peace of mind that comes with having a dedicated team of experts " +
                                "managing every aspect of your website's journey."
                    )
                }
                ContactOrSched(breakpoint,"to get started!")
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
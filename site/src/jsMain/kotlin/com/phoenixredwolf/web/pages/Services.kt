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
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.navigation.Link
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
        Link(
            path = "services/software"
        ) {
            Column(
                modifier = Modifier
                    .padding(10.px)
            ) {
                P(
                    attrs = Modifier
                        .textAlign(TextAlign.Center)
                        .margin(bottom = 0.px)
                        .color(Theme.Primary.rgb)
                        .fontWeight(FontWeight.SemiBold)
                        .fontSize(FontSize.Large)
                        .toAttrs()
                ) {
                    Text("Software Development Services")
                }
                P(
                    attrs = Modifier
                        .fillMaxWidth()
                        .textAlign(TextAlign.Center)
                        .color(Theme.Secondary.rgb)
                        .fontWeight(FontWeight.Normal)
                        .fontSize(FontSize.Medium)
                        .toAttrs()
                ){
                    Text("Click for available services")
                }
            }
        }

        P(
            attrs = Modifier
                .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent)
                .fontSize(if (breakpoint >= Breakpoint.MD) FontSize.Large else FontSize.Medium)
                .textAlign(TextAlign.Justify)
                .toAttrs()
        ) {
            Text(
                "At PhoenixRedwolf Digital Services, our software development offerings stand as a " +
                        "testament to innovation and functionality. Our expert developers specialize in " +
                        "turning concepts into high-performing software solutions that cater to your unique " +
                        "business needs. From streamlined applications that enhance productivity to engaging " +
                        "user interfaces that captivate audiences, we're committed to crafting software that " +
                        "not only meets but exceeds expectations. With a deep understanding of diverse " +
                        "industries and cutting-edge technologies, we're here to architect the digital tools " +
                        "that drive your success."
            )
        }
        Link(
            path = "services/database"
        ) {
            Column(
                modifier = Modifier
                    .padding(10.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .textAlign(TextAlign.Center)
                        .margin(bottom = 0.px)
                        .color(Theme.Primary.rgb)
                        .fontWeight(FontWeight.SemiBold)
                        .fontSize(FontSize.Large)
                        .toAttrs()
                ) {
                    Text("Database Services")
                }
                P(
                    attrs = Modifier
                        .fillMaxWidth()
                        .textAlign(TextAlign.Center)
                        .color(Theme.Secondary.rgb)
                        .fontWeight(FontWeight.Normal)
                        .fontSize(FontSize.Medium)
                        .toAttrs()
                ){
                    Text("Click for available services")
                }
            }
        }

        P(
            attrs = Modifier
                .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent)
                .fontSize(if (breakpoint >= Breakpoint.MD) FontSize.Large else FontSize.Medium)
                .textAlign(TextAlign.Justify)
                .toAttrs()
        ) {
            Text(
                "Navigate the intricate world of data with confidence through our comprehensive database " +
                        "services at PhoenixRedwolf Digital Services. Whether it's creating robust databases tailored " +
                        "to your requirements, optimizing existing systems for peak performance, or seamlessly " +
                        "migrating your valuable data to new horizons, our skilled experts are here to ensure that " +
                        "your data infrastructure is not just a storage solution, but a strategic asset. With " +
                        "meticulous attention to detail, security, and efficiency, we empower you to harness the full" +
                        " potential of your data, facilitating smarter decisions and unlocking new opportunities."
            )
        }
        Link(
            path = "services/web"
        ) {
            Column(
                modifier = Modifier
                    .padding(10.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .textAlign(TextAlign.Center)
                        .margin(bottom = 0.px)
                        .color(Theme.Primary.rgb)
                        .fontWeight(FontWeight.SemiBold)
                        .fontSize(FontSize.Large)
                        .toAttrs()
                ) {
                    Text("Web Development Services")
                }
                P(
                    attrs = Modifier
                        .fillMaxWidth()
                        .textAlign(TextAlign.Center)
                        .color(Theme.Secondary.rgb)
                        .fontWeight(FontWeight.Normal)
                        .fontSize(FontSize.Medium)
                        .toAttrs()
                ){
                    Text("Click for available services")
                }
            }
        }

        P(
            attrs = Modifier
                .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent)
                .fontSize(if (breakpoint >= Breakpoint.MD) FontSize.Large else FontSize.Medium)
                .textAlign(TextAlign.Justify)
                .toAttrs()
        ) {
            Text(
                "Embark on a journey of digital transformation with our exceptional web development services " +
                        "at PhoenixRedwolf Digital Services. We understand that your online presence is a reflection " +
                        "of your brand's identity, and our dedicated team of designers and developers work tirelessly " +
                        "to bring your vision to life. Whether you need a captivating website that engages visitors, " +
                        "an e-commerce platform that drives sales, or a dynamic web application that streamlines " +
                        "processes, we're committed to delivering solutions that combine aesthetics, functionality, " +
                        "and user experience. At PhoenixRedwolf, we craft digital experiences that resonate with your " +
                        "audience and leave a lasting impression."
            )
        }
        Link(
            path = "services/cloud"
        ) {
            Column(
                modifier = Modifier
                    .padding(10.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .textAlign(TextAlign.Center)
                        .margin(bottom = 0.px)
                        .color(Theme.Primary.rgb)
                        .fontWeight(FontWeight.SemiBold)
                        .fontSize(FontSize.Large)
                        .toAttrs()
                ) {
                    Text("Cloud Services")
                }
                P(
                    attrs = Modifier
                        .fillMaxWidth()
                        .textAlign(TextAlign.Center)
                        .color(Theme.Secondary.rgb)
                        .fontWeight(FontWeight.Normal)
                        .fontSize(FontSize.Medium)
                        .toAttrs()
                ){
                    Text("Click for available services")
                }
            }
        }

        P(
            attrs = Modifier
                .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent)
                .fontSize(if (breakpoint >= Breakpoint.MD) FontSize.Large else FontSize.Medium)
                .textAlign(TextAlign.Justify)
                .toAttrs()
        ) {
            Text(
                "Elevate your business to new heights with our transformative cloud services at " +
                        "PhoenixRedwolf Digital Services. As technology evolves, so do the possibilities for " +
                        "scalability, efficiency, and innovation. Our cloud experts guide you through every step of " +
                        "the cloud journey, from initial setup and seamless migration to ongoing management and " +
                        "optimization. Whether you're seeking to harness the power of public, private, or hybrid " +
                        "clouds, we tailor solutions to your specific needs, ensuring your data is secure, accessible, " +
                        "and agile. Embrace the future of business operations with our cloud services that empower " +
                        "you to do more, achieve more, and thrive in the digital era."
            )
        }
        Link(
            path = "services/network"
        ) {
            Column(
                modifier = Modifier
                    .padding(10.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .textAlign(TextAlign.Center)
                        .margin(bottom = 0.px)
                        .color(Theme.Primary.rgb)
                        .fontWeight(FontWeight.SemiBold)
                        .fontSize(FontSize.Large)
                        .toAttrs()
                ) {
                    Text("Networking Services")
                }
                P(
                    attrs = Modifier
                        .fillMaxWidth()
                        .textAlign(TextAlign.Center)
                        .color(Theme.Secondary.rgb)
                        .fontWeight(FontWeight.Normal)
                        .fontSize(FontSize.Medium)
                        .toAttrs()
                ){
                    Text("Click for available services")
                }
            }
        }

        P(
            attrs = Modifier
                .fillMaxWidth(if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent)
                .fontSize(if (breakpoint >= Breakpoint.MD) FontSize.Large else FontSize.Medium)
                .textAlign(TextAlign.Justify)
                .toAttrs()
        ) {
            Text(
                "Unleash the potential of seamless connectivity with our comprehensive computer networking " +
                        "services at PhoenixRedwolf Digital Services. In today's interconnected world, a strong " +
                        "and reliable network is the backbone of successful operations. Our networking experts design, " +
                        "configure, and manage networks that not only facilitate communication but also empower " +
                        "collaboration and growth. Whether it's LAN installation, WAN optimization, or network " +
                        "security enhancements, we're dedicated to creating solutions that keep your systems running " +
                        "smoothly and securely. Trust us to build the pathways that keep your business connected and " +
                        "thriving in the digital landscape."
            )
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

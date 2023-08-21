package com.phoenixredwolf.web.pages

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.components.BackToTopButton
import com.phoenixredwolf.web.components.FooterContent
import com.phoenixredwolf.web.components.Header
import com.phoenixredwolf.web.components.SectionTitle
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.util.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun About() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(Colors.WhiteSmoke),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        val breakpoint = rememberBreakpoint()
        Header(breakpoint)

        SectionTitle(
            section = Section.About
        )
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(if(breakpoint >= Breakpoint.MD) 80.percent else 90.percent)
        ) {
            P(
                attrs = Modifier
                    .margin(top= 20.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(25.px)
                    .fontStyle(FontStyle.Italic)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.OnPrimaryContainer.rgb)
                    .toAttrs()
            ) {
                Text("At ")
                Span(
                    attrs = Modifier.color(Theme.Secondary.rgb).fontWeight(FontWeight.SemiBold).toAttrs()
                ){Text("PhoenixRedwolf Digital Services") }
                Text(", our mission is to empower businesses and organizations " +
                        "to thrive in the digital age by delivering exceptional technical consulting, web development " +
                        "and administration, cloud migration, and network installation and administration services. " +
                        "We are dedicated to providing innovative and reliable solutions that propel our clients " +
                        "towards success, enabling them to stay ahead of the competition and achieve their goals.")
            }
            P(
                attrs = Modifier
                    .margin(top= 20.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(25.px)
                    .fontStyle(FontStyle.Italic)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.OnPrimaryContainer.rgb)
                    .toAttrs()
            ) {
                Text(value = "Our team of skilled professionals is committed to understanding the unique needs and " +
                        "challenges of each client. By leveraging cutting-edge technologies and industry best practices, " +
                        "we tailor our services to offer bespoke solutions that optimize efficiency, enhance productivity, " +
                        "and foster growth. We take pride in our ability to deliver on time and within budget, while " +
                        "maintaining the highest standards of quality and security.")
            }
            P(
                attrs = Modifier
                    .margin(top= 20.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(25.px)
                    .fontStyle(FontStyle.Italic)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.OnPrimaryContainer.rgb)
                    .toAttrs()
            ) {
                Text(value = "At ")
                Span(
                    attrs = Modifier.color(Theme.Secondary.rgb).fontWeight(FontWeight.SemiBold).toAttrs()
                ){Text("PhoenixRedwolf") }
                Text(", we foster a culture of collaboration, continuous learning, and " +
                        "adaptability. We stay at the forefront of the rapidly evolving digital landscape to provide " +
                        "our clients with the most up-to-date and effective strategies for success. Our transparent " +
                        "and customer-centric approach ensures open communication and complete client satisfaction at " +
                        "every stage of the engagement.")
            }
            P(
                attrs = Modifier
                    .margin(top= 20.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(25.px)
                    .fontStyle(FontStyle.Italic)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.OnPrimaryContainer.rgb)
                    .toAttrs()
            ) {
                Text(value = "As a responsible corporate citizen, we are committed to minimizing our environmental " +
                        "impact and supporting sustainable business practices. We strive to make a positive difference " +
                        "in the communities we serve, promoting inclusivity and diversity in all aspects of our " +
                        "operations.")
            }
            P(
                attrs = Modifier
                    .margin(top= 20.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(25.px)
                    .fontStyle(FontStyle.Italic)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.OnPrimaryContainer.rgb)
                    .toAttrs()
            ) {
                Text(value = "With integrity and passion, we forge enduring partnerships with our clients, seeking to " +
                        "become an extension of their teams. Together, we embrace challenges, conquer complexities, " +
                        "and transform possibilities into realities. At ")
                Span(
                    attrs = Modifier.color(Theme.Secondary.rgb).fontWeight(FontWeight.SemiBold).toAttrs()
                ){
                    Text("PhoenixRedwolf Digital Services")
                }
                Text(", we are the catalyst for your digital journey, igniting the power of technology to drive " +
                        "lasting and meaningful success for your business.")
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                P(
                    attrs = Modifier
                        .margin(topBottom = 20.px)
                        .fontFamily(FONT_FAMILY)
                        .fontSize(if(breakpoint >= Breakpoint.LG) 35.px else 20.px)
                        .fontWeight(FontWeight.Bolder)
                        .color(Theme.Primary.rgb)
                        .toAttrs()
                ) {
                    Text("Unleashing Digital Potential, Powering Your Success.")
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
}

package com.phoenixredwolf.web.pages

import androidx.compose.runtime.*
import com.phoenixredwolf.web.components.*
import com.phoenixredwolf.web.models.Section
import com.phoenixredwolf.web.models.Theme
import com.phoenixredwolf.web.util.Res
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.cssRem
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
                .backgroundColor(Theme.LightGray.rgb),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            val breakpoint = rememberBreakpoint()
            Header(breakpoint, onMenuClicked = { menuOpened = true})

            Column(
                modifier = Modifier
                    .padding(top = 175.px, bottom = 20.px)
                    .fillMaxWidth(90.percent),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Image(
                            modifier = Modifier
                                .opacity(0.2)
                                .fillMaxWidth(50.percent),
                            src = Res.Image.icon
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        H1(
                            attrs = Modifier
                                .attrsModifier {
                                    attr("class", "mb-12 w-full")
                                }
                                .fillMaxWidth()
                                .fontWeight(FontWeight.Bold)
                                .fontSize(if(breakpoint >= Breakpoint.MD) 5.cssRem else 2.cssRem)
                                .color(Colors.DarkBlue)
                                .textAlign(TextAlign.Center)
                                .toAttrs()
                        ) {
                            Text("IT Solutions")
                        }
                        H3(
                            attrs = Modifier
                                .fillMaxWidth()
                                .color(Colors.DarkBlue)
                                .fontWeight(FontWeight.Bold)
                                .fontSize(if(breakpoint >= Breakpoint.MD) 3.cssRem else (1.5).cssRem)
                                .textAlign(TextAlign.Center)
                                .toAttrs()
                        ) {
                            Text("Implementation, Consulting, & Support")
                        }
                        Image(
                            src = if (breakpoint <= Breakpoint.SM) Res.Image.tag2 else Res.Image.tag1,
                            modifier = Modifier
                                .width(if(breakpoint >= Breakpoint.MD) 80.percent else 90.percent)
                                .padding(topBottom = 10.px)
                        )
                    }
                }
                P(
                    attrs = Modifier
                        .padding(top = 10.px)
                        .fillMaxWidth()
                        .fontSize(if(breakpoint >= Breakpoint.MD) 2.cssRem else (1.25).cssRem)
                        .fontStyle(FontStyle.Italic)
                        .textAlign(TextAlign.Center)
                        .toAttrs()
                ) {
                    Text("We'll add value to your business and help grow your bottom line!")
                }
            }

            SectionTitle(section = Section.Home, breakpoint = breakpoint)

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(topBottom = 20.px)
                    .fillMaxWidth(90.percent),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier
                        .padding(topBottom = 20.px)
                        .fillMaxWidth()
                ) {
                    if (breakpoint >= Breakpoint.MD) {
                        ServiceButtons()
                    } else {
                        ServiceButtons(true)
                    }
                }
                Row(
                    modifier = Modifier
                        .padding(topBottom = 20.px)
                        .fillMaxWidth()
                ) {
                    if (breakpoint <= Breakpoint.SM) {
                        Slider(width = 80.percent)
                    } else if (breakpoint <= Breakpoint.MD) {
                        Slider(40.percent)
                    } else {
                        Slider(30.percent)
                    }
                }
                ContactOrSched(breakpoint, "To Get Started!")
            }
//            Column(
//                modifier = Modifier
//                    .height(200.px)
//                    .fillMaxWidth(90.percent)
//                    .padding(topBottom = 40.px),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
//            ) {
//            }
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
private fun ServiceButtons(compact: Boolean = false) {
    if (compact) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().padding(10.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .fontSize(FontSize.Medium)
                        .fontWeight(FontWeight.SemiBold)
                        .textAlign(TextAlign.Center)
                        .toAttrs()
                ) {
                    Text("I'm not sure what I need.")
                }
                NavButton("Consultations", "")
            }
            Column(
                modifier = Modifier.fillMaxWidth().padding(10.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .fontSize(FontSize.Medium)
                        .fontWeight(FontWeight.SemiBold)
                        .textAlign(TextAlign.Center)
                        .toAttrs()
                ) {
                    Text("I know what service I want.")
                }
                NavButton("Services", "/services")
            }
        }
    } else {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().padding(right =5.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .fontSize(FontSize.XLarge)
                        .fontWeight(FontWeight.SemiBold)
                        .textAlign(TextAlign.Center)
                        .toAttrs()
                ) {
                    Text("I'm not sure what I need.")
                }
                NavButton("Consultations", "")
            }
            Column(
                modifier = Modifier.fillMaxWidth().padding(left = 5.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                P(
                    attrs = Modifier
                        .fontSize(FontSize.XLarge)
                        .fontWeight(FontWeight.SemiBold)
                        .textAlign(TextAlign.Center)
                        .toAttrs()
                ) {
                    Text("I know what service I want.")
                }
                NavButton("Services", "/services")
            }
        }
    }
}

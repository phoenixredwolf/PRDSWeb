package com.phoenixredwolf.web.sections.privacy

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.AlignContent
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun InfoCollection() {
    Button(
        attrs = Modifier
            .attrsModifier {
                attr("class", "collapsible d-flex flex-row")
            }
            .toAttrs()
    ) {
        Row(
            modifier = Modifier
                .classNames("p-2")
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            H3(
                attrs = Modifier
                    .toAttrs()
            ) {
                Text("Information We Collect")
            }
            P(
                attrs = Modifier
                    .attrsModifier {
                        attr("class", "flex-fill align-middle")
                    }
                    .fillMaxHeight()
                    .alignContent(AlignContent.Center)
                    .textAlign(TextAlign.End)
                    .padding(top = 10.px)
                    .toAttrs()
            ) {
                Text("What information do we collect from our customers?")
            }
        }
    }
    Div(
        attrs = Modifier
            .attrsModifier {
                attr("class", "content d-flex flex-column mb-3")
            }
            .width(100.percent)
            .toAttrs()
    ) {
        P(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "fs-6 mt-3")
                }
                .toAttrs()
        ) {
            Text(
                "It is always up to you whether to disclose personally identifiable information to us, although " +
                        "if you elect not to do so, we reserve the right not to register you as a user or provide " +
                        "you with any products or services. This website collects various types of information, such as:"
            )
            Br()
            Br()
            Ul {
                Li {
                    Text(
                        "Voluntarily provided information which may include your name, address, email address, " +
                                "billing and/or credit card information etc. which may be used when you purchase products " +
                                "and/or services and to deliver the services you have requested."
                    )
                }
            }
        }
        P(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "fs-6")
                }
                .toAttrs()
        ) {
            Text(
                "In addition, PhoenixRedwolf Digital Services, L.L.C. may have the occasion to collect " +
                        "non-personal anonymous demographic information, such as age, gender, household income, " +
                        "political affiliation, race and religion, as well as the type of browser you are using, IP " +
                        "address, or type of operating system, which will assist us in providing and maintaining " +
                        "superior quality service."
            )
        }
        P(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "fs-6")
                }
                .toAttrs()
        ) {
            Text(
                "Please rest assured that this site will only collect personal information that you knowingly " +
                        "and willingly provide to us by way of surveys, completed membership forms, and emails. It " +
                        "is the intent of this site to use personal information only for the purpose for which it was " +
                        "requested, and any additional uses specifically provided for on this Policy."
            )
        }

    }
}
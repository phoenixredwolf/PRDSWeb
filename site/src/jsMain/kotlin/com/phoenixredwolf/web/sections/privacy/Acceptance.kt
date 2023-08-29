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
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun Acceptance() {
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
                Text("Acceptance")
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
                Text("Your acceptance of the policy.")
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
                "By using this website, you are hereby accepting the terms and conditions stipulated within the " +
                        "Privacy Policy Agreement. If you are not in agreement with our terms and conditions, then " +
                        "you should refrain from further use of our sites. In addition, your continued use of our " +
                        "website following the posting of any updates or changes to our terms and conditions shall " +
                        "mean that you agree and acceptance of such changes."
            )
        }
        H4(
            attrs = Modifier
                .classNames("mt-3")
                .toAttrs()
        ) {
            Text("How to Contact Us")
        }
        P(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "fs-6")
                }
                .toAttrs()
        ) {
            Text(
                "If you have any questions or concerns regarding the Privacy Policy Agreement related to our " +
                        "website, please feel free to contact us at the following email, telephone number or mailing " +
                        "address."
            )
        }
        P(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "fs-6")
                }
                .toAttrs()
        ) {
            Text("Email: ")
            Link(
                path = "mailto:contact@phoenixredwolf.com?subject=Privacy Policy",
                content = {
                    Text("contact@phoenixredolf.com")
                }
            )
        }
        P(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "fs-6")
                }
                .toAttrs()
        ) {
            Text("Telephone Number: ")
            Link(
                path = "tel:8563470392",
                content = {
                    Text("+1 (856) 347-0392")
                }
            )
        }
        P(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "fs-6")
                }
                .toAttrs()
        ) {
            Text("Mailing Address: ")
            Br()
            Text("PhoenixRedwolf Digital Services, L.L.C.")
            Br()
            Text("1301 Lafayette Avenue")
            Br()
            Text("West Deptford, New Jersey 08096")
        }

    }

}
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
fun InfoSecurity() {
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
                Text("Protecting Your Data")
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
                Text("How do we protect your data?")
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
                "PhoenixRedwolf Digital Services, L.L.C. takes precautions to protect your information. When " +
                        "you submit sensitive information via the website, your information is protected both online " +
                        "and offline. Wherever we collect sensitive information (e.g. credit card information), that " +
                        "information is encrypted and transmitted to us in a secure way. You can verify this by " +
                        "looking for a lock icon in the address bar and looking for \"https\" at the beginning of the " +
                        "address of the webpage."
            )
        }
        P(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "fs-6 mt-3")
                }
                .toAttrs()
        ) {
            Text(
                "While we use encryption to protect sensitive information transmitted online, we also protect " +
                        "your information offline. Only employees who need the information to perform a specific job " +
                        "(for example, billing or customer service) are granted access to personally identifiable " +
                        "information. The computers and servers in which we store personally identifiable information " +
                        "are kept in a secure environment. This is all done to prevent any loss, misuse, unauthorized " +
                        "access, disclosure or modification of the user's personal information under our control."
            )
        }
        P(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "fs-6 mt-3")
                }
                .toAttrs()
        ) {
            Text(
                "The company also uses Secure Socket Layer (SSL) for authentication and private communications " +
                        "to build users' trust and confidence in the internet and website use by providing simple and " +
                        "secure access and communication of credit card and personal information"
            )
        }

    }
}
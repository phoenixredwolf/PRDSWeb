package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.phoenixredwolf.web.styles.IndexPageButtonStyle
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Text

@Composable
fun NavButton(text:String, path: String) {
    A(
        attrs = IndexPageButtonStyle.toModifier()
            .fillMaxWidth(60.percent)
            .borderRadius(r=10.px)
            .attrsModifier {
                attr("href", path)
            }
            .toAttrs()
    ) {

        Button(
            attrs = IndexPageButtonStyle.toModifier()
                .attrsModifier {
                    attr("href", path)
                }
                .fillMaxWidth()
                .borderRadius(r = 10.px)
                .toAttrs(),
            content = {
                Text(text)
                }
        )
    } /*{
//        Link(
//            modifier = IndexPageButtonStyle.toModifier()
//                .fontWeight(FontWeight.SemiBold)
//                .fontSize(FontSize.Large)
//                .fillMaxWidth()
//                .textDecorationLine(TextDecorationLine.None),
//            text = text,
//            path = path
//        )
    }*/
}
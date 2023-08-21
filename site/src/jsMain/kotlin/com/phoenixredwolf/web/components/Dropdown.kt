package com.phoenixredwolf.web.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.dom.*

@Composable
fun Dropdown(selectedValue: String, onSelectedValueChanged: (String) -> Unit) {
    Div {
        Button(
            attrs = Modifier
                .attrsModifier {
                    attr("class", "btn btn-secondary dropdown-toggle")
                    attr("type", "button")
                    attr("data-bs-toggle", "dropdown")
                    attr("aria-expanded", "false")
                }
                .toAttrs()
        ) {
            Text("Select an Option")
        }

        Ul(attrs = { classes("dropdown-menu") }) {
            for (option in listOf("Phone", "Email")) {
                Li {
                    A(
                        attrs = {
                            classes("dropdown-item")
                            onClick {
                                onSelectedValueChanged(option)
                            }
                        }
                    ) {
                        Text(option)
                    }
                }
            }
        }

        P {
            Text("Selected value: $selectedValue")
        }
    }
}
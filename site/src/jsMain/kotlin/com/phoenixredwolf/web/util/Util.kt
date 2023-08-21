package com.phoenixredwolf.web.util

import androidx.compose.runtime.Composable
import kotlinx.browser.document
import org.jetbrains.compose.web.dom.Select
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.KeyboardEvent

fun phoneMask() {
    val phoneInput = document.getElementById("inputPhone") as? HTMLInputElement

    phoneInput?.addEventListener("keydown", { event ->
        val keyCode = (event as? KeyboardEvent)?.keyCode ?: 0
        val inputValue = phoneInput.value

        // Allow only numeric keys and backspace
        if ((keyCode in 48..57 || keyCode in 96..105 || keyCode == 8) && inputValue.length < 14) {
            val unmaskedValue = inputValue.replace(Regex("[^0-9]"), "")

            val maskedValue = buildString {
                for (i in unmaskedValue.indices) {
                    if (i == 0) append("(")
                    if (i == 3) append(") ")
                    if (i == 6) append("-")
                    append(unmaskedValue[i])
                }
            }

            phoneInput.value = maskedValue
        } else {
            event.preventDefault()
        }
    })

}

@Composable
fun DropdownMenu() {
    Select(attrs = {
        onChange {
            val selectedValue = it.value
            // Handle the selected value
        }
    }) {
        Text("Phone")
        Text("Email")
    }
}
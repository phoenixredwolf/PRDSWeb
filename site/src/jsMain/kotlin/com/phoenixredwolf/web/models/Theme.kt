package com.phoenixredwolf.web.models

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

enum class Theme(val hex: String, val rgb: CSSColorValue) {
    Primary(hex = "#0054d6", rgb = rgb(r = 0, g = 84, b = 214)),
    Secondary(hex = "#066d34", rgb = rgb(r = 6, g = 109, b = 52)),
    Tertiary(hex = "#735471", rgb = rgb(r = 115, g = 84, b = 113)),
    Error(hex = "#ba1a1a", rgb = rgb(r = 186, g = 26, b = 26)),
    Background(hex = "#fefbff", rgb = rgb(r = 254, g = 251, b = 255)),
    Outline(hex = "#757680", rgb = rgb(r = 117, g = 118, b = 128)),
    OnPrimary(hex = "#FFFFFF", rgb = rgb(r = 255, g = 255, b = 255)),
    OnSecondary(hex = "#FFFFFF", rgb = rgb(r = 255, g = 255, b = 255)),
    OnTertiary(hex = "#FFFFFF", rgb = rgb(r = 255, g = 255, b = 255)),
    OnError(hex = "#FFFFFF", rgb = rgb(r = 255, g = 255, b = 255)),
    OnBackground(hex = "#1b1b1f", rgb = rgb(r = 27, g = 27, b = 31)),
    PrimaryContainer(hex = "#dae1ff", rgb = rgb(r = 218, g = 225, b = 255)),
    SecondaryContainer(hex = "#9cf6ae", rgb = rgb(r = 156, g = 246, b = 174)),
    TertiaryContainer(hex = "#ffd6f9", rgb = rgb(r = 255, g = 214, b = 249)),
    ErrorContainer(hex = "#ffdad6", rgb = rgb(r = 255, g = 218, b = 214)),
    Surface(hex = "#fefbff", rgb = rgb(r = 254, g = 251, b = 255)),
    SurfaceVariant(hex = "#e2e2ec", rgb = rgb(r = 226, g = 226, b = 226)),
    OnPrimaryContainer(hex = "#001849", rgb = rgb(r = 0, g = 24, b = 73)),
    OnSecondaryContainer(hex = "#00210b", rgb = rgb(r = 0, g = 33, b = 11)),
    OnTertiaryContainer(hex = "#2b122b", rgb = rgb(r = 43, g = 18, b = 43)),
    OnErrorContainer(hex = "#410002", rgb = rgb(r = 65, g = 0, b = 2)),
    OnSurface(hex = "#1b1b1f", rgb = rgb(r = 27, g = 27, b = 31)),
    OnSurfaceVariant(hex = "#45464f", rgb = rgb(r = 69, g = 70, b = 79)),

    // Individual Colors
    Gray (hex = "#CFCFCF", rgb = rgb(r = 207, g = 207, b = 207)),
    LightGray(hex = "#EDEDED", rgb = rgb(r = 237, g = 237, b = 237)),
    LighterGray(hex = "#F9F9F9", rgb = rgb(r = 249, g = 249, b = 249))
}
package com.phoenixredwolf.web.models

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

enum class Theme(val hex: String, val rgb: CSSColorValue) {
    Primary(hex = "#3e3ef7", rgb = rgb(r = 62, g = 62, b = 247)),
    Secondary(hex = "#006e06", rgb = rgb(r = 0, g = 110, b = 6)),
    Tertiary(hex = "#c00003", rgb = rgb(r = 192, g = 0, b = 3)),
    Error(hex = "#ba1a1a", rgb = rgb(r = 186, g = 26, b = 26)),
    Background(hex = "#fffbff", rgb = rgb(r = 255, g = 251, b = 255)),
    Outline(hex = "#777680", rgb = rgb(r = 119, g = 118, b = 128)),
    OnPrimary(hex = "#FFFFFF", rgb = rgb(r = 255, g = 255, b = 255)),
    OnSecondary(hex = "#FFFFFF", rgb = rgb(r = 255, g = 255, b = 255)),
    OnTertiary(hex = "#FFFFFF", rgb = rgb(r = 255, g = 255, b = 255)),
    OnError(hex = "#FFFFFF", rgb = rgb(r = 255, g = 255, b = 255)),
    OnBackground(hex = "#1c1b1f", rgb = rgb(r = 119, g = 118, b = 128)),
    PrimaryContainer(hex = "#e1e0ff", rgb = rgb(r = 225, g = 224, b = 255)),
    SecondaryContainer(hex = "#76ff65", rgb = rgb(r = 118, g = 255, b = 101)),
    TertiaryContainer(hex = "#ffdad5", rgb = rgb(r = 255, g = 218, b = 213)),
    ErrorContainer(hex = "#ffdad6", rgb = rgb(r = 255, g = 218, b = 214)),
    Surface(hex = "#fffbff", rgb = rgb(r = 255, g = 251, b = 255)),
    SurfaceVariant(hex = "#e4e1ec", rgb = rgb(r = 228, g = 225, b = 236)),
    OnPrimaryContainer(hex = "#06006c", rgb = rgb(r = 6, g = 0, b = 108)),
    OnSecondaryContainer(hex = "#002201", rgb = rgb(r = 0, g = 34, b = 1)),
    OnTertiaryContainer(hex = "#410000", rgb = rgb(r = 65, g = 0, b = 0)),
    OnErrorContainer(hex = "#410002", rgb = rgb(r = 65, g = 0, b = 2)),
    OnSurface(hex = "#1c1b1f", rgb = rgb(r = 28, g = 27, b = 31)),
    OnSurfaceVariant(hex = "#46464f", rgb = rgb(r = 70, g = 70, b = 79)),

    // Individual Colors
    Gray (hex = "#CFCFCF", rgb = rgb(r = 207, g = 207, b = 207)),
    LightGray(hex = "#EDEDED", rgb = rgb(r = 237, g = 237, b = 237)),
    LighterGray(hex = "#F9F9F9", rgb = rgb(r = 249, g = 249, b = 249))
}
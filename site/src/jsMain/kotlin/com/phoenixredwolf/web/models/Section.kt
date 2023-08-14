package com.phoenixredwolf.web.models

enum class Section(
    val id: String,
    val title: String,
    val subtitle: String,
    val path: String
) {
    Home(
        id = "home",
        title = "Home",
        subtitle = "",
        path = "/"
    ),
    About(
        id = "about",
        title = "About",
        subtitle = "Our Mission",
        path = "/about"
    ),
    Services(
        id = "services",
        title = "Services",
        subtitle = "What we do",
        path = "/services"
    ),
    Contact(
        id = "contact",
        title = "Contact Us",
        subtitle = "Get in touch",
        path = "/contact"
    )
}
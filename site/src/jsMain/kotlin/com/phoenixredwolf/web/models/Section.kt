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
        subtitle = "How We Can Help You",
        path = "/"
    ),
    About(
        id = "about",
        title = "About",
        subtitle = "Who We Are",
        path = "/about"
    ),
    Contact(
        id = "contact",
        title = "Contact Us",
        subtitle = "Get in touch",
        path = "/contact"
    ),
    Services(
        id = "services",
        title = "Services",
        subtitle = "What we do",
        path = "/services"
    )
}
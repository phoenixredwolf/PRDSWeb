package com.phoenixredwolf.web.models

enum class Section: Data {
    Home {
        override val id: String
            get() = "home"
        override val title: String
            get() = "Home"
        override val subtitle: String
            get() = "How We Can Help You"
        override val path: String
            get() = "/"
    },
    Services {
        override val id: String
            get() = "services"
        override val title: String
            get() = "Services"
        override val subtitle: String
            get() = "What we do"
        override val path: String
            get() = "/services"
    },
    About {
        override val id: String
            get() = "about"
        override val title: String
            get() = "About"
        override val subtitle: String
            get() = "Who We Are"
        override val path: String
            get() = "/about"
    },
    Contact {
        override val id: String
            get() = "contact"
        override val title: String
            get() = "Contact Us"
        override val subtitle: String
            get() = "Get in touch"
        override val path: String
            get() = "/contact"
    },
    Privacy {
        override val id: String
            get() = "privacy"
        override val title: String
            get() = "Privacy Policy"
        override val subtitle: String
            get() = "Your Rights"
        override val path: String
            get() = "/privacy"
    },
    WebDev {
        override val id: String
            get() = "webdev"
        override val title: String
            get() = "Web Development"
        override val subtitle: String
            get() = "Full Service Website Development"
        override val path: String
            get() = "/services/webdev"
    },
    Software{
        override val id: String
            get() = "software"
        override val title: String
            get() = "Software Development"
        override val subtitle: String
            get() = "Crafting Innovative Solutions for Desktop and Mobile Platforms"
        override val path: String
            get() = "/services/software"

    }
}
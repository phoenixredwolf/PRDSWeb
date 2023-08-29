package com.phoenixredwolf.web.models

enum class WebSections: Data {
    WEBDEV {
        override val id: String
            get() = "webdev"
        override val title: String
            get() = "Web Development"
        override val subtitle: String
            get() = "Full Site Development"
        override val path: String
            get() = "services/web#webdev"

    },
    HOSTING {
        override val id: String
            get() = "hosting"
        override val title: String
            get() = "Hosting"
        override val subtitle: String
            get() = "We can host your site"
        override val path: String
            get() = "services/web#hosting"

    },
    ADMIN {
        override val id: String
            get() = "admin"
        override val title: String
            get() = "Website Administration"
        override val subtitle: String
            get() = "We can handle running your site for you"
        override val path: String
            get() = "services/web#admin"

    }
}
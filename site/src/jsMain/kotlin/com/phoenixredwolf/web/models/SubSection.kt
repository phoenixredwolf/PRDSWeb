package com.phoenixredwolf.web.models

enum class SubSection: Data {

    WebDev{
        override val id: String
            get() = "webdev"

        override val title: String
            get() = "Web Development"
        override val subtitle: String
            get() = "Full Service Website Development"
        override val path: String
            get() = "/services/webdev"
    };

    fun toSection() = when (this) {
        WebDev -> Section.WebDev
    }
}
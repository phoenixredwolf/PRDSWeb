package com.phoenixredwolf.web.models

enum class CloudSections: Data {
    MIGRATION{
        override val id: String
            get() = "migration"
        override val title: String
            get() = "Cloud Migration"
        override val subtitle: String
            get() = "We can help you switch"
        override val path: String
            get() = "/services#cloudmigrate"
    },
    IMPLEMENT{
        override val id: String
            get() = "implement"
        override val title: String
            get() = "Cloud Implementations"
        override val subtitle: String
            get() = "Creating a new cloud for you"
        override val path: String
            get() = "/services#cloudimplement"
    },
    ADMIN{
        override val id: String
            get() = "admin"
        override val title: String
            get() = "Cloud Administration"
        override val subtitle: String
            get() = "Keep your cloud services running flawlessly"
        override val path: String
            get() = "/services#cloudadmin"
    },
    CONSULT{
        override val id: String
            get() = "cloudconsult"
        override val title: String
            get() = "Cloud Consultations"
        override val subtitle: String
            get() = "Not sure what you need?"
        override val path: String
            get() = "/services#cloudconsult"
    }
}
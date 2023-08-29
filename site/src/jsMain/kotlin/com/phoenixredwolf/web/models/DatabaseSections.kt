package com.phoenixredwolf.web.models

enum class DatabaseSections: Data {
    ADMIN {
        override val id: String
            get() = "admin"
        override val title: String
            get() = "Administration"
        override val subtitle: String
            get() = "Unlocking Data Potential: Expert Database Administration Services"
        override val path: String
            get() = "/services/database#admin"
    },
    CREATION {
        override val id: String
            get() = "create"
        override val title: String
            get() = "Creation"
        override val subtitle: String
            get() = "Crafting Data Foundations: Expert Database Creation Services"
        override val path: String
            get() = "/services/database#create"
    },
    OPTIM {
        override val id: String
            get() = "optim"
        override val title: String
            get() = "Optimization and Normalization"
        override val subtitle: String
            get() = "Enhancing Efficiency: Expert Database Optimization and Normalization"
        override val path: String
            get() = "/services/databases#normal"
    },
    MIGRA {
        override val id: String
            get() = "migrate"
        override val title: String
            get() = "Migrations"
        override val subtitle: String
            get() = "Seamless Transition: Expert Database Migration Services"
        override val path: String
            get() = "/services/database#migrate"
    }
}
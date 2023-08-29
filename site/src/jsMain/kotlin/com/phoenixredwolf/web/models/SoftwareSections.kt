package com.phoenixredwolf.web.models

enum class SoftwareSections: Data {
    MOBILE {
        override val id: String
            get() = "mobile"
        override val title: String
            get() = "Mobile"
        override val subtitle: String
            get() = "Empowering Your Vision through Mobile Programming Expertise"
        override val path: String
            get() = "/services/software#mobile"
    },
    DESKTOP{
        override val id: String
            get() = "desktop"
        override val title: String
            get() = "Desktop"
        override val subtitle: String
            get() = "Elevating Possibilities through Expert Desktop Programming"
        override val path: String
            get() = "/services/software#desktop"
    },
    TRAINING{
        override val id: String
            get() = "training"
        override val title: String
            get() = "Training"
        override val subtitle: String
            get() = "Empowering Success through Comprehensive Software Training"
        override val path: String
            get() = "/services/software#training"
    }
}
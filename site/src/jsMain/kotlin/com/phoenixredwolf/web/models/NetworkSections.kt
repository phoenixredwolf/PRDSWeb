package com.phoenixredwolf.web.models

enum class NetworkSections: Data {
    LAN{
        override val id: String
            get() = "lan"
        override val title: String
            get() = "Local Area Networks"
        override val subtitle: String
            get() = "Seamless Connectivity: LAN Installation and Configuration Solutions"
        override val path: String
            get() = "services/networks#lan"
    },
    WIFI{
        override val id: String
            get() = "wifi"
        override val title: String
            get() = "WiFi"
        override val subtitle: String
            get() = "Wireless Empowerment: Expert WiFi Solutions for Seamless Connectivity"
        override val path: String
            get() = "services/networks#wifi"
    },
    VPN{
        override val id: String
            get() = "vpn"
        override val title: String
            get() = "Virtual Private Networks"
        override val subtitle: String
            get() = "Secure Connectivity Unleashed: Expert VPN Solutions for Your Network"
        override val path: String
            get() = "services/networks#vpn"
    },
    ADMIN{
        override val id: String
            get() = "admin"
        override val title: String
            get() = "Network Administration"
        override val subtitle: String
            get() = "Mastering Networks: Professional Network Administration Services"
        override val path: String
            get() = "services/networks#admin"
    }
}
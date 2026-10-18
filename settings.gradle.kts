pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        maven("https://repo.auxilor.io/repository/maven-public/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "DeathMessages"

include(
    ":core",

    "nms:abstraction",

    "nms:spigot:v1_12_2",
    "nms:spigot:v1_13",
    "nms:spigot:v1_16_5",
    "nms:spigot:v1_21_3",

    "nms:paper:v1_16_5",
    "nms:paper:v1_21_3",
    "nms:paper:v1_21_4",
    "nms:paper:v26_3",

    ":hooks:worldguard",
    ":hooks:worldguard6",
    ":hooks:worldguard7",
)

plugins {
    id("cn.dreeam.deathmessages.wrapper")
}

dependencies {
    compileOnly(project(":nms:paper:v1_21_4"))
    compileOnly(project(":nms:paper:v1_21_3"))
    compileOnly(project(":nms:paper:v1_16_5"))
    compileOnly("io.papermc.paper:paper-api:26.3.build.200-stable")

    compileOnly(libs.bundles.adventure)
}

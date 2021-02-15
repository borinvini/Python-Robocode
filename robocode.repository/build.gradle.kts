plugins {
    id("net.sf.robocode.java-conventions")
    `java-library`
}

dependencies {
    implementation(project(":robocode.api"))
    implementation(project(":robocode.core"))
    implementation(project(":robocode.host"))
    implementation("org.picocontainer:picocontainer:2.14.2")
    implementation("net.sf.robocode:codesize:1.2")
}

description = "Robocode Repository"

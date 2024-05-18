plugins {
    kotlin("multiplatform") version "1.9.24"
    kotlin("plugin.serialization") version "1.9.24"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

sourceSets {
        dependencies {
            commonMainImplementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
        }
}

kotlin {
    js(IR) {
        nodejs {
        }
        binaries.executable()
    }
}

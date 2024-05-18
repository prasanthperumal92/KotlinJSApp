import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType.IR
import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType.js
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    kotlin("multiplatform") version "1.9.24"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

}

kotlin {
    js(IR) {
        browser {
        }
        binaries.executable()
    }
}

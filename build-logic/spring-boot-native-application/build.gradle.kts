plugins {
    id("org.gradle.kotlin.kotlin-dsl") version "4.2.0"
}

dependencies {
    implementation(platform("com.example.platform:plugins-platform"))

    implementation(project(":spring-boot-application"))

    implementation("org.graalvm.buildtools.native:org.graalvm.buildtools.native.gradle.plugin")
}

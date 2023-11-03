plugins {
    id("org.gradle.kotlin.kotlin-dsl") version "4.2.0"
}

dependencies {
    implementation(platform("com.example.platform:plugins-platform")) // <2>

    implementation("io.spring.gradle:dependency-management-plugin")
}
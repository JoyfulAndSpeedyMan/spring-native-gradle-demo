plugins {
    id("org.gradle.kotlin.kotlin-dsl") version "4.2.0"
}

dependencies {
    implementation(platform("com.example.platform:plugins-platform"))

    implementation(project(":java-common"))

    implementation("org.springframework.boot:org.springframework.boot.gradle.plugin")
}

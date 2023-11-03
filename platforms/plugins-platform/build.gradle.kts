plugins {
    id("java-platform")
}

group = "com.example.platform"

dependencies {
    constraints {
        api("io.spring.gradle:dependency-management-plugin:1.1.3")
        api("org.graalvm.buildtools.native:org.graalvm.buildtools.native.gradle.plugin:0.9.28")
        api("org.springframework.boot:org.springframework.boot.gradle.plugin:3.1.5")
    }
}

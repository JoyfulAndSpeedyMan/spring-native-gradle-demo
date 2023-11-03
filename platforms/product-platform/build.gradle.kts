plugins {
    id("java-platform")
}

group = "com.example.platform"

javaPlatform.allowDependencies()

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:3.1.5"))
}

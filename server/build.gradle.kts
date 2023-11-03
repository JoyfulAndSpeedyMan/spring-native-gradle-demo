plugins {
    id("com.example.spring-boot-native-application")
}
group = "com.example"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}

// Here, args is a member variable of ProcessAot, which is type-safe to access
tasks.processAot {
    val profiles = System.getenv()["profiles"];
    if (!profiles.isNullOrBlank()) {
        args("--spring.profiles.active=$profiles")
    }
}

tasks.test {
    useJUnitPlatform()
}

repositories {
    mavenCentral()
}


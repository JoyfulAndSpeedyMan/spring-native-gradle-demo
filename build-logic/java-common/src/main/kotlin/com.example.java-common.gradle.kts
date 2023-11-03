plugins {
    java
    id("io.spring.dependency-management")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
    implementation(platform("com.example.platform:product-platform"))

    implementation("org.slf4j:slf4j-api")
    val lombokPos = "org.projectlombok:lombok:1.18.30"
    compileOnly(lombokPos)
    annotationProcessor(lombokPos)

    testCompileOnly(lombokPos)
    testAnnotationProcessor(lombokPos)

    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
tasks.test {
    useJUnitPlatform()
}

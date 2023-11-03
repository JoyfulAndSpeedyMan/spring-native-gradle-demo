plugins {
    id("com.example.spring-boot-application")
    id("org.graalvm.buildtools.native")
}

dependencies {
}

// The Task type is Task, not ProcessAot as expected, and the args parameter cannot be configured

tasks.processAot {
    val profiles = System.getenv()["profiles"];
    if (!profiles.isNullOrBlank()) {
        // Opening the commented code will result in an error
//        args("--spring.profiles.active=$profiles")
    }
}

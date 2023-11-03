dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}
pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

includeBuild("../platforms")

rootProject.name = "build-logic"
include("java-common")
include("java-lib")
include("spring-boot-application")
include("spring-boot-native-application")
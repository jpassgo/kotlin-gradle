
plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    java
}

subprojects {
    apply(plugin = "application")
    apply(plugin = "java")

    repositories {
        // Use Maven Central for resolving dependencies.
        mavenCentral()
    }

    dependencies {
        // This dependency is used by the application.
        implementation("com.google.guava:guava:30.1.1-jre")

        // Use JUnit Jupiter for testing.
        testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
    }

    tasks {
        compileJava {
            options.isWarnings = true
        }
    }

    tasks.test {
        // Use JUnit Platform for unit tests.
        useJUnitPlatform()
    }
}
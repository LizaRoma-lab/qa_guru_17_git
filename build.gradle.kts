plugins {
    id("java")
}

group = "guru.qa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
}

tasks.test {
    useJUnitPlatform()
}

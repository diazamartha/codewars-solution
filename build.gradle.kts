plugins {
    java
    kotlin("jvm") version "1.6.10"
}

group = "com.diaz.codewarsolution"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
}

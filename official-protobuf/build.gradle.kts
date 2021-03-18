import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc

plugins {
    `java-library`
    idea
    kotlin("jvm")
    id("me.champeau.jmh")
    id("com.bybutter.sisyphus.project")
    id("com.google.protobuf")
}

group = "com.bybutter.sisyphus.benchmark"
version = "1.0-SNAPSHOT"

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
}

dependencies {
    api("com.google.protobuf:protobuf-java:3.15.0")
    implementation(kotlin("stdlib"))

    protobuf(project(":datasets"))
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.15.0"
    }
}

jmh {
    warmupIterations.set(2)
    iterations.set(5)
    fork.set(2)
}
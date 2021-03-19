plugins {
    `java-library`
    kotlin("jvm")
    id("me.champeau.jmh")
    id("com.bybutter.sisyphus.project")
    id("com.bybutter.sisyphus.protobuf")
}

group = "com.bybutter.sisyphus.benchmark"
version = "1.0-SNAPSHOT"

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
}

dependencies {
    api("com.bybutter.sisyphus:sisyphus-protobuf:1.1.2")
    implementation(kotlin("stdlib"))

    proto(project(":datasets"))
}

jmh {
    warmupIterations.set(2)
    iterations.set(5)
    resultFormat.set("JSON")
    fork.set(2)
}

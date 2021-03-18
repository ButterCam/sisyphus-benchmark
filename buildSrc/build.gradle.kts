plugins {
    `java-library`
    `kotlin-dsl`
    id("idea")
    id("com.bybutter.sisyphus.project") version "1.1.2"
}

dependencies {
    implementation(platform("com.bybutter.sisyphus:sisyphus-dependencies:1.1.2"))
    implementation("com.bybutter.sisyphus.tools:sisyphus-protobuf-gradle-plugin")
    implementation("com.bybutter.sisyphus.tools:sisyphus-project-gradle-plugin")
    implementation("me.champeau.jmh:jmh-gradle-plugin:0.6.2")
    implementation("com.google.protobuf:protobuf-gradle-plugin:0.8.15")
}

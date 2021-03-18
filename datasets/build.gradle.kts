plugins {
    `java-library`
    id("com.bybutter.sisyphus.project")
}

group = "com.bybutter.sisyphus.benchmark"
version = "1.0-SNAPSHOT"

dependencies {
    compileOnly("com.bybutter.sisyphus:sisyphus-protobuf:1.1.2")
}

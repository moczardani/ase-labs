plugins {
    id("hu.bme.mit.ase.shingler.gradle.application")
}

val picoCliVersion = "4.7.6"
val slf4jVersion = "1.7.36"
val log4jVersion = "2.23.1"
val junitVersion = "5.10.0"

dependencies {
    implementation(libs.slf4j.api)
    implementation(libs.picocli)

    runtimeOnly(libs.slf4j.log4j.impl)

    testImplementation(libs.junit.jupiter.core)

    testRuntimeOnly(libs.junit.jupiter.engine)

    api(project(":logic"))
}

application {
    mainClass = "hu.bme.mit.ase.shingler.similarity.SimilarityApp"
}

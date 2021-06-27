import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.4.32"
  id("org.jetbrains.intellij") version "0.7.3"
}

repositories {
  mavenCentral()
}

intellij {
  version = "211.7142.45"
  setPlugins("com.intellij.java", "org.jetbrains.kotlin")
}

tasks.withType<KotlinCompile>().all {
  kotlinOptions {
    jvmTarget = "11"
  }
}

dependencies {
  // JUnit 5
  testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
  testImplementation("org.junit.jupiter:junit-jupiter-params:5.7.2")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
  testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.7.2")

  // Truth
  testImplementation("com.google.truth:truth:1.1.3")

  // Mockito
  testImplementation("org.mockito:mockito-core:3.10.0")
  testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")

  testImplementation("com.approvaltests:approvaltests:11.5.0")
}

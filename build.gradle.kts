import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "me.puugz"
version = "abf230.20kffdl2mf.222"

repositories {
    mavenLocal()
    mavenCentral()

    maven(url = "https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.github.waterfallmc:waterfall-api:1.19-R0.1-SNAPSHOT")

    compileOnly("org.projectlombok:lombok:1.18.26")
    annotationProcessor("org.projectlombok:lombok:1.18.26")
}

tasks.withType<JavaCompile> {
    options.compilerArgs = listOf("-parameters")
    options.isFork = true
    options.forkOptions.executable = "javac"
}

tasks.withType<ShadowJar> {
    exclude("META-INF/")
    archiveFileName.set("${project.name.hashCode()}-${project.version}-${System.currentTimeMillis()}.jar")
}

tasks.getByName("build")
    .dependsOn("shadowJar")

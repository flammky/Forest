plugins {
    id("org.jetbrains.compose")
    id("com.android.application")
    kotlin("android")
}

group "dev.flammky.var.forest"
version "1.0-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.5.0")
}

android {

    compileSdkVersion = "android-32"

    defaultConfig {
        applicationId = "dev.flammky.var.forest"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0-SNAPSHOT"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
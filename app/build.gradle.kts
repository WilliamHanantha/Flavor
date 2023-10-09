plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    flavorDimensions += "default"
    productFlavors {
        create("free"){
            applicationId = "com.naufall.beritaolahraga.free"
            resValue("string","app_name","Free - Berita Olahraga")
            resValue("color", "main_color", "#F34336")
            versionCode = 1
            versionName = "0.0.1" }
        create("paid"){
            applicationId = "com.naufall.beritaolahraga.paid"
            resValue("string","app_name","Paid - Berita Olahraga")
            resValue("color", "main_color", "#A7ED87")
            versionCode = 10
            versionName = "0.0.10" }
    }
    namespace = "com.example.beritasepakbola"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.beritasepakbola"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        buildConfigField( "boolean", "DEBUG", "true")

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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
        buildConfig = true
    }
}

dependencies {

    // AndroidX Libraries
    implementation(libs.androidx.core.ktx.v1120) // KTX para funcionalidades extras
    implementation(libs.androidx.appcompat.v161) // Suporte a funcionalidades de UI
    implementation(libs.material.v190) // Material Design
    implementation(libs.androidx.activity.ktx) // Activity KTX
    implementation(libs.androidx.constraintlayout.v214) // Layouts com restrições

    // Testes Unitários e Instrumentados
    testImplementation(libs.junit) // Testes unitários
    androidTestImplementation(libs.androidx.junit.v115) // Testes de instrumentação com JUnit
    androidTestImplementation(libs.androidx.espresso.core.v351) // Testes UI com Espresso

    // Timber - Biblioteca de logging
    implementation(libs.timber) // Logging

    // Room - Persistência de dados
    implementation(libs.androidx.room.runtime.v260) // Room Database
    implementation(libs.androidx.room.ktx.v260) // Room com suporte a Kotlin

    // Arquitetura - Lifecycle Components
    implementation(libs.androidx.lifecycle.common.java8.v261) // Lifecycle comum Java 8
    implementation(libs.androidx.lifecycle.viewmodel.ktx.v261) // ViewModel com Kotlin Extensions
    implementation(libs.androidx.lifecycle.livedata.ktx.v261) // LiveData com Kotlin Extensions

    // Navegação - Fragment & UI
    implementation(libs.androidx.navigation.fragment.ktx.v271) // Navegação Fragment KTX
    implementation(libs.androidx.navigation.ui.ktx.v271) // Navegação UI KTX

    // Outros Componentes
    implementation(libs.androidx.swiperefreshlayout) // Para SwipeRefreshLayout
}
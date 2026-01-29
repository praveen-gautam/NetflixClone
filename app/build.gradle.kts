plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "app.com.logbook.netflixclone"
    compileSdk {
        version = release(Apps.compileSdk)
    }

    defaultConfig {
        applicationId = "app.com.logbook.netflixclone"
        minSdk = Apps.minSdk
        targetSdk = Apps.targetSdk
        versionCode = Apps.versionCode
        versionName = Apps.versionName
        multiDexEnabled = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        ndk {
            // /** play store release
        //    abiFilters.add("armeabi-v7a")
            // */
//      abiFilters.add("arm64-v8a")

        }
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
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(Libs.coreKtx)
    implementation(Libs.lifecycleRuntimeKtx)
    implementation(Libs.activityCompose)
    implementation(platform(Libs.composeBom))
    implementation(Libs.composeUi)
    implementation(Libs.composeUiGraphics)
    implementation(Libs.composePreview)
    implementation(Libs.composeMaterialDesign)

    //testing
    testImplementation(TestLibs.junit)
    androidTestImplementation(TestLibs.junitExtension)
    androidTestImplementation(TestLibs.espressoCore)
    androidTestImplementation(platform(Libs.composeBom))
    androidTestImplementation(TestLibs.composeUiTestJunit4)
    debugImplementation(Libs.composeUiTooling)
    debugImplementation(TestLibs.composeUiTestManifest)
}
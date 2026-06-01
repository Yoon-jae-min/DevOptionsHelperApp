plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.devoptionshelper"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.devoptionshelper"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    signingConfigs {
        create("release") {
            val storeFilePath = project.findProperty("MYAPP_RELEASE_STORE_FILE") as String?
            val storePassword = project.findProperty("MYAPP_RELEASE_STORE_PASSWORD") as String?
            val keyAlias = project.findProperty("MYAPP_RELEASE_KEY_ALIAS") as String?
            val keyPassword = project.findProperty("MYAPP_RELEASE_KEY_PASSWORD") as String?

            if (storeFilePath != null &&
                storePassword != null &&
                keyAlias != null &&
                keyPassword != null
            ) {
                storeFile = file(storeFilePath)
                this.storePassword = storePassword
                this.keyAlias = keyAlias
                this.keyPassword = keyPassword
            }
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("release")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
    }
}

android.applicationVariants.all {
    outputs.all {
        val output = this
        val variantName = name
        if (output is com.android.build.gradle.internal.api.BaseVariantOutputImpl) {
            output.outputFileName = "DevOptionsHelper-${variantName}.apk"
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.gms:play-services-ads:23.6.0")
}

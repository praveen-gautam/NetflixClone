//This file is used to define all project level depencencies via multiple modules

//This class is used to define app level config in andorid section of build.gradle
object Apps {
    const val compileSdk = 36
    const val minSdk = 24
    const val targetSdk = 36
    const val versionCode = 1
    const val versionName = "1.0"
    const val versionSuffix="regression"



}
object Versions{
    const val gradle =""
    const val kotlin =""
    const val composeCompiler =""
   const val coreKtx = "1.17.0"
   const val lifecycleRuntimeKtx = "2.10.0"
   const val activityCompose = "1.12.2"
   const val composeBom = "2024.09.00"
   const val composeUi = "1.12.2"


    //Test
    const val junit = "4.12"

    const val junitExtension = "1.1.3"
    const val espressoCore = "3.3.0"
}

object Libs{
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.coreKtx}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
    const val composeUi = "androidx.compose.ui:ui"
    const val composePreview = "androidx.compose.ui:ui-tooling-preview"
    const val composeFoundation = "androidx.compose.foundation:foundation"
    const val composeUiGraphics = "androidx.compose.ui:ui-graphics"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling"
    const val composeMaterialDesign = "androidx.compose.material3:material3"





}

object TestLibs{
    const val junit = "junit:junit:${Versions.junit}"
    const val junitExtension = "androidx.test.ext:junit:${Versions.junitExtension}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest"
    const val composeUiTestJunit4 = "androidx.compose.ui:ui-test-junit4"



}

object Modules{

}

object Plugins{

}

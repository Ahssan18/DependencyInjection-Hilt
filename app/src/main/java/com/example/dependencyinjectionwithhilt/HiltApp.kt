package com.example.dependencyinjectionwithhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HiltApp:Application() {
}
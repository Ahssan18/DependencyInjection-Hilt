package com.example.dependencyinjectionwithhilt

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.android.scopes.ServiceScoped
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Prefrence
@Inject constructor(
    private val prefrence2: Prefrence2
) {
    val TAG = "MainActivity"
    fun saveData(data: String): Boolean {
        Log.e(TAG, "saveData successfully $data !")
        return true
    }
    fun doProcessing()
    {
        prefrence2.doSomeOperation()
    }
}
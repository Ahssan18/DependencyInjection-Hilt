package com.example.dependencyinjectionwithhilt

import android.util.Log
import com.google.gson.Gson
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.android.scopes.ServiceScoped
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Prefrence
@Inject constructor(
    private val prefrence2: Prefrence2,var gson: Gson
) {
    val TAG = "MainActivity"
    fun saveData(data: String): Boolean {
        Log.e(TAG, "saveData successfully $data !")
        return true
    }
    fun doProcessing()
    {
        var str=prefrence2.doSomething()
        Log.e(TAG,str);
    }
    fun doGreat()
    {
      prefrence2.doSomeOperation()
    }
}


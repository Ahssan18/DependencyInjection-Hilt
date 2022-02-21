package com.example.dependencyinjectionwithhilt

import android.util.Log
import javax.inject.Inject

const val TAG="Prefrence2"
class Prefrence2
@Inject constructor(){
    fun doSomeOperation(){
        Log.e(TAG,"i am doing operations");
    }
}
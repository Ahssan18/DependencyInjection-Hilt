package com.example.dependencyinjectionwithhilt

import android.util.Log
import javax.inject.Inject
import javax.inject.Scope

val TAG2:String="HILT"
class HitClass1
@Inject constructor():HiltInterface{
    override fun doSimeTHingGreat() {
        Log.e(TAG2,"I am doing some thing great1")
    }
}
class HitClass2
@Inject constructor():HiltInterface{
    override fun doSimeTHingGreat() {;
        Log.e(TAG2,"I am doing some thing great2")
    }

}
interface HiltInterface{
   fun doSimeTHingGreat();
}

package com.example.dependencyinjectionwithhilt

import android.util.Log
import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Scope
import javax.inject.Singleton

const val TAG = "Prefrence2"

class Prefrence2
@Inject constructor() : InterfaceSomething {
    fun doSomeOperation() {
        Log.e(TAG, "i am doing operations");
    }

    override fun doSomething(): String {
        return "i am doing great job"
    }
}

interface InterfaceSomething {
    fun doSomething(): String
}
@InstallIn(SingletonComponent::class)
@Module
abstract class bindImpl {
    @Singleton
    @Binds
    abstract fun bindInterfaceSomething(prefrence2: Prefrence2): InterfaceSomething

}
@InstallIn(SingletonComponent::class)
@Module
class AddDependency{
    @Singleton
    @Provides
    fun provideGsonDependency():Gson{
        return Gson()
    }

}
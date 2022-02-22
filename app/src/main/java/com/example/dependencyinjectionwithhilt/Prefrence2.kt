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
import javax.inject.Qualifier
import javax.inject.Scope
import javax.inject.Singleton

const val TAG = "Prefrence2"

class Prefrence2
@Inject constructor(
    @hilt1 private val hiltclass1: HiltInterface,
    @hilt2 private val hiltclass2: HiltInterface
) : InterfaceSomething {
    public fun doSomeOperation() {
        hiltclass1.doSimeTHingGreat()
        Log.e(TAG, "i am doing operations");
    }

    override fun doSomething(): String {
        hiltclass2.doSimeTHingGreat()
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
abstract class hilt2Imple {
    @hilt2
    @Singleton
    @Binds
    abstract fun bindHilt2(hitClass2: HitClass2): HiltInterface
}

@InstallIn(SingletonComponent::class)
@Module
class AddDependency {
    @Singleton
    @Provides
    fun provideGsonDependency(): Gson {
        return Gson()
    }

    @hilt1
    @Singleton
    @Provides
    fun provideHilt1(): HiltInterface {
        return HitClass1()
    }

    /*  @hilt2
      @Singleton
      @Provides
      fun provideHilt2(): HiltInterface {
          return HitClass2()
      }*/

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class hilt1

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class hilt2
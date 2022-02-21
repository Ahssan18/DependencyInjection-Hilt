package com.example.dependencyinjectionwithhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    public val TAG = "MainActivity"

    @Inject
    lateinit var prefrence: Prefrence
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prefrence.saveData("ahssan akhtar")
        prefrence.doProcessing()
    }
}


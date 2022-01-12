package com.example.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.ASSERT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "Test debug")
        Log.e("MainActivity", "Test error")
        Log.i("MainActivity", "Test info")
        Log.v("MainActivity", "Test info")
        Log.w("MainActivity", "Test info")
    }
}
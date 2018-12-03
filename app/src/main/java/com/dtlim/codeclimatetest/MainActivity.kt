package com.dtlim.codeclimatetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s = "some string"

        Log.d("test", "test")
        Log.d("test", "test")
        Log.d("test", "test")

        var n = 0

        for (i in 0..5) {
            n = n + i
        }

        var q = 0
        for (i in 0..5) {
            q = q + i
        }
    }
}

class Coordinate {
    val x = 0
    val y = 0
}
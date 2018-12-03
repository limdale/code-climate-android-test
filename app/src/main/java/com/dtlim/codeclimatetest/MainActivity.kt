package com.dtlim.codeclimatetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s = "some string"

        Log.d("test", "test")
        Log.d("test", "test")

        var n = 0

        for (i in 0..5) {
            n = n + i
        }

        test()
        test2()
    }

    fun test() {
        var q = 0
        val bool1 = Random.nextInt(0, 10).rem(2) == 0
        val bool2 = Random.nextInt(0, 10).rem(2) == 0
        for (i in 0..5) {
            if (bool1) {
                try {
                    if (bool1 && bool2) {
                        if ( bool1 == bool2) {
                            q += 1000
                        }
                        q += i
                        Log.d("TEST", "$q $i")
                    }
                } catch (e: Exception) {
                    Log.d("Exception", "Exception")
                }
            }
        }
    }

    fun test2() {
        var q = 0
        val bool1 = Random.nextInt(0, 10).rem(2) == 0
        val bool2 = Random.nextInt(0, 10).rem(2) == 0
        for (i in 0..5) {
            if (bool1) {
                try {
                    if (bool1 && bool2) {
                        if ( bool1 == bool2) {
                            q += 1000
                        }
                        q += i
                        Log.d("TEST", "$q $i")
                    }
                } catch (e: Exception) {
                    Log.d("Exception", "Exception")
                }
            }
        }
    }
}

class Coordinate {
    val x = 0
    val y = 0
}
package com.realtomjoney.intrototesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun someCalculation(input: Double): Double {
        return input.mod(13.0)
    }

    fun readValue(): String? {
        return null
    }
}
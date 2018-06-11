package com.toddperkins.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

enum class CalculatorMode {
    None,Add,Subtract
}

class MainActivity : AppCompatActivity() {
    var lastButtonWasMode = false
    var currentMode = CalculatorMode.None
    var labelString = ""
    var savedNum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupCalculator()
    }

    fun setupCalculator() {

    }

    fun didPressEquals() {

    }

    fun didPressClear() {

    }

    fun updateText() {

    }

    fun changeMode(mode:CalculatorMode) {

    }

    fun didPressNumber(num:Int) {

    }
}

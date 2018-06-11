package com.toddperkins.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

enum class CalculatorMode {
    None, Add, Subtract
}

class MainActivity : AppCompatActivity() {

    var lastButton = false
    var currentMode = CalculatorMode.None
    var labelString = ""
    var savedNum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpCalculator()
    }

    fun setUpCalculator() {

    }

    fun didPressEquals() {

    }

    fun didPressClear() {

    }

    fun updateText() {

    }

    fun changeMode(mode: CalculatorMode) {

    }

    fun didPressNumber(num: Int) {

    }
}

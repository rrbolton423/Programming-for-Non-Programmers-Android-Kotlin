package com.toddperkins.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

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
        val allButtons = arrayOf(
                button0,
                button1,
                button2,
                button3,
                button4,
                button5,
                button6,
                button7,
                button8,
                button9)
        for(i in allButtons.indices) {
            allButtons[i].setOnClickListener { didPressNumber(i) }
        }

        buttonPlus.setOnClickListener { changeMode(CalculatorMode.Add) }
        buttonMinus.setOnClickListener { changeMode(CalculatorMode.Subtract) }
        buttonEquals.setOnClickListener { didPressEquals() }
        buttonC.setOnClickListener { didPressClear() }

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

package com.toddperkins.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
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
        val allButtons = arrayOf(button0,button1,button2,button3,button4,button5,button6,button7,button8,button9)
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
        lastButtonWasMode = false
        currentMode = CalculatorMode.None
        labelString = ""
        savedNum = 0
        textView.text = "0"
    }

    fun updateText() {
        val labelInt = labelString.toInt()
        labelString = labelInt.toString()


        textView.text = labelString
    }

    fun changeMode(mode:CalculatorMode) {

    }

    fun didPressNumber(num:Int) {
        val strVal = num.toString()

        labelString = "$labelString$strVal"
        updateText()
    }
}

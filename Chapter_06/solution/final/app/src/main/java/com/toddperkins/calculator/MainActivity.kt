package com.toddperkins.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

enum class CalculatorMode {
    None,Add,Subtract,Multiply
}

class MainActivity : AppCompatActivity() {
    private var lastButtonWasMode = false
    private var currentMode = CalculatorMode.None
    private var labelString = ""
    private var savedNum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupCalculator()
    }

    private fun setupCalculator() {
        val allButtons = arrayOf(button0,button1,button2,button3,button4,button5,button6,button7,button8,button9)
        for(i in allButtons.indices) {
            allButtons[i].setOnClickListener { didPressNumber(i) }
        }
        buttonPlus.setOnClickListener { changeMode(CalculatorMode.Add) }
        buttonMinus.setOnClickListener { changeMode(CalculatorMode.Subtract) }
        buttonMultiply.setOnClickListener { changeMode(CalculatorMode.Multiply) }
        buttonEquals.setOnClickListener { didPressEquals() }
        buttonC.setOnClickListener { didPressClear() }
    }

    private fun didPressEquals() {
        if (lastButtonWasMode) {
            return
        }

        val labelInt = labelString.toInt()

        when(currentMode) {
            CalculatorMode.Add -> savedNum += labelInt
            CalculatorMode.Subtract -> savedNum -= labelInt
            CalculatorMode.Multiply -> savedNum *= labelInt
            CalculatorMode.None -> return
        }

        currentMode = CalculatorMode.None
        labelString = "$savedNum"
        updateText()
        lastButtonWasMode = true
    }

    private fun didPressClear() {
        lastButtonWasMode = false
        currentMode = CalculatorMode.None
        labelString = ""
        savedNum = 0
        textView.text = "0"
    }

    private fun updateText() {

        if(labelString.length > 8){
            didPressClear()
            textView.text = "Too Big"
            return
        }

        val labelInt = labelString.toInt()
        labelString = labelInt.toString()

        if(currentMode == CalculatorMode.None){
            savedNum = labelInt
        }


        val df = DecimalFormat("#,###")

        textView.text = df.format(labelInt)
    }

    private fun changeMode(mode:CalculatorMode) {
        if(savedNum == 0){
            return
        }

        currentMode = mode
        lastButtonWasMode = true
    }

    private fun didPressNumber(num:Int) {
        val strVal = num.toString()

        if(lastButtonWasMode){
            lastButtonWasMode = false
            labelString = "0"
        }

        labelString = "$labelString$strVal"
        updateText()
    }
}

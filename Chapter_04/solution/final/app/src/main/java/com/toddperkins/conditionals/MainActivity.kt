package com.toddperkins.conditionals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

enum class CalculatorMode {
    None,Add,Subtract,Multiply
}

class MainActivity : AppCompatActivity() {
    private var currentMode = CalculatorMode.None

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd.setOnClickListener { currentMode = CalculatorMode.Add }
        buttonSubtract.setOnClickListener { currentMode = CalculatorMode.Subtract }
        buttonMultiply.setOnClickListener { currentMode = CalculatorMode.Multiply }
        buttonEquals.setOnClickListener { pressedEquals() }
    }

    private fun pressedEquals() {
        val num1 = 5
        val num2 = 10
        var total = num1 + num2

        when(currentMode){
            CalculatorMode.Add -> total = num1 + num2
            CalculatorMode.Subtract -> total = num1 - num2
            CalculatorMode.Multiply -> total = num1 * num2
            CalculatorMode.None -> {
                textView.text = "No mode selected"
                return
            }
        }

        textView.text = "$total"
    }
}

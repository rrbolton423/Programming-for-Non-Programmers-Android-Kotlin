package com.toddperkins.variables

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

enum class CalculatorModes {
    None,Addition,Subtraction,Multiplication
}

class MainActivity : AppCompatActivity() {
    private val mode = CalculatorModes.Subtraction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainText.text = "$mode"
    }
}

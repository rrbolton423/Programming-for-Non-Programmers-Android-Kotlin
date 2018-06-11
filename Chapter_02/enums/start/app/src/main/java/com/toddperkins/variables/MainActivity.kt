package com.toddperkins.variables

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.toddperkins.variables.R.id.mainText
import kotlinx.android.synthetic.main.activity_main.*

// Create custom data type
enum class CalculatorModes {
    None, Addition, Subtraction, Multiplication
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mode = CalculatorModes.Subtraction
        mainText.text = "Calculator mode is $mode"

    }
}

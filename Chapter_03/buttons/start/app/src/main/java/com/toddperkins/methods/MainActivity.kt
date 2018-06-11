package com.toddperkins.methods

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            addNumbers(15, 12)
        }
    }

    private fun addNumbers(num1: Int, num2: Int) {
        val sum = num1 + num2
        textView.text = "$sum"
    }
}

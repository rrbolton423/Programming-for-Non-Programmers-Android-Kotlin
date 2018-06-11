package com.toddperkins.methods

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addNumbers()
    }

    private fun addNumbers() {
        val num1 = 15
        val num2 = 283
        val sum = num1 + num2
        textView.text = "$sum"
    }
}

package com.toddperkins.conditionals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1 = 3
        var num2 = 1

        num1 = 0
        num2 = 0
        if (num1 == num2) {
            textView.text = "The condition is true"
        }
        else {
            textView.text = "The condition is false"
        }
    }
}

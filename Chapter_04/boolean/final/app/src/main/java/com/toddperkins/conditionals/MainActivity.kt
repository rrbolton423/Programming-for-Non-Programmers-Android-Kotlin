package com.toddperkins.conditionals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isOn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (isOn) {
                isOn = false
                textView.text = "Off"
            }
            else {
                isOn = true
                textView.text = "On"
            }
        }
    }
}

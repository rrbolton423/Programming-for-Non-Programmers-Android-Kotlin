package com.toddperkins.conditionals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons = arrayOf(button1,button2,button3)

        buttons[0].setOnClickListener { pressedButton(1) }
        buttons[1].setOnClickListener { pressedButton(2) }
        buttons[2].setOnClickListener { pressedButton(3) }
    }

    private fun pressedButton(buttonNum:Int) {
        textView.text = "Pressed button $buttonNum"
    }
}

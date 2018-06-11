package com.toddperkins.methods

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener { updateTextView(1) }
        button2.setOnClickListener { updateTextView(2) }
        button3.setOnClickListener { updateTextView(3) }
    }

    fun updateTextView(num:Int) {
        textView.text = "$num"
    }
}

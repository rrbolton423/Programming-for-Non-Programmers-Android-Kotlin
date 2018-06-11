package com.toddperkins.variables

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var prop = "Example"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myNum = 10
        myNum = 5

        var myName = "Todd"

        prop = "New Value"
    }
}

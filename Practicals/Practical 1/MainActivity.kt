package com.example.practicalone2020

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // val textView = TextView(this)
        //textView.text = "Hello Android"
        //setContentView(textView)
        setContentView(R.layout.activity_main)
    }
}
package com.example.currency2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    // Declare and initialise exchange rate variables (values)
    private val GBPtoEUR = 1.10
    private val GBPtoUSD = 1.27

    // Declare field variables 
    lateinit var poundText: EditText
    lateinit var euroText: EditText
    lateinit var dollarText: EditText

    // Create view 
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        poundText = findViewById<View>(R.id.poundValue) as EditText

        // Focusable set to false in xml file
        euroText = findViewById(R.id.euroValue) as EditText
        dollarText = findViewById(R.id.dollarValue) as EditText
        // Conversion Logic 
            val convertButton = findViewById<View>(R.id.convertButton) as Button
            convertButton.setOnClickListener { view ->try {
                 
            val poundString = poundText.text.toString()
            val pounds = poundString.toFloat()
                 
            val euros = Math.round(pounds * GBPtoEUR * 100) / 100f
            euroText.setText(euros.toString())
                 
            val dollars = Math.round(pounds * GBPtoUSD * 100) / 100f
            dollarText.setText(dollars.toString())
                 
            } catch (exception: Exception) {
                 
              Toast.makeText(view.context, "Invalid data -try again",Toast.LENGTH_SHORT).show()}
                                               
         // Clear button action 
              val clearButton = findViewById<View>(R.id.clearButton) as Button
              clearButton.setOnClickListener {
                view ->try {
                poundText.setText("")
                euroText.setText("1.10")
                dollarText.setText("1.27")
                } catch (exception: Exception) {
                Toast.makeText(view.context, "Invalid data -try again",Toast.LENGTH_SHORT).show()
            }
            }
        }
        }
    }

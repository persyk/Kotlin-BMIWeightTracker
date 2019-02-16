package com.pilipf.bmiweighttracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "Your BMI will be shown here"
        // get reference to button
        val calculate_bmi = findViewById<Button>(R.id.button)
        // set on-click listener
        calculate_bmi.setOnClickListener {

            var heightText = findViewById<EditText>(R.id.height)
            val height: Double = heightText.text.toString().toDouble()

            var weight: Double = findViewById<EditText>(R.id.weight).text.toString().toDouble()

            textView.text = Math.round(weight / Math.pow(height/100, 2.0)).toString()
        }

        }
    }


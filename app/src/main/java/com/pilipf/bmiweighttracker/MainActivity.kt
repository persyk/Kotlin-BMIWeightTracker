package com.pilipf.bmiweighttracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "Your BMI will be shown here"
        // get reference to button
        val calculate_bmi = findViewById<Button>(R.id.button)
        // set on-click listener
        calculate_bmi.setOnClickListener {

            val heightText = findViewById<EditText>(R.id.height)
            val height: Double = heightText.text.toString().toDouble()

            val weight: Double = findViewById<EditText>(R.id.weight).text.toString().toDouble()

            val bmi = Math.round(weight / Math.pow(height/100, 2.0))

            if (bmi <18.5){
                textView.text = "Your BMI is" +bmi.toString()+" so you are skinny"
            }
            if (bmi > 19) {
                finish()
            }

            //textView.text =
        }

        }
    }


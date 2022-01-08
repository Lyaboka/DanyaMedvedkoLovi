package com.example.androidlessons

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout



class MainActivity : AppCompatActivity() {


    private lateinit var textView: TextView
    private lateinit var rootLayout: ConstraintLayout
    private lateinit var button_red: Button
    private lateinit var button_yellow: Button
    private lateinit var button_green: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        rootLayout = findViewById(R.id.root_layout)
        rootLayout.setBackgroundColor(Color.RED)

        button_red = findViewById(R.id.button_red)
        button_red.setOnClickListener{
            rootLayout.setBackgroundColor(Color.RED)
            textView.setText(R.string.red)
        }

        button_yellow = findViewById(R.id.button_yellow)
        button_yellow.setOnClickListener{
           textView.setText(R.string.Yellow)
           rootLayout.setBackgroundColor(Color.YELLOW)
       }

        button_green = findViewById(R.id.button_green)
        button_green.setOnClickListener{
            textView.setText(R.string.Green)
            rootLayout.setBackgroundColor(Color.GREEN)
        }
    }
}
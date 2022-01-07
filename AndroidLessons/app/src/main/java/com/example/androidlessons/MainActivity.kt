package com.example.androidlessons

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val textView: TextView = findViewById(R.id.textView)
        val rootLayout: ConstraintLayout = findViewById(R.id.root_layout)
        val button_red: Button = findViewById(R.id.button_red)
        val button_yellow: Button = findViewById(R.id.button_yellow)
        val button_green: Button = findViewById(R.id.button_green)

        rootLayout.setBackgroundColor(resources.getColor(R.color.RED,null))

        button_red.setOnClickListener{
            rootLayout.setBackgroundColor(resources.getColor(R.color.RED,null))
            textView.setText(R.string.red)
        }
       button_yellow.setOnClickListener{
           textView.setText(R.string.Yellow)
           rootLayout.setBackgroundColor(resources.getColor(R.color.Yellow,null))
       }
        button_green.setOnClickListener{
            textView.setText(R.string.Green)
            rootLayout.setBackgroundColor(resources.getColor(R.color.Green,null))
        }
    }
}
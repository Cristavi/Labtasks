package com.example.labworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Lab2_Question1 : AppCompatActivity() {
    private lateinit var tvVal : TextView
    private lateinit var btnCounter : Button
    var counter : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab2__question1)

        tvVal = findViewById(R.id.tvVal)
        btnCounter = findViewById(R.id.btnCounter)


        btnCounter.setOnClickListener{
            counter += 1

            tvVal.text = counter.toString()
        }

    }
}
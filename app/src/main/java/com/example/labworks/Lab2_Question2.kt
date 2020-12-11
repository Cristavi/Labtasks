package com.example.labworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView

class Lab2_Question2 : AppCompatActivity() {
    private lateinit var tvGender : TextView
    private lateinit var radMale : RadioButton
    private lateinit var radFemale : RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab2__question2)


        tvGender = findViewById(R.id.tvGender)
        radMale = findViewById(R.id.radMale)
        radFemale = findViewById(R.id.radFemale)



        radMale.setOnClickListener{
            if(radMale.isChecked){
                tvGender.text = radMale.text
            }
        }

        radFemale.setOnClickListener {
            if(radFemale.isChecked){
                tvGender.text = radFemale.text
            }
        }


    }
}
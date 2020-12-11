package com.example.labworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Lab2_Question3 : AppCompatActivity() {
    private lateinit var etUsername : EditText
    private lateinit var etPassword : EditText
    private lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab2__question3)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener{
            if(etUsername.text.toString().toLowerCase() == "admin" &&
                etPassword.text.trim().isNotEmpty()){
                Toast.makeText(this, "You are logged in", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, Lab2_Question1::class.java))
            }
            else{
                Toast.makeText(this, "You are not logged in", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
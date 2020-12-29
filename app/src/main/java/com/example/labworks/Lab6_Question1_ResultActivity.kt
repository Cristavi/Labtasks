package com.example.labworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import com.example.labworks.model.Person
import org.w3c.dom.Text

class Lab6_Question1_ResultActivity : AppCompatActivity() {
    private lateinit var tvPersonName : TextView
    private lateinit var listPerson : ListView
    private lateinit var tvPeronAddress : TextView
    private lateinit var tvPersonMobile : TextView
    private lateinit var tvPersonGender : TextView
    private var personDetails = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab6__question1__result)

        listPerson = findViewById(R.id.listPerson)
        tvPersonName = findViewById(R.id.tvPersonName)
        tvPeronAddress = findViewById(R.id.tvPersonAddress)
        tvPersonMobile = findViewById(R.id.tvPersonMobile)
        tvPersonGender = findViewById(R.id.tvPersonGender)
        var list = intent.getSerializableExtra("personList") as ArrayList<Person>


        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)



        listPerson.adapter = adapter

        listPerson.setOnItemClickListener{
            parent, view, position, id ->

            val name = list[id.toInt()].name
            val address = list[id.toInt()].address
            val mobile = list[id.toInt()].mobile
            val gender = list[id.toInt()].gender

            tvPersonName.text = "Name : $name"
            tvPeronAddress.text = "Address : $address"
            tvPersonMobile.text = "Mobile : $mobile"
            tvPersonGender.text = "Gender : $gender"

        }
    }
}
package com.example.labworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.labworks.model.Person

class Lab6_Question1 : AppCompatActivity() {
    private lateinit var etName: EditText
    private lateinit var etAddress: EditText
    private lateinit var etMob: EditText
    private lateinit var rdMale: RadioButton
    private lateinit var rdFemale: RadioButton
    private lateinit var btnSubmit: Button
    private var personList = ArrayList<Person>()
    private var gender = "Male"
    private lateinit var rdoGender: RadioGroup
    private var listCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab6__question1)

        etName = findViewById(R.id.etName)
        etAddress = findViewById(R.id.etAddress)
        etMob = findViewById(R.id.etMob)
        rdMale = findViewById(R.id.rdMale)
        rdFemale = findViewById(R.id.rdFemale)
        btnSubmit = findViewById(R.id.btnSubmit)
        rdoGender = findViewById(R.id.rdoGender)

        rdMale.isChecked = true

        rdoGender.setOnCheckedChangeListener { group, checkedId ->
            if (rdMale.isChecked) {
                gender = "Male"
            }

            if (rdFemale.isChecked) {
                gender = "Female"
            }
        }

        btnSubmit.setOnClickListener {
            personList.add(
                Person(
                    etName.text.toString(), etAddress.text.toString(),
                    etMob.text.toString(), gender
                )
            )


            val intent = Intent(this, Lab6_Question1_ResultActivity::class.java)

            intent.putExtra("personList", personList)

            startActivity(intent)

        }

    }
}
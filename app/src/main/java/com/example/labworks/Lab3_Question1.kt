package com.example.labworks

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible
import java.util.*

class Lab3_Question1 : AppCompatActivity() {
    private val posts = arrayOf("Employee", "Manager", "Clerk")
    private lateinit var spinPost : Spinner
    private lateinit var etDate: EditText
    private var joinDate = ""
    private lateinit var etName : EditText
    private lateinit var etAddress : EditText
    private lateinit var etNumber : EditText
    private lateinit var btnSubmit : Button
    private lateinit var etEmpName : TextView
    private lateinit var etEmpPost : TextView
    private lateinit var etEmpDate : TextView
    private lateinit var etEmpAddress : TextView
    private lateinit var etEmpNumber : TextView
   // private var empName = ""
    private var selectedPost = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab3__question1)

        spinPost = findViewById(R.id.spinPost)
        etDate = findViewById(R.id.etDate)
        etAddress = findViewById(R.id.etDate)
        etNumber = findViewById(R.id.etNumber)
        btnSubmit = findViewById(R.id.btnSubmit)
        etEmpName = findViewById(R.id.etEmpName)
        etEmpPost = findViewById(R.id.etEmpPost)
        etEmpDate = findViewById(R.id.etEmpDate)
        etEmpAddress = findViewById(R.id.etEmpAddress)
        etEmpNumber = findViewById(R.id.etEmpNumber)
        etName = findViewById(R.id.etName)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, posts)

        spinPost.adapter = adapter

        spinPost.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedPost = parent?.getItemAtPosition(position).toString()
               // Toast.makeText(this@Lab3_Question1, "Employee post : $selectItem",
                    //Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        etDate.setOnClickListener{
            loadCalendar()
        }
        btnSubmit.setOnClickListener{
            submitData()
        }

    }

    @SuppressLint("SetTextI18n")
    private fun loadCalendar(){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this, DatePickerDialog.OnDateSetListener{
                    view, year, month, dayOfMonth ->
                etDate.setText("$dayOfMonth/${month+1}/$year")
               joinDate = "Joined date: $dayOfMonth/${month+1}/$year"

            }, year, month, day
        )

        datePickerDialog.show()
    }

    @SuppressLint("SetTextI18n")
    private fun submitData(){
        etEmpName.isVisible = true
        etEmpAddress.isVisible = true
        etEmpPost.isVisible = true
        etEmpDate.isVisible = true
        etEmpNumber.isVisible = true

        etEmpName.text = "Employee name : ${etName.text}"
        etEmpPost.text = "Employee post: $selectedPost"
        etEmpDate.text = joinDate
        etEmpAddress.text = "Employee address: ${etAddress.text}"
        etEmpNumber.text = "Employee number: ${etNumber.text}"
    }
}
package com.example.labworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isGone
import androidx.core.view.isVisible
import org.w3c.dom.Text

class Lab5_Question1 : AppCompatActivity() {
    private val staffRole = arrayOf("Academic", "Finance", "Administration")
    private val  studentRole= arrayOf("25A", "25B", "25C", "25D")
    private lateinit var radStudent : RadioButton
    private lateinit var radStaff : RadioButton
    private lateinit var tvRole : TextView
    private lateinit var spinnerRole : Spinner
    private lateinit var tvID : TextView
    private lateinit var etID : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab5__question1)

        radStudent = findViewById(R.id.radStudent)
        radStaff = findViewById(R.id.radStaff)
        tvRole = findViewById(R.id.tvRole)
        spinnerRole = findViewById(R.id.spinnerRole)
        tvID = findViewById(R.id.tvID)
        etID = findViewById(R.id.etID)
        radStudent.isChecked = true

        etID.isVisible = true
        tvID.isVisible = true

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, studentRole)

        spinnerRole.adapter = adapter

        spinnerRole.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent?.getItemAtPosition(position).toString()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        radStudent.setOnClickListener {
            if (radStudent.isChecked) {
                tvRole.text = "Batch"

                etID.isVisible = true
                tvID.isVisible = true

                val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, studentRole)

                spinnerRole.adapter = adapter

                spinnerRole.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        val selectedItem = parent?.getItemAtPosition(position).toString()

                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }
                }
            }
        }

        radStaff.setOnClickListener {
            if (radStaff.isChecked) {
                tvRole.text = "Department"

                etID.isGone = true
                tvID.isGone = true

                val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, staffRole)

                spinnerRole.adapter = adapter

                spinnerRole.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        val selectedItem = parent?.getItemAtPosition(position).toString()


                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }
                }
            }
        }


    }

    private fun loadSpinner(){
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, studentRole)

        spinnerRole.adapter = adapter

        spinnerRole.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent?.getItemAtPosition(position).toString()
                TODO("Nothing")
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}
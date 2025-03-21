package com.example.try5

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.content.Intent
import android.widget.Spinner
import android.widget.ArrayAdapter

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val continueButton: Button = findViewById(R.id.continue_button)
        val backButton: ImageButton = findViewById(R.id.back_button)
        val genderSpinner: Spinner = findViewById(R.id.gender_spinner)

        continueButton.setOnClickListener {
            Toast.makeText(this, "Регистрация (пока что заглушка)", Toast.LENGTH_SHORT).show()
        }
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val genderOptions = resources.getStringArray(R.array.gender_options)
        val adapter = ArrayAdapter(this, R.layout.spinner_item, genderOptions)
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
        genderSpinner.adapter = adapter
    }
}
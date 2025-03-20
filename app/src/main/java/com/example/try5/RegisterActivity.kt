package com.example.try5

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val continueButton: Button = findViewById(R.id.continue_button)
        continueButton.setOnClickListener {
            Toast.makeText(this, "Регистрация (пока что заглушка)", Toast.LENGTH_SHORT).show()
        }
    }
}
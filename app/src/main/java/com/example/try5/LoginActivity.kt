package com.example.try5

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val continueButton: Button = findViewById(R.id.continue_button)
        continueButton.setOnClickListener {
            Toast.makeText(this, "Вход (пока что заглушка)", Toast.LENGTH_SHORT).show()
        }
    }
}
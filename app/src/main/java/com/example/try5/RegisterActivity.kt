package com.example.try5

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.content.Intent
import android.text.method.PasswordTransformationMethod
import android.text.method.SingleLineTransformationMethod
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val continueButton: Button = findViewById(R.id.continue_button)
        val backButton: ImageButton = findViewById(R.id.back_button)

        val passwordEditText: EditText = findViewById(R.id.password_edit_text)
        val confirmPasswordEditText: EditText = findViewById(R.id.confirm_password_edit_text)
        continueButton.setOnClickListener {
            Toast.makeText(this, "Регистрация (пока что заглушка)", Toast.LENGTH_SHORT).show()
        }
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        var isPasswordVisible = false
        passwordEditText.setOnClickListener {
            if (isPasswordVisible) {
                passwordEditText.transformationMethod = PasswordTransformationMethod.getInstance()
                passwordEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_visibility, 0)
            } else {
                passwordEditText.transformationMethod = SingleLineTransformationMethod.getInstance()
                passwordEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_visibility_off, 0)
            }
            isPasswordVisible = !isPasswordVisible
            passwordEditText.setSelection(passwordEditText.text.length) // Курсор в конец
        }

        var isConfirmPasswordVisible = false
        confirmPasswordEditText.setOnClickListener {
            if (isConfirmPasswordVisible) {
                confirmPasswordEditText.transformationMethod = PasswordTransformationMethod.getInstance()
                confirmPasswordEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_visibility, 0)
            } else {
                confirmPasswordEditText.transformationMethod = SingleLineTransformationMethod.getInstance()
                confirmPasswordEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_visibility_off, 0)
            }
            isConfirmPasswordVisible = !isConfirmPasswordVisible
            confirmPasswordEditText.setSelection(confirmPasswordEditText.text.length)
        }
    }
}
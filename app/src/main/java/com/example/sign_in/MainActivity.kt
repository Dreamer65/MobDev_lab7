package com.example.sign_in

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var usernameText: EditText
    private lateinit var passwordText: EditText
    private lateinit var buttonSign: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val correctUsername = "user1"
        val correctPassword = "password1"

        usernameText = findViewById(R.id.editText)
        passwordText = findViewById(R.id.editText2)
        buttonSign = findViewById(R.id.button)

        buttonSign.setOnClickListener{
            if (usernameText.text.toString() == correctUsername && passwordText.text.toString() == correctPassword) {
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Incorrect credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
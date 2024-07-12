package com.example.foodorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

        var btnSignup = findViewById<Button>(R.id.btnSignup)
        btnSignup.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }


    }
}
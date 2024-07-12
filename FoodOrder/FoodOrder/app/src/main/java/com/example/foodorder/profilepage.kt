package com.example.foodorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profilepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profilepage)

        var pbutton = findViewById<Button>(R.id.pbutton)
        pbutton.setOnClickListener{
            val intent = Intent(this,homepage::class.java)
            startActivity(intent)
        }
    }
}
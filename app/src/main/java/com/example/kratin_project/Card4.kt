package com.example.kratin_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Card4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card4)
        val button1=findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this@Card4, Doctor4::class.java)
            startActivity(intent)
        }
    }
}
package com.example.kratin_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Card1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card1)

       val button1=findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent=Intent(this@Card1,Doctor1::class.java)
            startActivity(intent)
        }

    }
}
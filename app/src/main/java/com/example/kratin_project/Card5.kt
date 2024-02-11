package com.example.kratin_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class Card5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card5)
        val button1=findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this@Card5, Doctor5::class.java)
            startActivity(intent)
        }

        val photo1=findViewById<ImageView>(R.id.photo1)
        photo1.setOnClickListener {
            Toast.makeText(this, "This is : CHICKEN SOUP", Toast.LENGTH_SHORT).show()
        }
        val photo2=findViewById<ImageView>(R.id.photo2)
        photo2.setOnClickListener {
            Toast.makeText(this, "This is : GARLIC", Toast.LENGTH_SHORT).show()
        }
        val photo3=findViewById<ImageView>(R.id.photo3)
        photo3.setOnClickListener {
            Toast.makeText(this, "This is : YOGURT", Toast.LENGTH_SHORT).show()
        }
        val photo4=findViewById<ImageView>(R.id.photo4)
        photo4.setOnClickListener {
            Toast.makeText(this, "This is : OATS", Toast.LENGTH_SHORT).show()
        }
        val photo5=findViewById<ImageView>(R.id.photo5)
        photo5.setOnClickListener {
            Toast.makeText(this, "This is : BROCOLI", Toast.LENGTH_SHORT).show()
        }
        val photo6=findViewById<ImageView>(R.id.photo6)
        photo6.setOnClickListener {
            Toast.makeText(this, "This is : GINGER", Toast.LENGTH_SHORT).show()
        }
        val photo7=findViewById<ImageView>(R.id.photo7)
        photo7.setOnClickListener {
            Toast.makeText(this, "This is : BANANA", Toast.LENGTH_SHORT).show()
        }
    }
}
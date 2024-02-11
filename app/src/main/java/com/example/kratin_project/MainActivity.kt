package com.example.kratin_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val card1=findViewById<CardView>(R.id.card1)
        card1.setOnClickListener {
            val intent=Intent(this@MainActivity,Card1::class.java)
            startActivity(intent)
        }
        val card2=findViewById<CardView>(R.id.card2)
        card2.setOnClickListener {
            val intent=Intent(this@MainActivity,Card2::class.java)
            startActivity(intent)
        }
        val card3=findViewById<CardView>(R.id.card3)
        card3.setOnClickListener {
            val intent=Intent(this@MainActivity,Card3::class.java)
            startActivity(intent)
        }
        val card4=findViewById<CardView>(R.id.card4)
        card4.setOnClickListener {
            val intent=Intent(this@MainActivity,Card4::class.java)
            startActivity(intent)
        }
        val card5=findViewById<CardView>(R.id.card5)
        card5.setOnClickListener {
            val intent=Intent(this@MainActivity,Card5::class.java)
            startActivity(intent)
        }
        val card6=findViewById<CardView>(R.id.card6)
        card6.setOnClickListener {
            val intent=Intent(this@MainActivity,Card6::class.java)
            startActivity(intent)
        }

    }
}
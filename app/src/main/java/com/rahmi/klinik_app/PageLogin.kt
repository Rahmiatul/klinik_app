package com.rahmi.klinik_app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogin : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)

        val button = findViewById<Button>(R.id.button2)

        val txtsign = findViewById<TextView>(R.id.txtsign)

        button.setOnClickListener {
            // Membuat Intent untuk membuka Activity kedua
            val intent = Intent(this, doctorpage::class.java)
            startActivity(intent)
        }

        txtsign.setOnClickListener {
            // Membuat Intent untuk membuka Activity kedua
            val intent = Intent(this, PageRegister::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
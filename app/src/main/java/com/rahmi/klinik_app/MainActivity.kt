package com.rahmi.klinik_app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //spalsh screen
        //untuk delay beberapa detik, kemudian pindah otomatis ke page berikutnya
        Handler(Looper.getMainLooper()).postDelayed({
            //untuk pindah ke page berikutnya
            val intent = Intent(this, StaterPageActivity::class.java)
            startActivity(intent)
            finish() //kill the activity
        }, 3000)

        //TASK :
        //Splash Screen
        //PADA PAGE START SCREEN 2 --> klik button Get Started akan pindah ke page login
        //Pada page login, ketika klik tulisan did not have account --> pindah

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
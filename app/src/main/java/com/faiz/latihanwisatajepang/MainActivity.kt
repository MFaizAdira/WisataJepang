package com.faiz.latihanwisatajepang

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnDetail : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDetail = findViewById(R.id.btnDetail)

        btnDetail.setOnClickListener(){
            val intent = Intent(this, gallery::class.java)
            startActivity(intent)
        }
    }
}

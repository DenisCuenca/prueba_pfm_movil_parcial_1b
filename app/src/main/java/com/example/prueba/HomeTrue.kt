package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeTrue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_true)
        llamaFOTOS()
    }


    fun llamaFOTOS() {
        val ft = findViewById<Button>(R.id.btnfotos)

        ft.setOnClickListener() {

            val saltar: Intent = Intent(this, Fotos::class.java)
            startActivity(saltar)
        }
    }
}
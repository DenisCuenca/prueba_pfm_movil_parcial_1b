package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fotos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fotos)
        llamareg()
    }

    fun llamareg() {
        val reg = findViewById<Button>(R.id.idregresar)

        reg.setOnClickListener() {

            val saltar: Intent = Intent(this, HomeTrue::class.java)
            startActivity(saltar)
        }
    }
}
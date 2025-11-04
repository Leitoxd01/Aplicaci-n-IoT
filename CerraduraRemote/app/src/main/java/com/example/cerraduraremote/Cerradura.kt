package com.example.cerraduraremote

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Cerradura : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerradura)

        val txtNombre = findViewById<TextView>(R.id.txtNombreCerradura)
        val btnAbrir = findViewById<Button>(R.id.btnAbrir)
        val btnCerrar = findViewById<Button>(R.id.btnCerrar)
        val btnVolver = findViewById<Button>(R.id.btnVolver)

        val nombre = intent.getStringExtra("nombreCerradura")
        txtNombre.text = nombre

        btnAbrir.setOnClickListener {
            Toast.makeText(this, "$nombre abierta", Toast.LENGTH_SHORT).show()
        }

        btnCerrar.setOnClickListener {
            Toast.makeText(this, "$nombre cerrada", Toast.LENGTH_SHORT).show()
        }

        btnVolver.setOnClickListener {
            finish()
        }
    }
}
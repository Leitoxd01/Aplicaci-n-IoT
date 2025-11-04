package com.example.cerraduraremote

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
class Buscar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar)

        val btnVolver = findViewById<Button>(R.id.btnVolver)
        val listView = findViewById<ListView>(R.id.listViewEncontrados)

        val dispositivosEncontrados = listOf(
            "Sensor temperatura - Cocina",
            "Cámara IP - Entrada",
            "Luz inteligente - Sala",
            "Cerradura electrónica - Garaje"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dispositivosEncontrados)
        listView.adapter = adapter

        btnVolver.setOnClickListener {
            finish() // regresa al Home
        }
    }
}
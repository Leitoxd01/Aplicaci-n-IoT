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
            "Cerradura Ventana - Cocina",
            "Alarma - Patio",
            "Luz Inteligente - Sala",
            "Cerradura electrónica - Garaje",
            "Sensor de Movimiento - Patio",
            "Sensor de Temperatura - Cocina"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dispositivosEncontrados)
        listView.adapter = adapter

        btnVolver.setOnClickListener {
            finish()
        }
    }
}
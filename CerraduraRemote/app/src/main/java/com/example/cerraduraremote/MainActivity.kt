package com.example.cerraduraremote

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtBienvenido = findViewById<TextView>(R.id.txtBienvenido)
        val btnBuscar = findViewById<Button>(R.id.btnBuscar)
        val listView = findViewById<ListView>(R.id.listViewDispositivos)

        val usuario = intent.getStringExtra("usuario") ?: "Usuario"
        txtBienvenido.text = "Bienvenido, $usuario"

        // Lista de dispositivos conectados
        val dispositivosConectados = listOf("Cerradura entrada", "Cerradura trasera")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dispositivosConectados)
        listView.adapter = adapter

        // Al tocar un dispositivo, abre la pantalla de control
        listView.setOnItemClickListener { _, _, position, _ ->
            val nombre = dispositivosConectados[position]
            val intent = Intent(this, Cerradura::class.java)
            intent.putExtra("nombreCerradura", nombre)
            startActivity(intent)
        }

        // Botón para buscar nuevos dispositivos
        btnBuscar.setOnClickListener {
            startActivity(Intent(this, Buscar::class.java))
        }
    }
}
package com.example.cerraduraremote

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val txtUsuario = findViewById<EditText>(R.id.txtUsuarioReg)
        val txtContrasena = findViewById<EditText>(R.id.txtContrasenaReg)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        btnRegistrar.setOnClickListener {
            val usuario = txtUsuario.text.toString()
            val contrasena = txtContrasena.text.toString()

            if (usuario.isEmpty() || contrasena.isEmpty()) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                // Simulación (sin guardar datos)
                Toast.makeText(this, "Usuario registrado correctamente", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}
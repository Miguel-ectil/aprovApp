package com.example.aprovapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNota1 = findViewById<EditText>(R.id.edtNota1)
        val edtNota2 = findViewById<EditText>(R.id.edtNota2)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnCalcular.setOnClickListener {
            val nota1 = edtNota1.text.toString().toFloatOrNull()
            val nota2 = edtNota2.text.toString().toFloatOrNull()

            if (nota1 == null || nota2 == null) {
                txtResultado.text = "Por favor, insira notas válidas."
                return@setOnClickListener
            }

            val media = (nota1 + nota2) / 2

            val status = when {
                media < 4 -> "Reprovado 😞"
                media >= 4 && media < 6 -> "Prova Substitutiva 😐"
                else -> "Aprovado 🎉"
            }

            txtResultado.text = "Média: $media\nSituação: $status"
        }
    }
}

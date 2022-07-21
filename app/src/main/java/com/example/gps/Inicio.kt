package com.example.gps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.gps.MainActivity
import kotlinx.android.synthetic.main.activity_inicio.*

class Inicio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
      val btnUsuario = findViewById<Button>(R.id.btnUsuario)
        btnUsuario.setOnClickListener {
            val lanzar = Intent(this,MainActivity::class.java)
            startActivity(lanzar)

            val btnservicio =findViewById<Button>(R.id.btnServicio)
            btnservicio.setOnClickListener {
                val lanzar1 = Intent(this,Registro::class.java)
                startActivity(lanzar1)
            }
        }

        }
    }

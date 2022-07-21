package com.example.gps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {
    lateinit var autentication:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        autentication = FirebaseAuth.getInstance()

    }
    override fun  onStart(){
        super.onStart()
        val user:FirebaseUser? = autentication.currentUser
        if (user==null){

        }else{

        }
        fun login(){
            val correo:String = findViewById<EditText>(R.id.etCorreo).toString()
            val password:String = findViewById<EditText>(R.id.etPassword).toString()
            autentication.signInWithEmailAndPassword(correo,password).addOnCompleteListener {
                if (it.isSuccessful){

                }
                else{

                }
            }
        }


        btnLogin.setOnClickListener {
            val username = etCorreo.text.toString().trim()
            val password = etPassword.text.toString().trim()
            if (username.isEmpty()) {
                etCorreo.error = "Introduce un usuario"
                etCorreo.requestFocus()
            } else if (password.isEmpty()) {
                etPassword.error = "Introduce tu password"
                etPassword.requestFocus()
            } else {
            }

        }
    }
}
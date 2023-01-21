package com.algawas.databaseproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/*
The welcome Page:

First page is welcome page that ask the user to choose between login or register.

Abstract:
Welcome page contains text view (Welcome message) and two buttons (Login, Register)

*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login()
        register()
    }

    private fun login(){
        val logIn = findViewById<Button>(R.id.login)
        logIn.setOnClickListener{
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)
        }
    }

    private fun register(){
        val register = findViewById<Button>(R.id.register)
        register.setOnClickListener{
            val intent = Intent(applicationContext, Register::class.java)
            startActivity(intent)
        }
    }
}
package com.anye.notaspromedio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Iniciarcomponentes()
    }

    private fun Iniciarcomponentes(){
        val  btnRegistrar: Button= findViewById(R.id.registrar)
        val btnEstadistica: Button=findViewById(R.id.estadistica)
        val btnManual:Button=findViewById(R.id.manual)

        btnRegistrar.setOnClickListener { (onClick(1)) }
        btnEstadistica.setOnClickListener{(onClick(2))}
        btnManual.setOnClickListener{(onClick(3))}
    }
    private fun onClick(newButton: Int) {
        when (newButton) {
            1 -> startActivity(Intent(this, Registrar::class.java))
            2 -> startActivity(Intent(this,Estadistica::class.java))
            3->startActivity(Intent(this,Manual::class.java))
        }
    }
}
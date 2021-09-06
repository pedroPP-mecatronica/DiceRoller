package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (supportActionBar != null)
            supportActionBar!!.hide()
        val btnHelloWord: Button = findViewById(R.id.btnAlterar)
        btnHelloWord.setOnClickListener { alterar() }
    }

    private fun alterar() {
        //Toast.makeText(this,"Clique em Salvar",Toast.LENGTH_LONG)
        val randomInt = (1..6).random()
        val result: TextView = findViewById(R.id.textResult)
        result.text = randomInt.toString()
    }
}
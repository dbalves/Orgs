package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TextView(this)
        //view.setText("cesta de frutass")
        setContentView(R.layout.activity_main)
        /*val nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de frutas"
        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja, manga e limão"
        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "19,99"*/
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = ListaProdutosAdapter()

    }
}
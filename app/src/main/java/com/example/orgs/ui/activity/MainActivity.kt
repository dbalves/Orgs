package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

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
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(
                nome = "teste",
                descricao = "teste desc",
                valor = BigDecimal("19.99")
            ),Produto(
                nome = "teste 2",
                descricao = "teste desc 2",
                valor = BigDecimal("18.99")
            ),Produto(
                nome = "teste 3",
                descricao = "teste desc 3",
                valor = BigDecimal("1.99")
            ),
        ))
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
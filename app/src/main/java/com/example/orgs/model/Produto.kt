package com.example.orgs.model

import java.math.BigDecimal

abstract class Produto {
    val nome: String,
    val descricao: String,
    abstract val valor: BigDecimal

}

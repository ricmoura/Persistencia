package br.com.moura.ricardo.persistencia.model

import android.arch.persistence.room.Entity

@Entity(tableName = "")
data class Game(
        var id: Int,
        var nome: String,
        var genero: String
)
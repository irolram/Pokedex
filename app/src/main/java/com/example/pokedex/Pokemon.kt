package com.example.pokedex

import androidx.annotation.DrawableRes

data class Pokemon(
    val nombre: String,
    val tipo1: Tipo,
    val tipo2: Tipo? = null,
    val habilidades: List<String> = emptyList(),
    @DrawableRes val sprite: Int
)

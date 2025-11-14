package com.example.pokedex

import androidx.annotation.DrawableRes

data class Pokemon(
    val Nombre: String,
    val Tipo1: String,
    val Tipo2: String,
    @DrawableRes var Sprite: Int
)

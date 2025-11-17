package com.example.pokedex

import androidx.annotation.DrawableRes

data class Pokemon(
    val nombre: String,
    val tipo1: String,
    val tipo2: String,
    @DrawableRes var sprite: Int
)

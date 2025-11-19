package com.example.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val listaPokemon = getPokemon()
            val navController = rememberNavController()

            NavHost(navController, startDestination = "menu") {
                composable("menu") { MenuPokedex(navController) }
                composable("lista") { PokemonList(listaPokemon) }
                composable("grid") { PokemonGrid(listaPokemon) }
                composable("agrupada") { PokemonAgrupadoPorTipo(listaPokemon) }
            }
        }
    }
}



package com.example.pokedex

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun PokemonAgrupadoPorTipo(lista: List<Pokemon>) {
    var selectedPokemon by remember { mutableStateOf<Pokemon?>(null) }

    val listaExtendida = lista.flatMap { pokemon ->
        val tipos = listOf(pokemon.tipo1) + listOfNotNull(pokemon.tipo2)
        tipos.map { tipo -> tipo to pokemon }
    }
    val pokemonPorTipo = listaExtendida.groupBy { it.first }

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        pokemonPorTipo.forEach { (tipo, listaDePares) ->
            stickyHeader {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(tipo.color)
                        .padding(12.dp)
                ) {
                    Text(tipo.name.capitalize(), fontSize = 20.sp, color = Color.White)
                }
            }
            items(listaDePares, key = { "${it.second.nombre}-${it.first}" }) { par ->
                PokemonFilaItem(par.second) { selectedPokemon = it }
            }
        }
    }

    selectedPokemon?.let {
        PokemonDetailDialog(pokemon = it, onDismiss = { selectedPokemon = null })
    }
}


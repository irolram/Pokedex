package com.example.pokedex

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PokemonList(lista: List<Pokemon>) {
    var selectedPokemon by remember { mutableStateOf<Pokemon?>(null) }

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(lista) { pokemon ->
            PokemonFilaItem(pokemon) { selectedPokemon = it }
        }
    }

    selectedPokemon?.let {
        PokemonDetailDialog(pokemon = it, onDismiss = { selectedPokemon = null})
    }
}

@Composable
fun PokemonFilaItem(pokemon: Pokemon, onClick: (Pokemon) -> Unit = {}) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
            .padding(8.dp)
            .clickable { onClick(pokemon) },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = pokemon.sprite),
            contentDescription = pokemon.nombre,
            modifier = Modifier.size(50.dp)
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Text(pokemon.nombre, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(pokemon.tipo1.name.capitalize(), fontSize = 12.sp)
            pokemon.tipo2?.let { Text(it.name.capitalize(), fontSize = 12.sp) }
            if (pokemon.habilidades.isNotEmpty()) {
                Text("Habilidades: ${pokemon.habilidades.joinToString(", ")}", fontSize = 12.sp)
            }
        }
    }
}
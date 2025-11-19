package com.example.pokedex

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




// Tarjeta de cada Pokémon
@Composable
fun PokemonCardItem(pokemon: Pokemon, onClick: (Pokemon) -> Unit = {}) {
    Card(
        modifier = Modifier
            .padding(4.dp)
            .size(width = 120.dp, height = 150.dp)
            .clickable { onClick(pokemon) }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = pokemon.sprite),
                contentDescription = pokemon.nombre,
                modifier = Modifier.size(50.dp))
            Spacer(modifier = Modifier.height(4.dp))
            Text(pokemon.nombre, fontSize = 14.sp)
            Text(pokemon.tipo1.name.replaceFirstChar { it.uppercase() }, fontSize = 12.sp)
            pokemon.tipo2?.let { Text(it.name.replaceFirstChar { c -> c.uppercase() }, fontSize = 12.sp) }
        }
    }
}

// Grid de Pokémon
@Composable
fun PokemonGrid(lista: List<Pokemon>) {
    var selectedPokemon by remember { mutableStateOf<Pokemon?>(null) }

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(lista) { pokemon ->
            PokemonCardItem(pokemon) { selectedPokemon = it }
        }
    }

    selectedPokemon?.let {
        PokemonDetailDialog(pokemon = it, onDismiss = { selectedPokemon = null })
    }
}


// Preview
@Preview(showBackground = true)
@Composable
fun PreviewPokemonCardItem() {
    PokemonCardItem(
        Pokemon(
            nombre = "Shellos",
            tipo1 = Tipo.AGUA,
            sprite = R.drawable.shellos
        )
    )
}

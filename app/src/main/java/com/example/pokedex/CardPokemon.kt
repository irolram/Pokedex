package com.example.pokedex

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PokemonCardItem(pokemon:Pokemon){

    Card(modifier = Modifier
        .padding(4.dp)               // separa las tarjetas entre sí
        .size(width = 120.dp, height = 150.dp)) {
        Column(modifier = Modifier
            .fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {


            Image(painter = painterResource(id = pokemon.sprite),
                contentDescription = pokemon.nombre
                ,modifier = Modifier.size(25.dp))

            Text(pokemon.nombre,
                fontSize = 14.sp)

            Text(pokemon.tipo1,
                fontSize = 14.sp)

            if (pokemon.tipo2.isNotEmpty()) {
                Text(
                    text = pokemon.tipo2,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Composable
fun PokemonGrid(lista: List<Pokemon>){

    LazyVerticalGrid(columns = GridCells.Fixed(3), modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp)) {

        items(lista){ pokemon ->
            PokemonCardItem(pokemon)
        }
    }

}

@Preview
@Composable
fun previewPokemonCardItem(){
    PokemonCardItem(Pokemon("Shellos", "Agua","", R.drawable.shellos),
    )
}
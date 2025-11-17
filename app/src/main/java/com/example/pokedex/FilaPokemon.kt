package com.example.pokedex

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PokemonList(lista: List<Pokemon>){

    LazyColumn(modifier = Modifier.fillMaxSize()
    ) {
        items(lista) { pokemon ->
            PokemonFilaItem(pokemon)
        }
    }

}


@Composable
fun PokemonFilaItem(pokemon: Pokemon){

    Card(modifier = Modifier.padding(8.dp,vertical = 4.dp).fillMaxSize()) {

        Row(modifier = Modifier
            .padding(8.dp),                       // padding interno
            verticalAlignment = Alignment.CenterVertically) {

            Image(painter = painterResource(id = pokemon.sprite),
                contentDescription = pokemon.nombre
                ,modifier = Modifier.size(15.dp)
            )
            Spacer(modifier = Modifier.width(8.dp)) // espacio entre imagen y textos

            Text(
                text = pokemon.nombre,
                fontSize = 10.sp
            )

            Spacer(modifier = Modifier.width(8.dp)) // espacio entre nombre y tipos

            Text(
                text = pokemon.tipo1,
                fontSize = 10.sp
            )

            Spacer(modifier = Modifier.width(4.dp)) // pequeño espacio entre tipo1 y tipo2
            Text(
                text = pokemon.tipo2,
                fontSize = 10.sp
                )
            }
        }
    }

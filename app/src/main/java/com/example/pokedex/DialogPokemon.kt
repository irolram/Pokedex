package com.example.pokedex

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun PokemonDetailDialog(pokemon: Pokemon, onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(pokemon.nombre) },
        text = {
            Column {
                Image(
                    painter = painterResource(id = pokemon.sprite),
                    contentDescription = pokemon.nombre,
                    modifier = Modifier.size(150.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text("Tipo: ${pokemon.tipo1.name}${pokemon.tipo2?.let { "/${it.name}" } ?: ""}")
                if (pokemon.habilidades.isNotEmpty()) {
                    Text("Habilidades: ${pokemon.habilidades.joinToString(", ")}")
                }
            }
        },
        confirmButton = {
            Button(onClick = onDismiss) {
                Text("Cerrar")
            }
        }
    )
}

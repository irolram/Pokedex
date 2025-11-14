package com.example.pokedex

import androidx.compose.runtime.Composable

@Composable

fun getPokemon():List<Pokemon>{

    return listOf(
        Pokemon("Chimchar", "Fuego","",R.drawable.chimchar),
        Pokemon("Monferno","Fuego", "Lucha",R.drawable.monferno),
        Pokemon("Infernape", "Fuego", "Lucha",R.drawable.infernape),
        Pokemon("Staraptor", "Normal","Volador",R.drawable.staraptor),
        Pokemon("Kriketot", "Bicho","",R.drawable.kricketot),
        Pokemon("Kriketune", "Bicho","",R.drawable.kricketune),
        Pokemon("Cranidos", "Roca", "",R.drawable.cranidos),
        Pokemon("Burmy","Bicho", "",R.drawable.burmy ),
        Pokemon("Mothim", "Bicho","Volador",R.drawable.mothim),
        Pokemon("Shellos", "Agua","", R.drawable.shellos),
        Pokemon("Gastrodom", "Agua", "Tierra",R.drawable.gastrodon),
        Pokemon("Chingling", "Psiquico","",R.drawable.chingling),
        Pokemon("Bonsly", "Roca","",R.drawable.bonsly),
        Pokemon("Chatot", "Normal", "Volador",R.drawable.chatot ),
        Pokemon("Gible","Tierra", "Dragon",R.drawable.gible),
        Pokemon("Lucario", "Lucha","Acero",R.drawable.lucario),
        Pokemon("Weavile", "Siniestro", "Hielo",R.drawable.weavile),
        Pokemon("Togekiss", "Volador", "Hada",R.drawable.togekiss),
        Pokemon("Glaceon","Hielo","",R.drawable.glaceon),
        Pokemon("Gliscor","Tierra", "Volador",R.drawable.gliscor),
        Pokemon("Gallade","Lucha","Psiquico",R.drawable.gallade),
        Pokemon("Froslass","Hielo","Fantasma",R.drawable.froslass),
        Pokemon("Mesprit","Psiquico", "",R.drawable.mesprit),
        Pokemon("Dialga", "Acero", "Dragon",R.drawable.dialga),
        Pokemon("Darkrai","Siniestro","",R.drawable.darkrai)



    )
}
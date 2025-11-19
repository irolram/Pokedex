package com.example.pokedex



fun getPokemon(): List<Pokemon> {
    return listOf(
        Pokemon("Chimchar", Tipo.FUEGO, habilidades = listOf("Bola de fuego"), sprite = R.drawable.chimchar),
        Pokemon("Monferno", Tipo.FUEGO, Tipo.LUCHA, listOf("Puño fuego", "Patada alta"), R.drawable.monferno),
        Pokemon("Infernape", Tipo.FUEGO, Tipo.LUCHA, listOf("Llamarada", "Puño fuego"), R.drawable.infernape),
        Pokemon("Staraptor", Tipo.NORMAL, Tipo.VOLADOR, listOf("Pico taladro"), R.drawable.staraptor),
        Pokemon("Kriketot", Tipo.BICHO, habilidades = listOf("Rasgueo"), sprite = R.drawable.kricketot),
        Pokemon("Kriketune", Tipo.BICHO, habilidades = listOf("Rasgueo fuerte"), sprite = R.drawable.kricketune),
        Pokemon("Cranidos", Tipo.ROCA, habilidades = listOf("Cabeza dura"), sprite = R.drawable.cranidos),
        Pokemon("Burmy", Tipo.BICHO, habilidades = listOf("Manto"), sprite = R.drawable.burmy),
        Pokemon("Mothim", Tipo.BICHO, Tipo.VOLADOR, listOf("Polvo veneno"), R.drawable.mothim),
        Pokemon("Shellos", Tipo.AGUA, habilidades = listOf("Lodo"), sprite = R.drawable.shellos),
        Pokemon("Gastrodon", Tipo.AGUA, Tipo.TIERRA, listOf("Manto de arena"), R.drawable.gastrodon),
        Pokemon("Chingling", Tipo.PSIQUICO, habilidades = listOf("Tono"), sprite = R.drawable.chingling),
        Pokemon("Bonsly", Tipo.ROCA, habilidades = listOf("Finta"), sprite = R.drawable.bonsly),
        Pokemon("Chatot", Tipo.NORMAL, Tipo.VOLADOR, listOf("Canto"), R.drawable.chatot),
        Pokemon("Gible", Tipo.TIERRA, Tipo.DRAGON, listOf("Mordisco"), R.drawable.gible),
        Pokemon("Lucario", Tipo.LUCHA, Tipo.ACERO, listOf("Puño aura"), R.drawable.lucario),
        Pokemon("Weavile", Tipo.SINIESTRO, Tipo.HIELO, listOf("Garra"), R.drawable.weavile),
        Pokemon("Togekiss", Tipo.VOLADOR, Tipo.HADA, listOf("Danza"), R.drawable.togekiss),
        Pokemon("Leafeon", Tipo.PLANTA, habilidades = listOf("Manto niveo"), sprite = R.drawable.leafeon),
        Pokemon("Glaceon", Tipo.HIELO, habilidades = listOf("Rayo hielo"), sprite = R.drawable.glaceon),
        Pokemon("Gliscor", Tipo.TIERRA, Tipo.VOLADOR, listOf("Ala tajo"), R.drawable.gliscor),
        Pokemon("Gallade", Tipo.LUCHA, Tipo.PSIQUICO, listOf("Hoja certera"), R.drawable.gallade),
        Pokemon("Froslass", Tipo.HIELO, Tipo.FANTASMA, listOf("Ventisca"), R.drawable.froslass),
        Pokemon("Mesprit", Tipo.PSIQUICO, habilidades = listOf("Telequinesis"), sprite = R.drawable.mesprit),
        Pokemon("Dialga", Tipo.ACERO, Tipo.DRAGON, listOf("Aliento temporal"), R.drawable.dialga),
        Pokemon("Darkrai", Tipo.SINIESTRO, habilidades = listOf("Pesadilla"), sprite = R.drawable.darkrai)
    )
}







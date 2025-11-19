package com.example.pokedex
import androidx.compose.ui.graphics.Color

enum class Tipo(val color: Color) {
    FUEGO(Color(0xFFFF7043)),
    AGUA(Color(0xFF42A5F5)),
    PLANTA(Color(0xFF66BB6A)),
    TIERRA(Color(0xFFA1887F)),
    HIELO(Color(0xFF80DEEA)),
    BICHO(Color(0xFFAED581)),
    SINIESTRO(Color(0xFF616161)),
    VOLADOR(Color(0xFF90CAF9)),
    HADA(Color(0xFFF48FB1)),
    LUCHA(Color(0xFFE57373)),
    ACERO(Color(0xFFB0BEC5)),
    PSIQUICO(Color(0xFFBA68C8)),
    DRAGON(Color(0xFF9575CD)),
    ROCA(Color(0xFFBDB76B)),       // Marrón claro similar a piedra
    FANTASMA(Color(0xFF7B68EE)),   // Púrpura fantasma
    NORMAL(Color(0xFFA8A878))      // Gris claro para Normal
}


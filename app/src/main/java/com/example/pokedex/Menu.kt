package com.example.pokedex

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MenuPokedex(navController: NavController) {

    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(R.drawable.fondo),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text("Pokedex Nacional 4ºGen", modifier = Modifier, fontSize = 20.sp, fontWeight = FontWeight.Bold)

        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(onClick = { navController.navigate("lista") },
                colors = ButtonDefaults.buttonColors(containerColor =Color(0xFFEF5350))) {
                Text("Lista")
            }
            Button(onClick = { navController.navigate("grid")},
                colors = ButtonDefaults.buttonColors(containerColor =Color(0xFFFFCA28))) {
                Text("Grid")
            }
            Button(onClick = { navController.navigate("agrupada") },
                colors = ButtonDefaults.buttonColors(containerColor =Color(0xFF42A5F5))) {
                Text("Agrupada por tipo")
            }
        }
    }

}






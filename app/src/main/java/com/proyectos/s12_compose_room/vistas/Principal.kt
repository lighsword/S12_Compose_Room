package com.proyectos.s12_compose_room.vistas


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun App() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Espacio a llenar",
            fontSize = 30.sp,
            modifier = Modifier
                .padding(top = 15.dp)
                .width(367.dp)
                .background(Color.Yellow)
                .align(Alignment.CenterHorizontally)
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(top = 600.dp,
                        start = 300.dp)
                .size(70.dp)
        ) {
            Text(
                text = "+",
                fontSize = 45.sp
            )
        }
    }
}


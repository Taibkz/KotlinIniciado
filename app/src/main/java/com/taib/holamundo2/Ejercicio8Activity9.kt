package com.taib.holamundo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.taib.holamundo2.ui.theme.HolaMundo2Theme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

class Ejercicio8Activity9 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HolaMundo2Theme {
                Temporizador()
            }
        }
    }
}

@Composable
fun Temporizador(){
    var tiempo by remember { mutableStateOf(10) }
    var activo by remember { mutableStateOf(false) }

    LaunchedEffect(activo) {
        while (activo && tiempo > 0) {
            delay(1000)
            tiempo--
        }
        if (tiempo == 0) {
            activo = false
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "$tiempo",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = if (tiempo <= 3) Color.Red else Color.Black
        )

        Spacer(modifier = Modifier.height(32.dp))

        Row {
            Button(
                onClick = { activo = !activo }
            ) {
                Text(if (activo) "Pausar" else "Iniciar")
            }

            Spacer(modifier = Modifier.width(16.dp))

            Button(
                onClick = {
                    tiempo = 10
                    activo = false
                }
            ) {
                Text("Reiniciar")
            }
        }
    }
}
package com.taib.holamundo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.taib.holamundo2.ui.theme.HolaMundo2Theme

class Ejercicio5Activity6 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HolaMundo2Theme {
                ListaTareas()
            }
        }
    }
}

@Composable
fun ListaTareas(){
    val tareas= listOf(
        "Aprender Compose",
        "Crear mi primera app",
        "Practicar con layouts",
        "Implementar navegación",
        "Añadir animaciones"
        )
    Column(
        modifier=Modifier.fillMaxSize()
    ){
        Text(
            text = "Mis Tareas",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        LazyColumn {
            items(tareas) { tarea ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text(
                        text = tarea,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }

    }
}
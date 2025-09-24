package com.taib.holamundo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MessageCard(msg = Message("Android", "Jetpack Compose"))
        }
    }
}

data class Message(val author:String,val body: String)
//
//@Composable
//fun MessageCard(msg: Message){
//    Text(text = msg.author)
//    Text(text = msg.body)
//}
//
//@Preview
//@Composable
//fun PreviewMessageCard() {
//    MessageCard(
//        msg = Message("Li7uak", "Li7uak 7wito wf tabon mok 7shito")
//    )
//}

@Composable
fun MessageCard(msg: Message) {
    Row {
        Image(
            painter = painterResource(R.drawable.imagen),
            contentDescription = "Contact profile picture",
        )

        Column {
            Text(text = msg.author)
            Text(text = msg.body)
        }

    }

}
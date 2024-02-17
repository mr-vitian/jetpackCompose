package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Saurabh", "Jetpack compose is Great"))
        }
    }
}

data class Message(val author : String, val body : String)

    @Composable
    fun MessageCard(message : Message) {

        Row (modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.ic_android_black_24dp),
                contentDescription = "Profile Photo",
                modifier = Modifier.size(50.dp).clip(CircleShape))


            Column {
                Text(message.author)
                Text(text = message.body, color = Color.Cyan)

            }
        }

    }

    @Preview
    @Composable
    fun MessageCard(){

            MessageCard(Message("Saurabh", "Jetpack compose is Great"))

    }



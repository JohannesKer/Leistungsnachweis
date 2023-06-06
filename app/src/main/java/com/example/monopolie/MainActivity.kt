package com.example.monopolie

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.monopolie.ui.theme.MonopolieTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun Startseite (name: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier= Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ){


        Text(
            text = "Monopolie",
            color = Color.Black,
            fontSize = 50.sp,

            )
        Text(
            text = "Spielerzahl:",
            color = Color.Gray,
            fontSize = 20.sp,
        )
        Image(
            painter = painterResource(id = R.drawable.spielericon),
            contentDescription = null,

        )
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = null,
        )
        Icon(
            imageVector = Icons.Default.Delete,
            contentDescription = null
        )
    }
}

@Composable
fun Transaktionsmenue(name: String, modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ) {
        Text(
            text = "Transaktionsmenue:",
            color = Color.Black,
            fontSize = 50.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    
    Startseite("Admin")
    
}
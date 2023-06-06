package com.example.monopolie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

class StartSeite : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var count by remember{ //Countervariable
                mutableStateOf(0) //Countervariable mit 0 Dekladiert
            }
            Column(
                modifier= Modifier
                    .fillMaxSize() //Kompleter Space wird genutzt
                    .background(Color.Yellow), //Hintergrund ist Gelb
                verticalArrangement = Arrangement.Center, //
                horizontalAlignment = Alignment.CenterHorizontally,

                ){
                Text(
                    text= "Monopolie!", //Überschrift
                    fontSize = 80.sp
                )

                Text(
                    text = count.toString(),
                    fontSize = 70.sp // Größer der Counter Zahl
                )
                Button(onClick = {
                    count++ // Wird erhöht
                }){
                    Text(text= "Spielerzahl erhöhen")
                }
                Button(onClick = {
                    count-- // Wird verringert
                }){
                    Text(text = "Spielerzahl veringern")
                }
                Button(onClick = {

                }) {
                    Text(text = "Starten!") // Button zum Starten ist vorbereitet

                }

            }
        }

    }
}
